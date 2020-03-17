package com.example.HRApp.repository;

import com.example.HRApp.entity.Applicant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, String> {
    @Override
    List<Applicant> findAll();

}
