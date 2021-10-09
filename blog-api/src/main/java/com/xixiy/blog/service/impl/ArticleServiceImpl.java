package com.xixiy.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xixiy.blog.entity.Article;
import com.xixiy.blog.mapper.ArticleMapper;
import com.xixiy.blog.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xixiy.blog.service.IAuthorService;
import com.xixiy.blog.service.ITagService;
import com.xixiy.blog.vo.ArticleVo;
import com.xixiy.blog.vo.params.PageParams;
import com.xixiy.blog.vo.params.Result;
import org.joda.time.DateTime;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ITagService tagService;

    @Autowired
    private IAuthorService authorService;

    @Override
    public Result getArticleList(PageParams pageParams) {
        Page<Article> articlePage = new Page<>(pageParams.getPage(), pageParams.getPageSize());
        LambdaQueryWrapper<Article> articleLambdaQueryWrapper = new LambdaQueryWrapper<>();
        articleLambdaQueryWrapper.orderByDesc(Article::getCreateDate);
        Page<Article> page = articleMapper.selectPage(articlePage, articleLambdaQueryWrapper);

        //不可直接返回Article
        List<Article> records = page.getRecords();
        List<ArticleVo> recodesVo = copyVo(records,true,true);

        return Result.success(recodesVo);
    }

    private List<ArticleVo> copyVo(List<Article> records, boolean isTag, boolean isAuthor) {
        ArrayList<ArticleVo> articleVos = new ArrayList<>();
        for (Article record : records) {
            ArticleVo copy = copy(record,isTag,isAuthor);
            articleVos.add(copy);
        }
        return articleVos;

    }

    private ArticleVo copy(Article article, boolean isTag, boolean isAuthor){
        ArticleVo articleVo = new ArticleVo();
        BeanUtils.copyProperties(article,articleVo);
        articleVo.setCreateDate(new DateTime(article.getCreateDate()).toString("yyyy-MM-dd HH:mm"));
        if (isAuthor){
            Long authorId = article.getAuthorId();
            articleVo.setAuthor(authorService.findAuthorById(authorId).getAuthorName());
        }
        if (isTag){
            Long articleId = article.getId();
            articleVo.setTags(tagService.findTagById(articleId));
        }
        return articleVo;
    }
}
