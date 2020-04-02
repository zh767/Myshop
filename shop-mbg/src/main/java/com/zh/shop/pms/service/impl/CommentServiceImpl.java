package com.zh.shop.pms.service.impl;

import com.zh.shop.pms.entity.Comment;
import com.zh.shop.pms.mapper.CommentMapper;
import com.zh.shop.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-04-01
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
