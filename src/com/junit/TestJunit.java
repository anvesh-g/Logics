package com.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void testAdd(){
        String test="Junit setup test";
        assertEquals("Junit setup test",test);
    }
}
