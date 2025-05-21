package com.atguigu.gulimall.product;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity bandEntity = new BrandEntity();
//
//        bandEntity.setName("华为");
//
//        brandService.save(bandEntity);
//
//        System.out.println("保存成功");



        PageUtils pageUtils =  brandService.queryPage(new HashMap<>());


     

    }

}
