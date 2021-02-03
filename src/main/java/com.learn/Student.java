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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getCar() {
        return car;
    }

    public void setCar(java.lang.String car) {
        this.car = car;
    }
}
