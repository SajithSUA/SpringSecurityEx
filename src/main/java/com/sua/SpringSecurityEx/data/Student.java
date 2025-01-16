package com.sua.SpringSecurityEx.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String name;
    private int id;
    private int mark;

    public Student(String name, int mark, int id) {
        this.name = name;
        this.mark = mark;
        this.id = id;
    }
}
