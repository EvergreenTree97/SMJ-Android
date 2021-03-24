package com.example.smj.ui.transaction;

import java.io.Serializable;

public class TransactionPostData implements Serializable {
    private String category;
    private String title;
    private String contents;
    private String writer;
    private String date;
    private String profileImage;
    private int id;

    public TransactionPostData(String category, String title, String contents, String writer, String date, String profileImage, int id) {
        this.category = category;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.date = date;
        this.profileImage = profileImage;
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
