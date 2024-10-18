package com.trizau.mathutil.core;

//ta tạo bộ thư viện cung cấp các hàm tiện ích liên quan toán học
//vì là đồ tiện ích dùng chung, tool cho nhiều nơi sử dụng -> hàm static
public class MathUtility {

    //hàm tính giai thừa n!
    //ko có giai thừa số âm
    //0! = 1! = 1
    //20! vừa đủ kiểu long, 18 con số 0
    //bài này ko chơi với 21!
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n");
        if (n == 0 || n == 1)
            return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;

    }
}
