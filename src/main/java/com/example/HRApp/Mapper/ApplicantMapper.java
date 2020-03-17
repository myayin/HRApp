package com.example.HRApp.Mapper;

import com.example.HRApp.entity.Applicant;
import com.example.HRApp.lib.dto.ApplicantDto;
import com.example.HRApp.lib.resource.ApplicantResource;

public class ApplicantMapper {

    public static Applicant toEntity(ApplicantDto applicantDto) {
        if (applicantDto == null) {
            return null;
        }

        Applicant applicant = new Applicant();
        applicant.setAddress(applicantDto.getAddress());
        applicant.setEmail(applicantDto.getEmail());
        applicant.setName(applicantDto.getName());
        applicant.setPhone(applicantDto.getPhone());
        applicant.setThoughts(applicantDto.getThoughts());


        return applicant;
    }

    public static ApplicantResource toResource(Applicant applicant) {
        if (applicant == null) {
            return null;
        }

        ApplicantResource applicantResource = new ApplicantResource();
        applicantResource.setEmail(applicant.getEmail());
        applicantResource.setName(applicant.getName());
        applicantResource.setPhone(applicant.getPhone());
        applicantResource.setAddress(applicant.getAddress());
        applicantResource.setThoughts(applicant.getThoughts());



        return applicantResource;
    }
}
