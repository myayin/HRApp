package com.example.HRApp.contoller;

import com.example.HRApp.mapper.ApplicantMapper;
import com.example.HRApp.service.ApplicantService;
import com.example.HRApp.lib.dto.ApplicantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = {"/applicant"})
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;


    @PostMapping("/apply-to-job")
    public void applyJob(@RequestBody ApplicantDto applicantDto,
                           @RequestParam("jobTitle") String jobTitle) {

        applicantService.applyJob(ApplicantMapper.toEntity(applicantDto), jobTitle);
    }

}
