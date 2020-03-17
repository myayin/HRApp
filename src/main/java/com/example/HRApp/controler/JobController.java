package com.example.HRApp.controler;

import com.example.HRApp.service.JobService;
import com.example.HRApp.lib.resource.JobResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = {"/job"})
public class JobController {

    @Autowired
   private JobService jobService;

    @GetMapping("/get-job")
    public List<JobResource> getJob(){

        return jobService.getJob();
    }
}
