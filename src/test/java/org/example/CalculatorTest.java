package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc;


    @BeforeEach
    public void setUpCalc(){
        calc = new Calculator();
    }

    @Test
    public void testSum(){
        int sum = calc.sum(1,2);
        assertEquals(3, sum);
    }

    @Test
    public void testSumFloat(){
        float sum = calc.sum(1.1f, 5.1f);
        assertEquals(6.2f, sum, .001);
    }
    @Test
    public void testSumDouble(){
        double sum = calc.sum(1.1, 5.1);
        assertEquals(6.2, sum);
    }
    @Test
    public void testSumLong(){
        long sum = calc.sum(1.1, 5.1);
        assertEquals(6.2, sum);
    }
    @Test
    public void testSumShort(){
        short sum = calc.sum(1, 5);
        assertEquals(6, sum);
    }

}