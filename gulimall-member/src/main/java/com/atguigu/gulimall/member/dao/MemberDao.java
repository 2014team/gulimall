package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhuzq
 * @email zzeqing93@gmail.com
 * @date 2025-02-13 23:35:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
