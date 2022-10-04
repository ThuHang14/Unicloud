package com.example.demooauth2_jwt;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class UsersPojo {
    private String username;
    private String password;
    private Collection<GrantedAuthority> listOfgrantedAuthorities = new ArrayList<>();

}
