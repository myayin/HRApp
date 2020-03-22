package com.example.HRApp.contoller;


import com.example.HRApp.lib.dto.JobDto;
import com.example.HRApp.lib.resource.ApplicantResource;
import com.example.HRApp.lib.resource.JobResource;
import com.example.HRApp.mapper.JobMapper;
import com.example.HRApp.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = {"/HR"})
public class HRController {

    @Autowired
    private HRService hrService;


    @PostMapping("/add-job")
    public void addJob(@RequestBody JobDto jobDto) {
      hrService.addJob(JobMapper.toEntity(jobDto));

    }

    @GetMapping("/delete-job")
    public List<JobResource> deleteJob(@RequestParam("jobTitle") String jobTitle) {
      return hrService.deleteJob(jobTitle);
    }


    @GetMapping("/get-applicant-to-job")
    public List<ApplicantResource> getApplicant(@RequestParam("jobTitle") String jobTitle) {
        return hrService.getApplicant(jobTitle);
    }
}
