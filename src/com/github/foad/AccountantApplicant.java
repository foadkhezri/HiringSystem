package com.github.foad;

public class AccountantApplicant {
    private String name;
    private long id;
    private int workExperience;
    private String lastDegree;

    public AccountantApplicant(String name, long id, int workExperience, String lastDegree) {
        this.name = name;
        this.id = id;
        this.workExperience = workExperience;
        this.lastDegree = lastDegree;
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

    public String getLastDegree() {
        return lastDegree;
    }

    public void setLastDegree(String lastDegree) {
        this.lastDegree = lastDegree;
    }

    @Override
    public String toString() {
        return "AccountantApplicant{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", workExperience=" + workExperience +
                ", lastDegree='" + lastDegree + '\'' +
                '}' + "\n";
    }
}