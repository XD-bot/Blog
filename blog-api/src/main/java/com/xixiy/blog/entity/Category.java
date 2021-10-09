package com.xixiy.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ms_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private String avatar;

    private String categoryName;

    private String description;


}
