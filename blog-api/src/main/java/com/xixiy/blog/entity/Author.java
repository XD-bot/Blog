package com.xixiy.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ms_author")
public class Author {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String authorName;
}
