package com.thoughtworks.basic.domain;

import com.thoughtworks.basic.service.MyObserverable;
import com.thoughtworks.basic.service.Observer;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements MyObserverable,Observer{
    private ClassDTO classDTO;

    public Student() {
    }

    public Student(String name, int age, ClassDTO classDTO) {
        super(name, age);
        this.classDTO = classDTO;
    }

    public String introduce(String name, int age, ClassDTO classDTO){
        return "My name is " + name + ". I am " + age + " years old. I am a Student of Class " + classDTO.getKlass()+ ".";
    }

    public ClassDTO getClassDTO() {
        return classDTO;
    }

    public void setClassDTO(ClassDTO classDTO) {
        this.classDTO = classDTO;
    }
    //别称
    private String name = "titi";

    //定义观察者集合
    private List<Observer> observerList = new ArrayList<Observer>();
    @Override
    public void addObserver(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }

    }

    @Override
    public String notice(String name,int age,int klass) {
        String result = "";
        for(Observer observer:observerList){
            result = observer.update(name,age,klass);
        }
        return result;

    }

    @Override
    public String update(String name, int age,int klass) {

        return "My name is " + name + ". I am " + age + " years old. I am a student of Class " + klass + " now.";

    }

    @Override
    public String receive(String message) {
        return message;
    }
}
