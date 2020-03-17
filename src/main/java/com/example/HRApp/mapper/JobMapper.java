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


        return job;
    }

    public static JobResource toResource(Job job) {
        if (job == null) {
            return null;
        }

        JobResource jobResource = new JobResource();
        jobResource.setApplicationDate(job.getApplicationDate());
        jobResource.setJobTitle(job.getJobTitle());
        jobResource.setNumberOfPeople(job.getNumberOfPeople());

        return jobResource;
    }
}
