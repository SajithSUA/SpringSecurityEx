package com.sua.SpringSecurityEx.repo;

import com.sua.SpringSecurityEx.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {
}
