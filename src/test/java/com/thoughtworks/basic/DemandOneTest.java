package com.thoughtworks.basic;

import com.thoughtworks.basic.domain.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemandOneTest {
    @Test
    public void givenPersonClassWhenInvokingIntrodeceFuctionThenReturnOneSentence() {
        //given
        Person person = new Person("Tom" ,21 );

        //when
        String result = person.introduce(person.getName(),person.getAge());

        //then
        assertEquals(result,"My name is Tom. I am 21 years old.");
    }

}
