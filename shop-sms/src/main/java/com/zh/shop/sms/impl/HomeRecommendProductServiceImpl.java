package com.zh.shop.sms.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zh.shop.sms.entity.HomeRecommendProduct;
import com.zh.shop.sms.mapper.HomeRecommendProductMapper;
import com.zh.shop.sms.service.HomeRecommendProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 人气推荐商品表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductMapper, HomeRecommendProduct> implements HomeRecommendProductService {

}
