package com.luohz.tuantuan.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohz.common.utils.PageUtils;
import com.luohz.tuantuan.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 18:54:03
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

