package com.wsq.demo01;

/**
 *  自动类型转换：
 *
 *  强制类型转换：
 */


public class AutoTypeConversion {
    public static void main(String[] args) {

        /** // 1.byte 转 int 自动转换
        byte b1 = 2;
        int i1 = 12;
        // b1 和 i1 相加 应该用 int类型接收 也可以用 long 类型接收 以此类推
        int i2 = b1 + i1;
        System.out.println(i2); // 结果为14 */

        /** // 2.short 转 int 自动转换
        short s1 = 22;
        int i1 = 12;
        int i2 = s1 + i1;
        System.out.println(i2); // 结果为34 */


        /** // 3.byte 转 short
        byte b1 = 2;
        char c1 = 'a';

        short c2 = b1;
        System.out.println(c2); */

        /** //强制类型转换
        // 1.double 转 int
        double d1 = 12.32;
        int i1 = (int)d1;   //截断，只取整数部分，损失精度
        System.out.println(i1);*/

        // 2.转换后为负数
        int i1 = 128;
        byte b1 = (byte)i1;
        System.out.println(b1); // 结果为-128
        // 因为转换之后 b1 的二进制位是 10000000 这种数比较特殊
        // 表示负的最小值 -128


    }
}
