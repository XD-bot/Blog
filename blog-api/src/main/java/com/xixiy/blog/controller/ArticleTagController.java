package com.xixiy.blog.controller;


import com.xixiy.blog.service.ITagService;
import com.xixiy.blog.vo.params.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/tags")
public class ArticleTagController {

    @Autowired
    private ITagService tagService;

    @GetMapping("/hot")
    public Result hots(){
        int limit = 2;
        return tagService.findHotTags(limit);
    }
}
