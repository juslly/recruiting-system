package com.thoughtworks.basic;

import com.thoughtworks.basic.domain.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemandOneTest {
    @Test
    public void givenPersonClassWhenInvokingIntrodeceFuctionThenReturnOneSentence() {
        //given
        Person person = new Person();

        //when
        String result = person.introduce();

        //then
        assertEquals(result,"My name is Tom. I am 21 years old.");
    }

}
