package com.sua.SpringSecurityEx.controller;

import com.sua.SpringSecurityEx.data.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private final List<Student> students = new ArrayList<>(List.of(
            new Student("sajith", 100, 1),
            new Student("Umangi", 80, 2)
    ));


    @GetMapping("/students")
    public List<Student> getStudent() {
        return students;
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        this.students.add(student);
        return student;
    }

    /**
     * Change APIs (POST,PUT,DELETE,PATCH) not work without this CSRF token when we add spring security
     * @param request http servlet request
     * @return csrf token
     */
    @GetMapping("/csrf-token")
    public CsrfToken getCsrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
