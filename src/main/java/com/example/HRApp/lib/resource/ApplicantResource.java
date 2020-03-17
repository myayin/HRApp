package com.example.HRApp.lib.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApplicantResource {
    @JsonProperty("name")
    private  String name;

    @JsonProperty("email")
    private String email;

}
