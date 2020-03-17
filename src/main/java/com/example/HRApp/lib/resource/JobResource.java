package com.example.HRApp.lib.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class JobResource {

    private  String jobTitle;

    private String phone;

    private int numberOfPeople;

    private Date applicationDate;
}
