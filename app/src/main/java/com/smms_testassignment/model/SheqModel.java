package com.smms_testassignment.model;

public class SheqModel {

    String id,title,overdue,due,inwindow,reminder,survey_overdue,survey_due,survey_reminder;

    public SheqModel(String id, String title, String overdue, String due, String inwindow, String reminder, String survey_overdue, String survey_due, String survey_reminder) {
        this.id = id;
        this.title = title;
        this.overdue = overdue;
        this.due = due;
        this.inwindow = inwindow;
        this.reminder = reminder;
        this.survey_overdue = survey_overdue;
        this.survey_due = survey_due;
        this.survey_reminder = survey_reminder;
    }

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

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getInwindow() {
        return inwindow;
    }

    public void setInwindow(String inwindow) {
        this.inwindow = inwindow;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public String getSurvey_overdue() {
        return survey_overdue;
    }

    public void setSurvey_overdue(String survey_overdue) {
        this.survey_overdue = survey_overdue;
    }

    public String getSurvey_due() {
        return survey_due;
    }

    public void setSurvey_due(String survey_due) {
        this.survey_due = survey_due;
    }

    public String getSurvey_reminder() {
        return survey_reminder;
    }

    public void setSurvey_reminder(String survey_reminder) {
        this.survey_reminder = survey_reminder;
    }
}
