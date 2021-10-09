package com.xixiy.blog.controller;


import com.xixiy.blog.service.IArticleService;
import com.xixiy.blog.vo.params.PageParams;
import com.xixiy.blog.vo.params.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
@RestController
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @PostMapping("/articles")
    public Result listArticles(@RequestBody PageParams pageParams){
        return articleService.getArticleList(pageParams);
    }
}
