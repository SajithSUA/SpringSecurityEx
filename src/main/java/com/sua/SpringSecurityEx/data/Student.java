package com.sua.SpringSecurityEx.data;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Student implements Serializable {
    private String name;
    private int id;
    private int mark;

    public Student(String name, int mark, int id) {
        this.name = name;
        this.mark = mark;
        this.id = id;
    }
}
