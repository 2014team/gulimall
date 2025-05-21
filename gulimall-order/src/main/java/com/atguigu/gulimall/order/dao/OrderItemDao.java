package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zhuzq
 * @email zzeqing93@gmail.com
 * @date 2025-02-13 23:46:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
