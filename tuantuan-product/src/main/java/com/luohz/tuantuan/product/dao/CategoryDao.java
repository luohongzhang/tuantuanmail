package com.luohz.tuantuan.product.dao;

import com.luohz.tuantuan.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 18:57:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
