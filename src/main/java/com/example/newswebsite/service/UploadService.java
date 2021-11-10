package com.example.newswebsite.service;

import com.example.newswebsite.model.Article;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;

public class UploadService {

    public Article addArticle(MultipartFile multipartFile) {
        String file = "";
        try {
            File zip = File.createTempFile("upload", null);
            multipartFile.transferTo(zip);
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zip));
            while (zipInputStream.getNextEntry() != null) {
                file = new String(zipInputStream.readAllBytes());
                zip.delete();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        Article article = new Article();
        String splitter = "\n";
        String[] lines = file.split(splitter);
        article.setHeadline(lines[0]);
        article.setBody(file.substring(lines[1].length()));
        return article;
    }
}