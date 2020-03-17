package com.example.HRApp.repository;


import com.example.HRApp.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job,String> {
   List<Job> findByJobTitle(String jobTitle);
   List <Job> findAll();

}
