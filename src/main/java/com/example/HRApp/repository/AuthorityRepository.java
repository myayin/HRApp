package com.example.HRApp.repository;

import com.example.HRApp.entity.Applicant;
import com.example.HRApp.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
