package com.example.HRApp.Controler;


import com.example.HRApp.Mapper.JobMapper;
import com.example.HRApp.Service.HRService;
import com.example.HRApp.lib.dto.JobDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/HR"})
public class HRContoller {

    @Autowired
    private HRService hrService;


    @PostMapping("/add-job")
    public String  addJob(@RequestBody JobDto jobDto){
       return  hrService.addJob(JobMapper.toEntity(jobDto));

    }
    @PutMapping("/delete-job")
    public String deleteJob(@RequestParam("title") String jobTitle){
       return hrService.deleteJob(jobTitle);
    }


}
