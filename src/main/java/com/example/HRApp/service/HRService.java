package com.example.HRApp.service;


import com.example.HRApp.contoller.JobController;
import com.example.HRApp.entity.Applicant;
import com.example.HRApp.entity.Job;
import com.example.HRApp.lib.resource.ApplicantResource;
import com.example.HRApp.lib.resource.JobResource;
import com.example.HRApp.mapper.ApplicantMapper;
import com.example.HRApp.repository.ApplicantRepository;
import com.example.HRApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class HRService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private JobController jobController;

    public void addJob(Job job) {
        jobRepository.save(job);

    }

    public List<JobResource> deleteJob(String jobTitle) {
        List<Job> job = jobRepository.findByJobTitle(jobTitle);
        if (job.size() > 1) {
            throw new RuntimeException("please adjust job title, they must be unique");
        } else {
            job.get(0).setIsActive(false);
            jobRepository.save(job.get(0));
        }
        return jobController.getJobs();
    }

    public List<ApplicantResource> getApplicant(String jobTitle) {
        List<ApplicantResource> applicantResources = new ArrayList<>();
        String jobId = (jobRepository.findByJobTitle(jobTitle).get(0).getIdentifier());
        for (Applicant applicant : applicantRepository.findAll()) {
            if (applicant.getJobId().equals(jobId))
                applicantResources.add(ApplicantMapper.toResource(applicant));
        }
        return applicantResources;
    }

}
