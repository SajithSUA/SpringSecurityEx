package com.sua.SpringSecurityEx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * Implement this bean Spring work filter chain through this config insteadof Default filter chain
     *
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception {

        //disable CSRF
        security.csrf(customizer->customizer.disable());
        //authorization all request
        security.authorizeHttpRequests(request->request.anyRequest().authenticated());
        //add form login (without this we cant logging) we can change those with our way
        //security.formLogin(Customizer.withDefaults());
        //Postman work
        security.httpBasic(Customizer.withDefaults());
        //
        security.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return security.build();
    }
}
