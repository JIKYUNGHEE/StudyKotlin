package com.gaeng0517.kotlininaction.ch6;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class ExampleTest6_JavaTest {
    @Test
    public void ch6_2_3_6() {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        if (i1 == i2)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }

    @Test
    public void ch6_2_3_5() {
        System.out.println(new Integer(42).equals(new Long(42)));
//        assertEquals(new Integer(42), new Long(42));
    }

    @Test
    public void ch6_2_3_9() {
        System.out.println(new Integer(42).equals(new Long(42)));
//        assertEquals(new Integer(42), new Long(42));
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        };
    }
}