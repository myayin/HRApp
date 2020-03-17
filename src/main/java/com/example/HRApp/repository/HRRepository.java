package com.example.HRApp.repository;

import com.example.HRApp.entity.HR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRRepository extends JpaRepository<HR, String> {
    HR findByEmail(String email);
}
