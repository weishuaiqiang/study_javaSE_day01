package com.wsq.exercise;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

import java.util.Arrays;
import java.util.Scanner;

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

    /**
     * 3.升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），空调
     * 、卫生间、厨房齐全、屋内均是IT行业人士，喜欢安静。所以要求来租者最好是
     * 同行或者刚毕业的年轻人、爱干净、安静。
     */
    public static void getNumberThree(){
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for(int i = 0; i < index.length; i++){
            tel += arr[index[i]];
        }
        System.out.println("联系方式为：" + tel);
        // 猜测是：联系方式为：18013820100
        // 结果是：联系方式为：18013820100
    }

    /**
     * 4.从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
     * 成绩 >= 最高分 - 10   等级为'A'
     * 成绩 >= 最高分 - 20   等级为'B'
     * 成绩 >= 最高分 - 30   等级为'C'
     * 其余                 等级为'D'
     */

    public static void inAchievementOutLevel(){
        Scanner scanner = new Scanner(System.in);

        // 定义学生人数
        System.out.print("请输入学生人数：");
        int number = scanner.nextInt();

        // 定义成绩数组，输入成绩，并获取最高分
        int[] achievement = new int[number];
        int max = -1;
        System.out.println("请输入学生的成绩：");
        for(int i = 0; i < number; i++){
            achievement[i] = scanner.nextInt();
            // 获取最高分
            max = Math.max(max, achievement[i]);
        }
        System.out.println("最高分是：" + max);

        // 输出等级
        for(int i = 0; i < number; i++){
            char level;
            switch ((max - achievement[i])/10){
                case 0:
                    level = 'A';
                    break;
                case 1:
                    level = 'B';
                    break;
                case 2:
                    level = 'C';
                    break;
                default:
                    level = 'D';
                    break;
            }
            System.out.println(i + 1 + "号学生的成绩是：" + achievement[i] + "，等级是：" + level + "。");
        }

    }



    public static void main(String[] args) {
        inAchievementOutLevel();
    }

}
