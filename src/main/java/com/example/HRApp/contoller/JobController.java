package com.example.HRApp.contoller;

import com.example.HRApp.lib.resource.JobResource;
import com.example.HRApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = {"/job"})
public class JobController {

    @Autowired
   private JobService jobService;

    @GetMapping("/get-jobs")
    public List<JobResource> getJobs(){

        return jobService.getJobs();
    }

    @GetMapping("/get-job")
    public JobResource getJob(@RequestParam("jobTitle") String jobTitle){

        return jobService.getJob(jobTitle);
    }
}
