package com.luohz.tuantuan.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohz.common.utils.PageUtils;
import com.luohz.tuantuan.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:12:33
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

