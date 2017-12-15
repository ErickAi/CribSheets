package com.er.testPack;

import org.junit.*;

import static org.junit.Assert.*;

public class CalcTest {
    private Calc c;

    //@BeforeClass @AfterClass @After
    @Before
    public void beforeClass(){
        c = new Calc();
    }
    @Test
    public void add() throws Exception {
        int add = c.add(2, 5);
        if (add != 7) {
            fail("message");
        }
        assertTrue(c.add(2,5)==7);            //
        assertEquals("mes",c.add(2,5),7);//
        //assertFalse(); assertNull(); assertNotNull();
    }

    @Test(expected =  ArithmeticException.class)
    public void divByZeroException() throws Exception {
    c.divide(2,0);
    }

}