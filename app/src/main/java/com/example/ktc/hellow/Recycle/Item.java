package com.example.ktc.hellow.Recycle;

public class Item {
    private  int imageId;
    private  String title;
    private String subtitle;

    public Item(int imageId, String title, String subtitle) {
        this.imageId = imageId;
        this.title = title;
        this.subtitle = subtitle;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImageId() {

        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
