package com.vivi;

/**
 * 0 1 1 2 3 5 8 13 21 ......
 * 前俩个数之和
 * n   第几次
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        int i = test1(6);
        System.out.println(i);
    }

    public static int test1 (int n){
        if (n<=1){
            return 1;
        }
    // System.out.println(n);
        return test1(n - 1) + test1(n - 2);
    }
}
