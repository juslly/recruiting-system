package com.thoughtworks.basic.domain;

public class Person {
    private String name;
    private int age;

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
