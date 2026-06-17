package com.yit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void appTest(){
        App app =new App();
        int result = app.add(5,10);
        System.out.println("running test:" +result);
        assertEquals(15.0,result);
    }
}
