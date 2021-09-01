package com.mimehoo.mall.order.dao;

import com.mimehoo.mall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 15:23:28
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
