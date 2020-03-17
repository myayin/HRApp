package com.example.HRApp.lib.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplicantResource {

    private String name;

    private String email;

    private String phone;

    private String address;

    private String thoughts;

}
