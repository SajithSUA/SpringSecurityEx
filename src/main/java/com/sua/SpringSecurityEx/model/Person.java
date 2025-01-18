package com.sua.SpringSecurityEx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    private String name;
    @Id
    private int id;
    private int age;

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person(id=" + this.getId() + ", name=" + this.getName() + ", age=" + this.getAge() + ")";
    }
}
