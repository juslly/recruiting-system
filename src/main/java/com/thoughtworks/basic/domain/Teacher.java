package com.thoughtworks.basic.domain;

import com.thoughtworks.basic.service.MyObserverable;
import com.thoughtworks.basic.service.Observer;

public class Teacher extends Person implements Observer {
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

    @Override
    public String update(String name, int age, int klass) {
        return "My name is " + name + ". I am " + age + " years old. I am a student of Class " + klass + " now.";
    }

    @Override
    public String receive(String message) {
        return message;
    }
}
