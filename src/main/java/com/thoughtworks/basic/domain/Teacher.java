package com.thoughtworks.basic.domain;

public class Teacher extends Person{
    private String job;

    public String introduce(){
        return "My name is Matt. I am 30 years old. I am a Teacher.";
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
