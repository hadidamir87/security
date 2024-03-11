package com.example.security.auth;

import com.example.security.convertor.AbstractConvertor;
import com.example.security.convertor.UserCon;
import com.example.security.convertor.UserConvertor;
import com.example.security.user.User;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController{
    private final AuthenticationService service;
    private final UserCon  userCon;
    /*@Autowired
    protected AuthenticationService service;*/
   /* @Autowired
    protected UserConvertor<User, AuthenticationRequest, AuthenticationResponse, RegisterRequest> convertor;
*/
   /* @Autowired
    protected AbstractConvertor<User, AuthenticationRequest, AuthenticationResponse, RegisterRequest> convertor;
*/
    @PostMapping("/register")
    public User register(
            @RequestBody RegisterRequest request) throws Exception {
        return service.register(userCon.registerConvertToEntity(request));
    }


  /*  @PostMapping("/authenticate")
    @Transactional
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request) throws Exception {
        return ResponseEntity.ok(service.authenticate(request));
    }*/

    @PostMapping(value = "/login")
    public ResponseEntity<?> createAuthenticationToken(
    @RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        return ResponseEntity.ok(service.authentication(
                userCon.convertToEntity(authenticationRequest)));
    }

}
