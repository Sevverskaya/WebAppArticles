package com.example.newswebsite.controller;

import com.example.newswebsite.model.Article;
import com.example.newswebsite.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ArticlesController {
    private final ArticleService articleService;

    @Autowired
    public ArticlesController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public String viewAllArticles(Model model) {
        model.addAttribute("articles", articleService.getArticles());
        return "index";
    }

   /* @GetMapping("/articles/{id}")
    public String getArticleById(@PathVariable Long id) {
        log.info("Requested Article with id: {} ", id);
        return "1";
    }*/

}
