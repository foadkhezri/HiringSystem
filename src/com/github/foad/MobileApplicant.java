package com.github.foad;

public class MobileApplicant {
    private String name;
    private long id;
    private int workExperience;
    private String lastWorkPosition;
    private int publishedAppNo;

    public MobileApplicant(String name, long id, int workExperience, String lastWorkPosition, int publishedAppNo) {
        this.name = name;
        this.id = id;
        this.workExperience = workExperience;
        this.lastWorkPosition = lastWorkPosition;
        this.publishedAppNo = publishedAppNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        if (workExperience >= 0)
            this.workExperience = workExperience;
    }

    public String getLastWorkPosition() {
        return lastWorkPosition;
    }

    public void setLastWorkPosition(String lastWorkPosition) {
        this.lastWorkPosition = lastWorkPosition;
    }

    public int getPublishedAppNo() {
        return publishedAppNo;
    }

    public void setPublishedAppNo(int publishedAppNo) {
        this.publishedAppNo = publishedAppNo;
    }

    @Override
    public String toString() {
        return "MobileApplicant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", workExperience=" + workExperience +
                ", lastWorkPosition='" + lastWorkPosition + '\'' +
                ", publishedAppNo=" + publishedAppNo +
                '}' + "\n";
    }
}