package com.piwowarski.turistportal.security;


import com.piwowarski.turistportal.model.User;
import com.piwowarski.turistportal.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(email);

        if(user == null)
        {
            throw new UsernameNotFoundException("USER NOT FOUND");
        }

        return new org.springframework.security.core.userdetails.User(
              user.getEmail(),
              user.getPassword(),
              true,
              true,
              true,
              true,
              getAuthorities("ROLE_" + user.getRole())
        );
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role)
    {
        return Arrays.asList(new SimpleGrantedAuthority(role));
    }
}
