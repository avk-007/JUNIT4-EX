package org.test.unitTest.services;

public class calculatorServices {
    /**
     * *
     * add
     */
    public static int addTwoNumbers(int a , int b){

        return a+b;
    }


    /**
     *
     * product
     */
    public static int productTwoNumbers(int a,int b){

        return a*b;
    }

    /**
     *
     * divide
     */

    public static int divideTwoNumbers(int a ,int b){


        return a/b ;
    }

    public static int sumAnyNumbers(int ...numbers){
       int s=0;
       for(int n:numbers){
           s+=n;
       }

        return s;
    }

}
