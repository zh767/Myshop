package com.zh.shop.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *1配置整合dubbo
 * 2配置整合 Mybatis Plus
 */
@EnableDubbo
@MapperScan(basePackages = "com.zh.shop.pms.mapper")
@SpringBootApplication
public class ShopPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopPmsApplication.class, args);
    }

}
