package com.luohz.tuantuan.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohz.common.utils.PageUtils;
import com.luohz.tuantuan.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:15:22
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

