package com.aladdin.controller;

import com.aladdin.entity.Article;
import com.aladdin.service.impl.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lgc
 **/
@RestController
@RequestMapping("/mybatis/article")
public class MybatisController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/list")
    public PageInfo<Article> getArticlePageList(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                                @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return PageHelper.startPage(pageNo, pageSize).doSelectPageInfo(() ->articleService.articleList());
    }

    @GetMapping("/lists")
    public PageInfo<Article> findAll(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                     @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        return PageHelper.startPage(pageNo,pageSize).doSelectPageInfo(()->articleService.findAll());
    }
}
