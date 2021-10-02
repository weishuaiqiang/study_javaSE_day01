package com.wsq.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {
    /**
     * 1.写出一维数组初始化的两种方式
     *  int[] arr = new int[]{1, 2, 3, 4};
     *  int[] arr2 = new int[4];
     *
     * 2.写出二维数组初始化的两种方式
     *  int[][] arr = new int[][]{{1, 2}, {3, 4}};  //静态初始化
     *  int[][] arr2 = new int[2][2];   //动态初始化1
     *  int[][] arr3 = new int[2][];    //动态初始化2
     *
     * 3.如何遍历如下的二维数组
     * int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
     */

    /** ergodic adj.各态历经的，遍历的 */
    public static void ergodic(){
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 4.不同类型的一维数组元素的默认初始值各是多少？
     * char             ：0
     * short int long   ：0
     * float double     ：0.0
     * boolean          ：false
     * 引用类型          ：null
     *
     * 5.获取arr数组中所有元素的和
     * int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
     */

    public static void getSumFive(){
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        // 记录总和
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("arr数组中所有元素的总和是：" + sum);
    }

    /**
     * 6.杨辉三角
     */

    public static void yangHuiTriangle(){
        int[][] arr = new int[10][];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i+1];
            // 边角赋值为 1
            arr[i][0] = arr[i][i] = 1;
            for(int j = 1; j < arr[i].length - 1; j++){
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for(int[] ints : arr){
            for(int anInt : ints){
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 7.拓展之笔试题
     * 创建一个长度为6的int型数组，要求数组元素的值都在1~30之间，且是随机赋值。
     * 同时，要求元素的值各不相同。
     */

    public static void randomIntArray(){
        // 定义随机对象
        Random random = new Random();
        // 生成6个随机数
        int[] arr = new int[6];
        int i = 0;
        label : while (i < 6) {
            int ints = random.nextInt(30) + 1;
            for(int j = 0; j < i; j++){
               if(arr[j] == ints){
                   continue label;
               }
            }
            arr[i] = ints;
            i++;
        }
        for (int ints : arr){
            System.out.println(ints);
        }
    }

    /**
     * 8.拓展之面试题
     * 回形针，例如：一个三阶的回形针如下
     * 1 2 3    1  2  3  4
     * 8 9 4    12 13 14 5
     * 7 6 5    11 16 15 6
     *          10 9  8  7
     * clip
     * n. 夹子，修剪。（金属或塑料的）回形针，首饰别针，剪短
     *
     */

    /** 方法一 */
    public static void clip(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要形成几阶回形针：");
        int level = scanner.nextInt();

        // 定义二维数组
        int[][] arr = new int[level][level];
        int maxNum = level * level;
        int i = 0, j = 0;
        int m = 1;
        // m = 1 向右，m = 2 向下，m = 3 向左，m = 4 向上
        for (int k = 1; k <= maxNum; k++){
            if(m == 1){
                if(j < level && arr[i][j] == 0){
                    arr[i][j++] = k;
                } else {
                    m = 2;
                    i ++;
                    j --;
                }
            }
            if(m == 2){
                if(i < level && arr[i][j] == 0){
                    arr[i++][j] = k;
                } else {
                    m = 3;
                    i --;
                    j --;
                }
            }
            if(m == 3){
                if(j >= 0 && arr[i][j] == 0){
                    arr[i][j--] = k;
                } else {
                    m = 4;
                    i --;
                    j ++;
                }
            }
            if (m == 4) {
                if(arr[i][j] == 0){
                    arr[i--][j] = k;
                } else {
                    m = 1;
                    i ++;
                    j ++;
                    k --;
                }
            }
        }

        for(int[] ints : arr){
            for (int anInt : ints){
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }

    /** 方法二 */
    public static void clipTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要形成几阶回形针：");
        int level = scanner.nextInt();

        // 定义二维数组
        int[][] arr = new int[level][level];
        int count = 0;
        int maxI = level - 1;
        int maxJ = level - 1;
        int minI = 0;
        int minJ = 0;
        while (minJ <= maxJ){
            for(int j = minJ; j <= maxJ; j++){
                arr[minI][j] = ++count;
            }
            minI ++;
            for(int i = minI; i <= maxI; i++){
                arr[i][maxJ] = ++count;
            }
            maxJ --;
            for(int j = maxJ; j >= minJ; j--){
                arr[maxI][j] = ++count;
            }
            maxI --;
            for(int i = maxI; i >= minI; i--){
                arr[i][minJ] = ++count;
            }
            minJ ++;
        }

        for(int[] ints : arr){
            for (int anInt : ints){
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
         clipTwo();
    }

}
