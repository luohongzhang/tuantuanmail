package com.luohz.tuantuan.coupon.dao;

import com.luohz.tuantuan.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 18:54:03
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
