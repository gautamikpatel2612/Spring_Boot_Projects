package com.gautami.Job.Application.SpringBootProject.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//either use this @RequestMapping("/jobs") or @RestController
@RestController
public class JobController {

    //need to initialize using @Service annotation in impl.java file
    private JobService jobService;

    //need to create a constructor to It will injected to the controller.
    // And how to do this? -> Need to create constructor in JobController.java
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    //GET : /jobs :-> Get all jobs.
    //->GET - http://localhost:8080/jobs
    //either use this @RequestMapping(value = "/jobs", method =RequestMethod.GET) or @GetMapping
    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll(){
        //return jobs;
        return new ResponseEntity<>(jobService.findAll(), HttpStatus.OK);
    }

    //POST : /jobs : create a new job (request body should contain the job details)
    //->POST - http://localhost:8080/jobs
    //This is POST so we need to send Request body to Postman.
    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job){ //need to send RequestBody
        jobService.createJob(job);
        return new ResponseEntity<>("Job added Successfully!", HttpStatus.CREATED);
    }

    //GET : /jobs/{id} :-> Get a specific job by ID.
    //->GET - http://localhost:8080/jobs/1
    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        //logic
        Job job = jobService.getJobById(id);
        if (job!=null) {
            return new ResponseEntity<>(job, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(job, HttpStatus.NOT_FOUND);
        }
    }

    //DELETE : /jobs/{id} :-> Delete a specific job by ID.
    //->DELETE - http://localhost:8080/jobs/1
    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        boolean deleted = jobService.deleteJob(id);
        if(deleted){
            return new ResponseEntity<>("Job deleted!!", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Job not Found!", HttpStatus.NOT_FOUND);
        }
    }

    //PUT : /jobs/{id} :-> Update a specific job by ID.
    //->PUT - http://localhost:8080/jobs/1
    @PutMapping("/jobs/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updatedJob){
        boolean updated = jobService.updateJob(id, updatedJob);//(which job to update, what to update)
        if(updated){
            return new ResponseEntity<>("Job updated!!", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("job not found!", HttpStatus.NOT_FOUND);
        }
    }
}
