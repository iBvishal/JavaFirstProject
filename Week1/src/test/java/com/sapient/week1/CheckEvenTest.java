package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenTest 
{
    private CheckEven app;
    
    @Before
    public void setup() {
        app = new CheckEven();
    }
    
    
    @Test
    public void testingNumber1() {
        boolean val = app.CheckEven(10);
        assertTrue(val == true);
    }

    @Test
    public void testingNumber2() {
        boolean val = app.CheckEven(-5);
        assertTrue(val == false);
    }

    @Test
    public void testingNumber3() {
        boolean val = app.CheckEven(15);
        assertTrue(val == false);
    }

    @Test
    public void testingNumber4() {
        boolean val = app.CheckEven(-20);
        assertTrue(val == true);
    }
}
