package org.test.unitTest.services;

import org.junit.*;

import java.util.Date;

public class calculatorServicesTest {

    int counter=0;


    //before
    //beforeclass is always static void not only void.

    //after class cleanup is needed // open file
    @BeforeClass
    public static void init(){
        System.out.println("before all classses");
        System.out.println("Started test : "+new Date());
//connection open/close connection
    }


    //test to addTwoNumbersTest case
    
    @Before
    public void beforeEach(){

        System.out.println("before each test case it runs");
        //har ek case se pehle counter ki value zero kardenge
        counter=0;
    }

    
    
    //before to execute tye method before each test

    @Test(timeout = 10000)
    public void addTwoNumbersTest() throws InterruptedException {
        //by adding int counter-0;
        for(int i=1;i<20;i++){
            counter+=i;
        }
        Thread.sleep(3000);

        System.out.println("test for addTwoNumbersTest");
        int result=calculatorServices.addTwoNumbers(12,8);
        int expected=20;
        System.out.println("counter int first test case :"+counter);
        // to check result is actual or expected

        //to check there is a class called assert

        Assert.assertEquals(expected,result);
        //actual result
        //expected method

    }
    @Test
    public void sumAnyNumbersTest(){
        for(int i=1;i<100;i++) {
            counter += i;
        }
        System.out.println("sumAnyNumbersTest");

         int result=calculatorServices.sumAnyNumbers(12,8,10,7);
         int expected=37;
        System.out.println("counter int second test case :"+counter);
         Assert.assertEquals(expected,result);
    }

    @Test
    public void productTwoNumbersTest(){
        System.out.println("productTwoNumbersTest");
        int result=calculatorServices.productTwoNumbers(4,2);
        int expected=8;
        Assert.assertEquals(expected,result);
    }

//afterall test cases

    @AfterClass
    public static void cleanUp(){
        System.out.println("after all test cases");
        System.out.println("Ended test : "+new Date());
    }
}



// all important points related to junit 4
//annotations-- beforeClass,afterClass,test,before,after
//@test(timeout=2000) example