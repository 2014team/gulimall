package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhuzq
 * @email zzeqing93@gmail.com
 * @date 2025-02-13 23:06:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
