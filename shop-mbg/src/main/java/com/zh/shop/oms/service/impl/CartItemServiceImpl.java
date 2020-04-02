package com.zh.shop.oms.service.impl;

import com.zh.shop.oms.entity.CartItem;
import com.zh.shop.oms.mapper.CartItemMapper;
import com.zh.shop.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
