package com.wsq.exercise;

/**
 * @author 86199
 *
 * 用来写各种小的练习题
 *
 */
public class Exercise {
    /**
     * 1.一个数如果恰好等于它的因子之和，这个数就称为“完数”，例如6 = 1 + 2 + 3
     * 题目要求：
     *  找出1000以内的所有完数。（因子：除去这个数本身的其他约数）
     */

    public static void getAllNumber(){
        for(int i = 1; i <= 1000; i++){
            int sum = 0;
            for(int j = 1; j <= i/2; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i + "是完数。");
            }
        }
    }

    /**
     * 2.输出以下结构
     * ******
     * *****
     * ****
     * ***
     * **
     * *
     */

    public static void showTwo(){
        for(int i = 6; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        showTwo();
    }

}
