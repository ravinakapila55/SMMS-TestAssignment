package com.smms_testassignment.model;

public class OthersModel {

    String id,title,message,count;
    int icon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public OthersModel(String id, String title, String message, String count, int icon) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.count = count;
        this.icon = icon;
    }
}
