package com.sua.SpringSecurityEx;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String getName(HttpServletRequest request)
    {

        return "Hello this my first API" + request.getSession().getId();
    }
}
