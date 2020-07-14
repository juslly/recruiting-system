package com.thoughtworks.basic.service;

public interface MyObserverable {
    //添加便衣观察者
     void addObserver(Observer observer);
    //移除便衣观察者
     void removeObserver(Observer observer);
     //通知观察者
     String notice(String name,int age,int klass);
     String update(String name, int age,int klass);
}
