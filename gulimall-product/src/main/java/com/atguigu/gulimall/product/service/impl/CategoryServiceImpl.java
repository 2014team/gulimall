package com.atguigu.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {



    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1、查询所有分类


        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2、组装成父子的树形结构

        return entities.stream().filter(categoryEntity ->
             categoryEntity.getParentCid() == 0
        ).map((menu) ->{
            menu.setChildren(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1,menu2) -> {
            return  (null != menu1.getSort()  ? menu1.getSort() : 0) -
                (null!=menu2.getSort()? menu2.getSort() : 0 );
        }).toList();
    }


    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all) {
        return all.stream().filter(categoryEntity ->
                categoryEntity.getParentCid().equals(root.getCatId()))
                .map(menu ->{
                    // 1、查找子菜单
                    menu.setChildren(getChildrens(menu,all));
                    return menu;
                    //2、菜单排序
                }).sorted((menu1,menu2) -> {
                    return  (null != menu1.getSort()  ? menu1.getSort() : 0) -
                            (null!=menu2.getSort()? menu2.getSort() : 0 );
                }).toList();
    }

}