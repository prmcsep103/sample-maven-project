package com.nopcommerce.demo.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGPriority {

    @Test()
    public void test1(){
        System.out.println("I am in test1");
    }

    @Ignore // Ignore the test
    @Test(priority = 2)
    public void atest2(){
        System.out.println("I am in test2");
    }

    @Test(priority = 1)
    public void test(){
        System.out.println("I am in test");
    }
}
