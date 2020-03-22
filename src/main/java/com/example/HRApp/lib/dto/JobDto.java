package com.example.HRApp.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Date;

@Data
public class JobDto {

    @JsonProperty("jobTitle")
    private  String jobTitle;

    @JsonProperty("jobDescription")
    private String jobDescription;

    @JsonProperty("numberOfPeople")
    private String numberOfPeople;

    @JsonProperty("applicationDate")
    private Date applicationDate;
}
