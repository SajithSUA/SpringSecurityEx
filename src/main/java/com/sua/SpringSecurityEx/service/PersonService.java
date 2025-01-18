package com.sua.SpringSecurityEx.service;

import com.sua.SpringSecurityEx.model.Person;
import com.sua.SpringSecurityEx.repo.PersonRepo;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;

    public Person create(Person person) {
        return personRepo.save(person);
    }

    public Person findById(int id) {
        return personRepo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Person not found", Person.class));
    }
}
