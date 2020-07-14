package com.thoughtworks.basic;

import com.thoughtworks.basic.domain.ClassDTO;
import com.thoughtworks.basic.domain.Student;
import com.thoughtworks.basic.domain.Teacher;
import com.thoughtworks.basic.service.MyObserverable;
import com.thoughtworks.basic.service.Observer;
import org.junit.Assert;
import org.junit.Test;

public class DemandFourTest {
    @Test
    public void whenStudentInfoChangeShouldNoticeOtherStudentAndTeacher(){
        //given
        ClassDTO classDTO = new ClassDTO(2);
        Student changeInfoStudent = new Student("Tom" ,21,classDTO);
        Teacher teacher = new Teacher();

        MyObserverable myObserverable = changeInfoStudent;
        Observer receiveInfoStudent1 = new Student("juslly",18,classDTO);
        Observer receiveInfoStudent2 = new Student("liuliu",18,classDTO);
        Observer receiveInfoTeacher = new Teacher();
        myObserverable.addObserver(receiveInfoStudent1);
        myObserverable.addObserver(receiveInfoStudent2);
        myObserverable.addObserver(receiveInfoTeacher);
        ClassDTO classDTO1 = new ClassDTO(3);


        //when
        changeInfoStudent.setName("changeTom");

        changeInfoStudent.setClassDTO(classDTO1);

        String noticeMessage = changeInfoStudent.notice(changeInfoStudent.getName(),changeInfoStudent.getAge(),changeInfoStudent.getClassDTO().getKlass());
        String receiveResult1 = receiveInfoStudent1.receive(noticeMessage);
        String receiveResult2 = receiveInfoStudent2.receive(noticeMessage);
        String receiveResult3 = receiveInfoTeacher.receive(noticeMessage);
        //then
        Assert.assertEquals(noticeMessage ,"My name is changeTom. I am 21 years old. I am a student of Class 3 now.");
        Assert.assertEquals(receiveResult1,"My name is changeTom. I am 21 years old. I am a student of Class 3 now.");
        Assert.assertEquals(receiveResult2,"My name is changeTom. I am 21 years old. I am a student of Class 3 now.");
        Assert.assertEquals(receiveResult3,"My name is changeTom. I am 21 years old. I am a student of Class 3 now.");

    }
}
