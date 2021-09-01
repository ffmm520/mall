package com.mimehoo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimehoo.common.utils.PageUtils;
import com.mimehoo.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:42:28
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

