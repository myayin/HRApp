package com.example.HRApp.Controler;

import com.example.HRApp.Mapper.ApplicantMapper;
import com.example.HRApp.Mapper.JobMapper;
import com.example.HRApp.Service.ApplicantService;
import com.example.HRApp.entity.Applicant;
import com.example.HRApp.lib.dto.ApplicantDto;
import com.example.HRApp.lib.dto.JobDto;
import com.example.HRApp.lib.resource.JobResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/applicant"})
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;


    @PostMapping("/apply-to-job")
    public String applyJob(@RequestBody ApplicantDto applicantDto,
                           @RequestParam("job-title") String jobTitle){

        return applicantService.applyJob(ApplicantMapper.toEntity(applicantDto), jobTitle);
    }

}
