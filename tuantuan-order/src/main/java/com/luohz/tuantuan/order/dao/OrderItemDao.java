package com.luohz.tuantuan.order.dao;

import com.luohz.tuantuan.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:12:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
