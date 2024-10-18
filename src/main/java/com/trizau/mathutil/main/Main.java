package com.trizau.mathutil.main;

import static com.trizau.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenWrongArgumentMinus5ThrowsException();

    }

    //về lý thuyết ta phải test với n = 2,3,..20 -> EXHAUSTIVE

    //TEST CASE #4
    //Description: test factorial with invalid argument
    //Steps:
    //  Call getFactorial(-5)
    //Expected result:
    //  an exception is thrown
    static void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        getFactorial(-5);
    }
    //Diễn giải: hàm của ta thiết kế rằng đưa n âm - hàm sẽ ném ngoại lệ

    //TEST CASE 3
    //Description: check getFactorial method with valid argument (n = 5)
    //Steps
    // Call function with n = 5
    //Expected value:
    //  Get 120 as the result of 5!
    //Status: waiting for test run
    //  Passed
    static void testFactorialGivenRightArgument5RunsWell() {

        System.out.println("5! expected: 120"
                         + " | actual: " + getFactorial(5));
    }

    //TEST CASE 2
    //Description: check getFactorial() method with valid argument (n = 1)
    //Steps/Procedures
    //  Call function method with n = 1 getFactorial(1)
    //Expected value:
    //  Get 1 as the result of 1!
    //Status: (passed/failed-bug) waiting for test run
    //passed
    //chạy các test case/ làm các bước ở trên thì gọi là test run
    static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1; //data input
        long expectedResult = 1;
        long actualResult = getFactorial(n);
        System.out.println("1! expected: " + expectedResult
                         + " | actual: " + actualResult);
    }

    //test case để ở đây
    static void testFactorialGivenRightArgument0RunsWell() {
        //TEST CASE #1
        //Description: check getFactorial() function with valia argument (n = 0)
        //Steps:
        //  Call function with n = 0 getFactorial(0)
        //Expected result:
        //  Get 1 as the result of 0!
        //Actual result/Status (passed/failed) (waiting for test run)

        //TEST RUN: run test case
        long expectedResult = 1;
        long actualResult = getFactorial(0); //named-argument
        System.out.println("expected value: " + expectedResult + " | actual value: " + actualResult);

    }



}