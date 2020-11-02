package com.luohz.tuantuan.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohz.common.utils.PageUtils;
import com.luohz.tuantuan.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 18:57:52
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

