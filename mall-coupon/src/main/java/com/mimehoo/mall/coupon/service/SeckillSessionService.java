package com.mimehoo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimehoo.common.utils.PageUtils;
import com.mimehoo.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:44:42
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

