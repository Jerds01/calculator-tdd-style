package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
     public void testSum(){
        int sum = calc.sum(1,2);
        assertEquals(3, sum);
    }

    @Test
    public void testSumFloat(){
        float sum = calc.sum(1.1f, 5.1f);
        assertEquals(6.2f, sum, .0001);
    }
    @Test
    public void testSumDouble(){
        double sum = calc.sum(1.1, 5.1);
        assertEquals(6.2, sum, .0001);
    }
    @Test
    public void testSumLong(){
        long sum = calc.sum((long)1, (long)5);
        assertEquals(6, sum);
    }
    @Test
    public void testSumShort(){
        short sum = calc.sum( (short)1, (short )5);
        assertEquals(6, sum, 0.0001);
    }

    @Test
    public void testSubtractionInt(){
        int difference= calc.subtract(6,2);
        assertEquals(4, difference);
    }
    @Test
    public void testSubtractionFloat(){
        float difference= calc.subtract(6.5f,2.3f);
        assertEquals(4.2, difference,  0.0001);
    }
    @Test
    public void testSubtractionDouble(){
        double difference= calc.subtract(6.5,2.3);
        assertEquals(4.2, difference, 0.0001);
    }
    @Test
    public void testSubtractionLong(){
        long difference= calc.subtract((long) 6, (long) 2);
        assertEquals(4, difference,  0.0001);
    }
    @Test
    public void testSubtractionShort(){
        short difference= calc.subtract((short) 6.2, (short) 2.1);
        assertEquals(4, difference,  0.0001);
    }
    @Test
    public void testMultiplicationInt(){
        int product= calc.multiply(6,2);
        assertEquals(12, product);
    }
    @Test
    public void testMultiplicationFloat(){
        float product= calc.multiply(6.5f,2.3f);
        assertEquals(14.95, product,  0.0001);
    }
    @Test
    public void testMultiplicationDouble(){
        double product= calc.multiply(6.5,2.3);
        assertEquals(14.95, product, 0.0001);
    }
    @Test
    public void testMultiplicationLong(){
        long product= calc.multiply((long) 6, (long) 2);
        assertEquals(12, product,  0.0001);
    }
    @Test
    public void testMultiplicationShort(){
        short product= calc.multiply((short) 6.2, (short) 2.1);
        assertEquals(12, product,  0.0001);
    }

}