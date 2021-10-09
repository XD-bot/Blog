package com.xixiy.blog.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xixiy.blog.entity.Author;
import com.xixiy.blog.mapper.AuthorMapper;
import com.xixiy.blog.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements IAuthorService {

    @Autowired
    private AuthorMapper authorMapper;
    @Override
    public Author findAuthorById(Long authorId) {
        return  authorMapper.selectById(authorId);
    }
}
