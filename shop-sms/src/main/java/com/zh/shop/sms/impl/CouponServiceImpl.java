package com.zh.shop.sms.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.shop.sms.entity.Coupon;
import com.zh.shop.sms.mapper.CouponMapper;
import com.zh.shop.sms.service.CouponService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠卷表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements CouponService {

}
