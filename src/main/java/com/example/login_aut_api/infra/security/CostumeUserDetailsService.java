package com.example.login_aut_api.infra.security;

import com.example.login_aut_api.domain.User;
import com.example.login_aut_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CostumeUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loaduserByUsername(String username) throws UsernameNotFoundException{
        User user = this.repository.findByEmail(username).orElseThrow();
    }
}
