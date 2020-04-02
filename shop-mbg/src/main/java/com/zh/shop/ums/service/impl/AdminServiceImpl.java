package com.zh.shop.ums.service.impl;

import com.zh.shop.ums.entity.Admin;
import com.zh.shop.ums.mapper.AdminMapper;
import com.zh.shop.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
