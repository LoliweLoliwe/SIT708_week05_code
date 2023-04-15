package com.loliwe.news5;

public class dataModel {

    String name;
    String body;
    int pics;

    public dataModel(String title, String news, int photos) {
        this.name = title;
        this.body = news;
        this.pics = photos;
    }

    public String getName() {
        return name;
    }

    public String getNews() {
        return body;
    }

    public int getImages() {
        return pics;
    }

}
