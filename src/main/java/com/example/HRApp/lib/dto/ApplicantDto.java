package com.example.HRApp.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplicantDto {
    @JsonProperty("name")
    private  String name;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("address")
    private String address;

    @JsonProperty("thoughts")
    private String thoughts;

}
