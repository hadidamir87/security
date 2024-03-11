package com.example.security.convertor;

import com.example.security.auth.AuthenticationRequest;
import com.example.security.auth.RegisterRequest;
import com.example.security.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserCon {
    public User registerConvertToEntity(RegisterRequest registerRequest){
        if ( registerRequest == null ) {
            return null;
        }
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());

        return user;
    }

    public User convertToEntity(AuthenticationRequest authenticationRequest) {
        if ( authenticationRequest == null ) {
            return null;
        }
        User user = new User();
        user.setUsername(authenticationRequest.getUsername());
        user.setPassword(authenticationRequest.getPassword());

        return user;
    }
}
