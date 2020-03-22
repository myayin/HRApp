package com.example.HRApp.service;


import com.example.HRApp.entity.Applicant;
import com.example.HRApp.repository.ApplicantRepository;
import com.example.HRApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private AuthorityService authorityService;

    public void applyJob(Applicant applicant,
                         String jobTitle) {
        if (jobRepository.findByJobTitle(jobTitle).size() > 1) {
            throw new RuntimeException("please adjust job title, they must be unique");
        } else {
            String jobId = jobRepository.findByJobTitle(jobTitle).get(0).getIdentifier();
            if (jobId == null) {
                throw new RuntimeException("The job is not found");
            }
            applicant.setJobId(jobId);
            applicantRepository.save(applicant);
            String applicantId = applicant.getJobId();
            authorityService.addAuthorityToApplicant(applicantId);


        }


    }
}
