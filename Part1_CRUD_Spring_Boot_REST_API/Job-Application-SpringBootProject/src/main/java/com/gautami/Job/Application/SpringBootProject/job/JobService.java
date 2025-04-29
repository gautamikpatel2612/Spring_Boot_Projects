package com.gautami.Job.Application.SpringBootProject.job;

import java.util.List;

//in this interface we only write return methods that we need for JobServiceImpl.java
public interface JobService {

    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJob(Long id);

    boolean updateJob(Long id, Job updatedJob);

}
