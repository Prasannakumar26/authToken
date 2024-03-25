package com.example.springtoken.Service;


import com.example.springtoken.Repository.OurUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OurUsersService implements UserDetailsService {

    @Autowired
    OurUsersRepository ourUsersRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ourUsersRepository.findByEmail(username).orElseThrow();
    }
}
