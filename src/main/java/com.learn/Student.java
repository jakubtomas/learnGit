package com.learn;

public class Student {
    private int age;
    private String name;
    private String car;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.car = "Tesla";
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", car='" + car + '\'' +
                '}';
    }
}
