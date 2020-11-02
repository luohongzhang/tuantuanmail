package com.luohz.tuantuan.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohz.common.utils.PageUtils;
import com.luohz.tuantuan.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:15:22
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

