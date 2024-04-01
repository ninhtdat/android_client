package com.example.client.model;

public class Fruit {
    private int id;
    private String name;
    private String detail;

    private int imageSrc;
    private boolean isChecked;

    public Fruit(int id, String name, String detail, int imageSrc, boolean isChecked){
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.imageSrc = imageSrc;
        this.isChecked = isChecked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImageUrl() {
        return imageSrc;
    }

    public void setImageUrl(int imageUrl) {
        this.imageSrc = imageUrl;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
