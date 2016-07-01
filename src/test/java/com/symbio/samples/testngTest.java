package com.symbio.samples;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class testngTest
{

    @Test
    public void method1() {
        long id = Thread.currentThread().getId();
        System.out.println("method1 is executed in thread " + id);    
    }

   @Test    
    public void method2() {
        long id = Thread.currentThread().getId();
        System.out.println("method2 is executed in thread " + id);    
    }

   @Test    
    public void method3() {
        long id = Thread.currentThread().getId();
        System.out.println("method3 is executed in thread " + id);
    }

    @Test
    public void method4() {
        long id = Thread.currentThread().getId();
        System.out.println("method3 is executed in thread " + id);
    }

 
}
