package org.tyaa.singlefragmentdemo;

import java.util.Date;

public class NewsItem {

    private static Integer lastId = 1;

    public Integer id;
    public String title;
    public String content;
    public String author;
    public Date date;

    public NewsItem() {
        this.id = lastId++;
    }

    public NewsItem(String title, String content, String author, Date date) {
        this();
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }
}
