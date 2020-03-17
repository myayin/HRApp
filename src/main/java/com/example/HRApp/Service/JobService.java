package com.example.HRApp.Service;

import com.example.HRApp.Mapper.JobMapper;
import com.example.HRApp.Repository.JobRepository;
import com.example.HRApp.entity.Job;
import com.example.HRApp.lib.resource.JobResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobResource> getJob(){
        List<Job> jobs=jobRepository.findAll();
        List <JobResource> allJob= new ArrayList<>();
        for (Job job: jobs) {
            allJob.add(JobMapper.toResource(job));

        }

return  allJob;
    }
}
