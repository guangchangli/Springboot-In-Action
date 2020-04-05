package com.aladdin.service.impl;

import com.aladdin.core.AbstractService;
import com.aladdin.entity.Article;
import com.aladdin.mapper.ArticleDao;
import com.aladdin.service.ArticleInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgc
 **/
@Service
public class ArticleService extends AbstractService<Article> implements ArticleInterface {

    @Autowired
    ArticleDao articleDao;

    @Override
    public List<Article> articleList() {
        return articleDao.selectByExample(null);
    }

}
