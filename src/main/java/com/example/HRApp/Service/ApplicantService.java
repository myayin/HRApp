package com.example.HRApp.Service;


import com.example.HRApp.Repository.ApplicantRepository;
import com.example.HRApp.Repository.JobRepository;
import com.example.HRApp.entity.Applicant;
import com.example.HRApp.entity.Job;
import com.example.HRApp.lib.dto.JobDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ApplicantService {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    public String applyJob(Applicant applicant,
                           String jobTitle) {
        if (jobRepository.findByJobTitle(jobTitle).size() > 1) {
            throw new RuntimeException("please adjust job title, they must be unique");
        } else {
            String jobId = jobRepository.findByJobTitle(jobTitle).get(0).getIdentifier();
           if(jobId==null){
               throw new RuntimeException("The job is not found");
           }
            applicant.setJobId(jobId);
            applicantRepository.save(applicant);

        }

        return "Successful Operation";
    }
}
