package com.sua.SpringSecurityEx.service;

import com.sua.SpringSecurityEx.model.UserDetailImpl;
import com.sua.SpringSecurityEx.model.Users;
import com.sua.SpringSecurityEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = userRepo.findByUsername(username);
        if (isNull(users)) {
            throw new UsernameNotFoundException("User not found");
        }

        return new UserDetailImpl(users);
    }
}
