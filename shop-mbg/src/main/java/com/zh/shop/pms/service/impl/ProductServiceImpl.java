package com.zh.shop.pms.service.impl;

import com.zh.shop.pms.entity.Product;
import com.zh.shop.pms.mapper.ProductMapper;
import com.zh.shop.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
