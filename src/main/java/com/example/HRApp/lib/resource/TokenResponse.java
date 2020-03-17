package com.example.HRApp.lib.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Resource
public class TokenResponse {
    private String email;

    private String token;
}
