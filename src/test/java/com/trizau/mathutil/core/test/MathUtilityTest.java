package com.trizau.mathutil.core.test;

import static com.trizau.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
class MathUtilityTest {


    //cấu trúc test case: ID, Desc, Steps, expected, actual, status
    //bug (bugzilla, jira)

    //test case 3: check getFactorial() with n = -5;
    //ngoại lệ xuất hiện trong tình huống n âm hoặc n > 20
    //có ngoại lệ thì có màu xanh
    void testFactorialGivenWrongArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
    }

    @Test
    void testFactorialGivenRightArgumentRunsWell() {
        //hiện đại: sử dụng thêm tool, thư viện unit testing framework JUnit
        //giúp nhìn kết quả qua 2 màu xanh và đỏ
        assertEquals(120, getFactorial(5));
        assertEquals(1, getFactorial(1));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(720, getFactorial(6));
    }
}

//quy tắc xanh đỏ của unit test tool/framework
//nếu tất cả các test case passed (expected = actual)
//chỉ cần 1 trong những test case failed
//hàm đã đúng thì phải đúng hết với các test case đã đưa ra
//mắt chỉ nhìn 2 tín hiệu xanh đỏ theo style gộp các kết quả
//xanh đúng hết, đỏ có tk nào đó chết

//kĩ thuật viết code chính (hàm trong api, core,...) mà đi kèm code test hàm và dùng 2
//trạng thái xanh đỏ, cứ liên tục code chạy xanh đỏ, sửa, chạy lại xanh đỏ, tối ưu chỉnh code
//xanh đỏ liên tục trong quá trình viết code đgl tdd
//test driven development - viết code song hành cùng code test