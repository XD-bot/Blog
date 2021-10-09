package com.xixiy.blog.service;

import com.xixiy.blog.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xixiy.blog.vo.TagVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
public interface ITagService extends IService<Tag> {
    List<TagVo> findTagById(Long articleId);
}
