package com.sua.SpringSecurityEx.controller;

import com.sua.SpringSecurityEx.model.Person;
import com.sua.SpringSecurityEx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }
}
