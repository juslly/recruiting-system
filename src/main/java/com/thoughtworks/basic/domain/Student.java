package com.thoughtworks.basic.domain;

public class Student extends Person{
    private String klass;
    public void introduce(){
        System.out.println("My name is Tom. I am 21 years old. I am a Student of Class 2");
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

}
