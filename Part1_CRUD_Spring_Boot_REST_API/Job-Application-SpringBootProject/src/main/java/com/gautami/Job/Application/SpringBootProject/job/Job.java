package com.gautami.Job.Application.SpringBootProject.job;

public class Job {

    //Here we will write all the Job's properties.
    private long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    //generate default constructor.
    public Job(){

    }

    //generate parameterized constructor.
    public Job(long id, String description, String location, String maxSalary, String minSalary, String tital) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.title = tital;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    //generate setter & getter.
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getTital() {
        return title;
    }
    public void setTital(String tital) {
        this.title = tital;
    }
}
