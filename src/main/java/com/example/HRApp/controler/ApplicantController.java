package com.example.HRApp.controler;

import com.example.HRApp.mapper.ApplicantMapper;
import com.example.HRApp.service.ApplicantService;
import com.example.HRApp.lib.dto.ApplicantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/applicant"})
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;


    @PostMapping("/apply-to-job")
    public String applyJob(@RequestBody ApplicantDto applicantDto,
                           @RequestParam("job-title") String jobTitle) {

        return applicantService.applyJob(ApplicantMapper.toEntity(applicantDto), jobTitle);
    }

}
