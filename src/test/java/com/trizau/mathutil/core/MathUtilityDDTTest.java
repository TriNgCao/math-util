package com.trizau.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //@Test là 1 phần annotation của framework, biến cái hàm của ta thành hàm main
    //để có thể run, hàm bth chỉ có thể trong main() để chạy
    //@Test biến hàm bất kì thành main()

    //kix thuật ddt - data driven testing: là kĩ thuật tách bộ data kiểm thử ra khỏi vác câu lệnh kiểm thử
    //mục đích giúp dev nhìn nhanh được xem bộ test case còn thiếu case nào hay ko
    //kĩ thuật này còn được gọi tên khác là tham số hóa bộ data kiểm thử
    //parameterized testing

    public static Object[][] initTestData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 72},
        };
    }

    public static Integer[] initTestDataForCheckingExceptions() {
        return new Integer[] {-1, -2, -3, -4, -5, 78, 99};
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentsRunWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingExceptions")
    void testFactorialGivenWrongArgumentsRunWell(int n) {
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(n));
    }



}