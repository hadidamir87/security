package com.example.security.convertor;

import com.example.security.auth.AuthenticationRequest;
import com.example.security.auth.AuthenticationResponse;
import com.example.security.auth.RegisterRequest;
import com.example.security.user.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")

public interface UserConvertor extends AbstractConvertor<User, AuthenticationRequest, AuthenticationResponse, RegisterRequest> {
//    User convertToEntityA(AuthenticationRequest authenticationRequest);
//    User convertToEntityR(RegisterRequest registerRequest);
//
//    AuthenticationResponse convertToSrv(User entity);

}
