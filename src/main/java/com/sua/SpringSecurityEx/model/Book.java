package com.sua.SpringSecurityEx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    private int id;
    private String name;
    @ManyToOne(targetEntity = Person.class)
    private Person author;

    public int getId() {
        return id;
    }

    public Person getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Book(id=" + this.getId() + ", name=" + this.getName() + ", author=" + this.getAuthor() + ")";
    }
}
