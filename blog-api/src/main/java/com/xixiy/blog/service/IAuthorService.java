package com.xixiy.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xixiy.blog.entity.Author;

public interface IAuthorService extends IService<Author> {

    Author findAuthorById(Long authorId);
}
