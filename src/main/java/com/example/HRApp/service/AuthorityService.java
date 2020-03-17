package com.example.HRApp.service;

import com.example.HRApp.entity.Authority;
import com.example.HRApp.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;


    public void addAuthorityToApplicant(String applicantId){
        Authority authority = new Authority(applicantId, "applicant");
        authorityRepository.save(authority);
    }
}
