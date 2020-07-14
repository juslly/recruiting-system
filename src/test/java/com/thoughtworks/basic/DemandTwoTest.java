package com.thoughtworks.basic;

import com.thoughtworks.basic.domain.Student;
import com.thoughtworks.basic.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class DemandTwoTest {
    @Test
    public void givenStudentClassWhenInvokingIntrodeceFuctionThenReturnOneSentence(){
        //given
        Student student = new Student();

        //when
        String result = student.introduce();

        //then
        Assert.assertEquals(result,"My name is Tom. I am 21 years old. I am a Student of Class 2");

    }

    @Test
    public void givenTeacherClassWhenInvokingIntrodeceFuctionThenReturnOneSentence(){
        //given
        Teacher teacher = new Teacher();

        //when
        String result = teacher.introduce();

        //then
        Assert.assertEquals(result,"My name is Matt. I am 30 years old. I am a Teacher.");

    }
}
