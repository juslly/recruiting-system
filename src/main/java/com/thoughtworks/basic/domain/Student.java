package com.thoughtworks.basic.domain;

public class Student extends Person{
    private int klass;

    public Student(String name, int age,int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(String name,int age,int klass){
        return "My name is " + name + ". I am " + age + " years old. I am a Student of Class " + klass + ".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
