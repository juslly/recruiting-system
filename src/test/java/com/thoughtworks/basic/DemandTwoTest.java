package com.thoughtworks.basic;

import com.thoughtworks.basic.domain.ClassDTO;
import com.thoughtworks.basic.domain.Student;
import com.thoughtworks.basic.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class DemandTwoTest {
    @Test
    public void givenStudentClassWhenInvokingIntrodeceFuctionThenReturnOneSentence(){
        //given
        ClassDTO classDTO = new ClassDTO(2);
        Student student = new Student("Tom",21,classDTO);

        //when
        String result = student.introduce(student.getName(),student.getAge(),classDTO);

        //then
        Assert.assertEquals(result,"My name is Tom. I am 21 years old. I am a Student of Class 2.");

    }

    @Test
    public void givenTeacherClassWhenInvokingIntrodeceFuctionThenReturnOneSentence(){
        //given
        Teacher teacher = new Teacher("Matt",30,"Teacher");

        //when
        String result = teacher.introduce(teacher.getName(),teacher.getAge(),teacher.getJob());

        //then
        Assert.assertEquals(result,"My name is Matt. I am 30 years old. I am a Teacher.");

    }
}
