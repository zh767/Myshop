package com.zh.shop.oms.service.impl;

import com.zh.shop.oms.entity.Order;
import com.zh.shop.oms.mapper.OrderMapper;
import com.zh.shop.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
