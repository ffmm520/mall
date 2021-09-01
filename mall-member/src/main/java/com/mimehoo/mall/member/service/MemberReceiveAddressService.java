package com.mimehoo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimehoo.common.utils.PageUtils;
import com.mimehoo.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author baboon
 * @email ffmm1220@gmail.com
 * @date 2021-09-01 16:42:28
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

