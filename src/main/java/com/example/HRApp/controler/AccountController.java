package com.example.HRApp.controler;


import com.example.HRApp.entity.HR;
import com.example.HRApp.lib.dto.LoginRequestDto;
import com.example.HRApp.lib.resource.TokenResponse;
import com.example.HRApp.repository.HRRepository;
import com.example.HRApp.security.JwtTokenUtil;
import com.example.HRApp.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")
public class AccountController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private HRRepository userRepository;

    @Autowired
    private HRService hrService;



    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequestDto request) throws AuthenticationException {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        final HR employee = userRepository.findByEmail(request.getEmail());
        final String token = jwtTokenUtil.generateToken(employee);
        return ResponseEntity.ok(new TokenResponse(employee.getEmail(), token));
    }



}
