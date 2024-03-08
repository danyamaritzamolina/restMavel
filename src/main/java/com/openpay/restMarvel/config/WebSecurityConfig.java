package com.openpay.restMarvel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;


import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig {
    /*@Bean
    public UserDetailsService authProvider() {
        var usuario = User.withUsername("danya")
                .password("1234")
                .roles("write").roles("read")
                .build();
       
        return new InMemoryUserDetailsManager(usuario);
    }*/
    
    @Bean 
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
        //return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
    
   

}
