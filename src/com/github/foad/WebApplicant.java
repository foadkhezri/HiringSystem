package com.github.foad;

public class WebApplicant {
    private String name;
    private long id;
    private int workExperience;
    private String lastWorkPosition;
    private String languageUsed;

    public WebApplicant(String name, long id, int workExperience, String lastWorkPosition, String languageUsed) {
        this.name = name;
        this.id = id;
        this.workExperience = workExperience;
        this.lastWorkPosition = lastWorkPosition;
        this.languageUsed = languageUsed;
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

    public String getLanguageUsed() {
        return languageUsed;
    }

    public void setLanguageUsed(String languageUsed) {
        this.languageUsed = languageUsed;
    }

    @Override
    public String toString() {
        return "WebApplicant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", workExperience=" + workExperience +
                ", lastWorkPosition='" + lastWorkPosition + '\'' +
                ", languageUsed='" + languageUsed + '\'' +
                '}' + "\n";
    }
}
