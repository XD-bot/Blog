package com.xixiy.blog.mapper;

import com.xixiy.blog.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
public interface TagMapper extends BaseMapper<Tag> {

    List<Tag> findTagByArticleId(Long articleId);
}
