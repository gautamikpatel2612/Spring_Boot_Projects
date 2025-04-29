package com.gautami.Job.Application.SpringBootProject.job.impl;

import com.gautami.Job.Application.SpringBootProject.job.Job;
import com.gautami.Job.Application.SpringBootProject.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//initialize private JobService jobService;
@Service
public class JobServiceImpl implements JobService {

    //we removed from JobController.java and addd here the declaration.
    private List<Job> jobs = new ArrayList<>();
    private Long nextId=1L;//when you add new job the id will automatically increased.

    @Override
    public List<Job> findAll() {
       // return List.of();
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);//set current ID to job object and incremented by 1.
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job : jobs) {
            if (id != null && id.equals(job.getId())){
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJob(Long id) {
        //need to search job by id and then delete it.
        Iterator<Job> iterator = jobs.iterator();
        while(iterator.hasNext()){
            Job job = iterator.next();
            if (id != null && id.equals(job.getId())){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        //logic to update job
        for(Job job : jobs){
            if(id != null && id.equals(job.getId())){
              job.setTital(updatedJob.getTital());
              job.setDescription(updatedJob.getDescription());
              job.setMinSalary(updatedJob.getMinSalary());
              job.setMaxSalary(updatedJob.getMaxSalary());
              job.setLocation(updatedJob.getLocation());

              return true;
            }
        }
        return false;
    }
}
