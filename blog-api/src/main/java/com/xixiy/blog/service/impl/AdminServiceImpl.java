package com.xixiy.blog.service.impl;

import com.xixiy.blog.entity.Admin;
import com.xixiy.blog.mapper.AdminMapper;
import com.xixiy.blog.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
