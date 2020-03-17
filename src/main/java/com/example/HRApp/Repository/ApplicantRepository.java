package com.example.HRApp.Repository;

import com.example.HRApp.entity.Applicant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,String> {

}
