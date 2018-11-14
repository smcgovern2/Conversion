package Conversion.Test;


import Conversion.Subject;

import static org.junit.Assert.assertEquals;

public class SubjectTest {
    Subject subject;

    @org.junit.Before
    public void setup() {
        subject = new Subject();
        subject.setState(7);
    }
    @org.junit.Test
    public void getState() {
        assertEquals(subject.getState(), 7);
    }


}