package com.luohz.tuantuan.order.dao;

import com.luohz.tuantuan.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:12:33
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
