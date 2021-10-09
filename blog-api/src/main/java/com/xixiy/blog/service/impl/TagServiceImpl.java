package com.xixiy.blog.service.impl;

import com.xixiy.blog.entity.Tag;
import com.xixiy.blog.mapper.TagMapper;
import com.xixiy.blog.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xixiy.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<TagVo> findTagById(Long articleId) {
        List<Tag> tags= tagMapper.findTagByArticleId(articleId);

        return copyList(tags);
    }

    private List<TagVo> copyList(List<Tag> tags) {
        ArrayList<TagVo> tagVos = new ArrayList<>();
        for (Tag tag : tags) {
            TagVo tagVo = copy(tag);
            tagVos.add(tagVo);
        }
        return tagVos;
    }
    private TagVo copy(Tag tag){
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag,tagVo);
        return tagVo;
    }
}
