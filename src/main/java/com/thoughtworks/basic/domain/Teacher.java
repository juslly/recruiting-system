package com.thoughtworks.basic.domain;

public class Teacher extends Person{
    private String job;

    public Teacher() {
    }

    public Teacher(String name, int age , String job) {
        super(name, age);
        this.job = job;
    }

    public String introduce(String name, int age ,String job){
        return "My name is " + name + ". I am " + age + " years old. I am a " + job + ".";
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
