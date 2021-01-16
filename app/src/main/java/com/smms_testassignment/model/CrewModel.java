package com.smms_testassignment.model;

public class CrewModel {

    String id,crewCount,heading;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrewCount() {
        return crewCount;
    }

    public void setCrewCount(String crewCount) {
        this.crewCount = crewCount;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    int drawable;

    public CrewModel(String id, String crewCount, String heading, int drawable) {
        this.id = id;
        this.crewCount = crewCount;
        this.heading = heading;
        this.drawable = drawable;
    }
}
