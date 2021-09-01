package com.mimehoo.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimehoo.common.utils.PageUtils;
import com.mimehoo.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:40:18
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

