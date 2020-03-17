package com.example.HRApp.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;
@Data
public class JobDto {

    @JsonProperty("jobTitle")
    private  String jobTitle;

    @JsonProperty("phoneNumber")
    private String phone;

    @JsonProperty("numberOfPeople")
    private int numberOfPeople;

    @JsonProperty("applicationDate")
    private Date applicationDate;
}
