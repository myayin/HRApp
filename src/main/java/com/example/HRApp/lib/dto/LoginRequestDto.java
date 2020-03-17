package com.example.HRApp.lib.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class LoginRequestDto {
    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;
}
