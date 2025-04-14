package com.webapp.model;

public class President {
    private String name;
    private String imageUrl;

    public President(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}