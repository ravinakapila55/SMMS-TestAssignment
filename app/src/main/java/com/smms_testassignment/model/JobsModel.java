package com.smms_testassignment.model;

public class JobsModel {
    String id,jobs,title;
    int drawable;

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }



    public JobsModel(String id, String jobs, String title, int drawable) {
        this.id = id;
        this.jobs = jobs;
        this.title = title;
        this.drawable=drawable;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
