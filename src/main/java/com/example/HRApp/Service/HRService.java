package com.example.HRApp.Service;


import com.example.HRApp.Repository.JobRepository;
import com.example.HRApp.entity.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HRService {

    @Autowired
    private JobRepository jobRepository;

    public String addJob(Job job){
        jobRepository.save(job);
        return  "Successfully operation";
    }

    public String deleteJob(String jobTitle){
        List <Job> job =jobRepository.findByJobTitle(jobTitle);
        if(job.size()>1){
            throw new RuntimeException("please adjust job title, they must be unique");
        }
        else {
            job.get(0).setIsActive(false);
            jobRepository.save(job.get(0));
        }
        return  "Successfully operation";
    }


}
