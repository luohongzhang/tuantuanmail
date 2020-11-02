package com.luohz.tuantuan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohz.common.utils.PageUtils;
import com.luohz.tuantuan.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 18:57:52
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

