package com.smms_testassignment.model;

public class InventoryModel {

    String id,inventory_count,title;
    int drawable,background;

    public InventoryModel(String id, String inventory_count, String title, int drawable, int background) {
        this.id = id;
        this.inventory_count = inventory_count;
        this.title = title;
        this.drawable = drawable;
        this.background = background;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInventory_count() {
        return inventory_count;
    }

    public void setInventory_count(String inventory_count) {
        this.inventory_count = inventory_count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
