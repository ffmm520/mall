package com.mimehoo.mall.member.dao;

import com.mimehoo.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:42:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
