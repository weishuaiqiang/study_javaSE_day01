package com.wsq.demo02;

/**
 *
 * 数组的相关操作：
 * 复制、反转、查找（或搜索）、排序
 * 查找有：线性查找、二分查找等等
 * 排序有 十大内部排序算法 ：
 *  选择排序
 *      直接选择排序、堆排序
 *  交换排序
 *      冒泡排序、快速排序
 *  插入排序
 *      直接插入排序、折半插入排序、Shell排序（希尔排序）
 *  归并排序
 *  桶式排序
 *  基数排序
 * @author 86199
 */

public class ArrayTest {

    /**
     * 数组的复制
     * @param arr1  源数组
     * @param arr2  目标数组
     */
    public static void arrayCopy(String[] arr1, String[] arr2){
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        // 可以用 System.arraycopy(arr1, 0, arr2, 0, arr1.length); 代替
    }

    /**
     * 数组的反转
     * @param arr   要被反转的数组
     */
    public static void arrayReverse(String[] arr){

        // 方法一
        for (int i = 0; i < arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        /* 方法二
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/

    }

    /**
     * 数组的查找（或搜索）
     * 线性查找
     * @param arr   在哪个数组中查找
     * @param dest  要查找的目标
     */
    public static void arrayLinearSearch(String[] arr, String dest){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if(dest.equals(arr[i])){
                System.out.println("找到了指定的元素("+ dest + ")，下标为：" + i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("很遗憾，没找到（" + dest + "）元素！！！");
        }
    }

    /**
     * 数组的查找（或搜索）
     * 二分查找
     * 前提：所要查找的数组必须有序
     * @param arr   在哪个数组中查找
     * @param dest  要查找的目标
     */
    public static void arrayBinarySearch(int[] arr, int dest){
        // 定义初始的首索引
        int head = 0;
        // 定义初始的末索引
        int end = arr.length - 1;
        boolean flag = false;
        while (head <= end){
            int mid = (head + end) / 2;
            if (dest < arr[mid]){
                end = mid - 1;
            } else if (dest == arr[mid]){
                System.out.println("找到了指定的元素（"+ dest + "），下标为：" + mid);
                flag = true;
                break;
            } else {
                head = mid + 1;
            }
        }
        if (!flag){
            System.out.println("很遗憾，没有找到！！！");
        }
    }

    /**
     * 冒泡排序（bubble sort）：
     * 假定题目要求从小到大排列
     * @param arr   被排序的数组
     */
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int anInt : arr){
            System.out.print(anInt + "\t");
        }
    }




    public static void main(String[] args) {

        String[] arr1 = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA", "ZZ"};
        /* 数组的复制
        String[] arr2 = new String[arr1.length];
        arrayCopy(arr1, arr2);
        for (String str : arr2){
            System.out.print(str + "\t");
        }
        */

        /* 数组的反转
        arrayReverse(arr1);
        for (String str : arr1){
            System.out.print(str + "\t");
        }
        */

        /* 数组的查找（或搜索）
        String dest = "BB";

        // 线性查找
        arrayLinearSearch(arr1, dest);
        // 二分查找
        int[] arr2 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
        arrayBinarySearch(arr2, 105);
        */

        /* 冒泡排序 */
        int[] arr = new int[]{3, 1, -1, 5, 99, -23, 78};
        bubbleSort(arr);

    }
}
