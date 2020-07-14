package com.thoughtworks.basic;

import com.thoughtworks.basic.domain.ClassDTO;
import com.thoughtworks.basic.domain.Student;
import com.thoughtworks.basic.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class DemandThreeTest {
    @Test
    public void givenStuClassAndTeaClassWhenClassIsStuAndTeaDTOThenReturnMultiStuAndOneTea(){
        //given
        ClassDTO classDTO = new ClassDTO(3);
        Student student1 = new Student("juslly",18,classDTO);
        Student student2 = new Student("amili" ,20,classDTO);


        //when
        String result1 = student1.introduce(student1.getName(),student1.getAge(),student1.getClassDTO());
        String result2 = student2.introduce(student2.getName(),student2.getAge(),student2.getClassDTO());

        //then
        Assert.assertEquals(result1,"My name is juslly. I am 18 years old. I am a Student of Class 3.");
        Assert.assertEquals(result2,"My name is amili. I am 20 years old. I am a Student of Class 3.");
    }

}
