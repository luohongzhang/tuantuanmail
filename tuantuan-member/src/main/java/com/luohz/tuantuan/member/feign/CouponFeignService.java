package com.luohz.tuantuan.member.feign;

import com.luohz.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("tuantuan-coupon")
public interface CouponFeignService {

    @GetMapping("coupon/coupon/getMemberCoupon")
    public R getMemberCoupon();
}
