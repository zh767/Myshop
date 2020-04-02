package com.zh.shop.pms;

import com.zh.shop.pms.entity.Product;
import com.zh.shop.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class ShopPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Test
    void contextLoads() {
        Product product = productService.getById(1);
        System.out.println(product);
    }

}
