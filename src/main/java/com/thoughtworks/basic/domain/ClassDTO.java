package com.thoughtworks.basic.domain;

public class ClassDTO {
    private int klass;
    private Teacher teacher;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ClassDTO(int klass) {
        this.klass = klass;
    }

    public ClassDTO(int klass, Teacher teacher) {
        this.klass = klass;
        this.teacher = teacher;
    }

}
