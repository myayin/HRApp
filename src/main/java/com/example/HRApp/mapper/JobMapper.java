package com.example.HRApp.mapper;


import com.example.HRApp.entity.Job;
import com.example.HRApp.lib.dto.JobDto;
import com.example.HRApp.lib.resource.JobResource;


public class JobMapper {
    public static Job toEntity(JobDto jobDto) {
        if (jobDto == null) {
            return null;
        }

        Job job = new Job();
        job.setApplicationDate(jobDto.getApplicationDate());
        job.setJobTitle(jobDto.getJobTitle());
        job.setNumberOfPeople(jobDto.getNumberOfPeople());
        job.setJobDescription(jobDto.getJobDescription());


        return job;
    }

    public static JobResource toResource(Job job) {
        if (job == null) {
            return null;
        }

        JobResource jobResource = new JobResource();

        jobResource.setJobTitle(job.getJobTitle());
        jobResource.setNumberOfPeople(job.getNumberOfPeople());
        jobResource.setJobDescription(job.getJobDescription());
        jobResource.setApplicationDate(job.getApplicationDate());
        return jobResource;
    }
}
