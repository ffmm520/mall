package com.mimehoo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimehoo.common.utils.PageUtils;
import com.mimehoo.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:46:54
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

