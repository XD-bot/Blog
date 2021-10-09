package com.xixiy.blog.vo;

import com.xixiy.blog.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class ArticleVo {

    private Long id;

    private String title;

    private String summary;

    private int commentCounts;

    private int viewCounts;

    private int weight;

    private String createDate;

    private String author;

//    private ArticleBodyVo body;

    private List<TagVo> tags;

//    private List<CategoryVo> categorys;
}
