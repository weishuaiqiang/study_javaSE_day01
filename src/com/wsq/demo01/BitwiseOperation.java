package com.wsq.demo01;

/**
 *
 * 按位运算 左移 右移 无符号右移 没有无符号左移
 * 左移相当于乘2 右移相当于除2
 *
 * 与或非运算 异或运算
 *
 * 面试题：最高效方式的计算2 * 8？ 2 << 3 或 8 << 1
 *
 */

public class BitwiseOperation {
    public static void main(String[] args) {
        int i = -1117;
        // 右移 整体右移 左边补符号位
        System.out.println("i >> 2：" + (i >> 2));
        // 无符号右移 整体右移 左边补0
        System.out.println("i >>> 2：" + (i >>> 2));

        // 1.与运算 按位与
        int m = 12;     // 1100
        int n = 5;      // 0101
        System.out.println(m & n);  // 结果为0100 4

        // 2.或运算 按位或
        System.out.println(m | n);  // 结果为1101 13

        // 3,异或运算 按位异或 相同为0 不同为1
        System.out.println(m ^ n);  //结果为1001 9

        // 4.非运算 按位非 取反
        System.out.println(~m);
        // 原本为
        // 0000 0000 0000 0000 0000 0000 0000 1100
        // 结果是负数
        // 1111 1111 1111 1111 1111 1111 1111 0011
        // 负数的具体值为 求补码 也就是符号位不变 取反加1
        // 补码为
        // 1000 0000 0000 0000 0000 0000 0000 1101
        // 也就是 -13
        // 测试 -13 取反
        // 猜测 结果是 65536 - 13 = 65523
        System.out.println(~(-13));
        // 猜测错误 结果是12 结论：一个数两次取反 还等于原来的数
        // 证明
        // -13 原码是
        // 1111 1111 1111 1111 1111 1111 1111 0011
        // 注： 1000 0000 0000 0000 0000 0000 0000 1101 是补码
        // 求原码要把补码减一 然后除了符号位都取反
        // 故 -13 原码取反是
        // 0000 0000 0000 0000 0000 0000 0000 1100
        // 也就是12

        // 5. 练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
        // 方式一：定义临时变量的方式
        // 推荐的方式
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
        // 方式二：好处：不用定义临时变量
        // 缺点 1.相加操作可能超出存储范围，溢出
        // 2.有局限性
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
        // 方式三：使用位运算符
        // 有局限性：只能适用于数值类型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2; // 此时num2已经等于原来的num1
        num1 = num1 ^ num2; // 此时num1已经等于原来的num2
        System.out.println("num1 = " + num1 + ",num2 = " + num2);


    }
}
