package com.mimehoo.mall.product.dao;

import com.mimehoo.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:46:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
