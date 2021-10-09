package com.xixiy.blog.service;

import com.xixiy.blog.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xixiy.blog.vo.params.PageParams;
import com.xixiy.blog.vo.params.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
public interface IArticleService extends IService<Article> {

    Result getArticleList(PageParams pageParams);
}
