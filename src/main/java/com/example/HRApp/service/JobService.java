package com.example.HRApp.service;

import com.example.HRApp.entity.Job;
import com.example.HRApp.lib.resource.JobResource;
import com.example.HRApp.mapper.JobMapper;
import com.example.HRApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobResource> getJobs() {
        List<Job> jobs = jobRepository.findAll();
        List<JobResource> allJob = new ArrayList<>();
        for (Job job : jobs) {
            if(job.getIsActive()==true)
            allJob.add(JobMapper.toResource(job));

        }

        return allJob;
    }

    public JobResource getJob(String jobTitle) {
        if ((jobRepository.findByJobTitle(jobTitle).size()) > 1)
            throw new RuntimeException("job title must be unique ");
        return JobMapper.toResource((jobRepository.findByJobTitle(jobTitle).get(0)));

    }
}
