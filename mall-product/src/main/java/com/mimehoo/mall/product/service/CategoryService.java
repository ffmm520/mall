package com.mimehoo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimehoo.common.utils.PageUtils;
import com.mimehoo.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:46:54
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

