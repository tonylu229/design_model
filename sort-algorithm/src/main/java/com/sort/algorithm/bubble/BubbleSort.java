/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.sort.algorithm.bubble;

/**
 * 冒泡排序：将相邻两个数据进行比较，大的放右边，第一次遍历结束后，最右边应该为最大值，以此类推。
 * 稳定的排序方式
 *
 * @author luqm
 * @version BubbleSort, v0.1 2019/10/14 11:06
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,20,5,38,15,27,26,2};
//        sort(arr);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr 待排序的数组
     */
    private static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                // 左右相邻数字进行比较，如果左边比右边大，那么对换一下位置
               if (arr[j -1] > arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[j -1];
                   arr[j -1] = temp;
               }
            }
        }
    }


    /**
     * 我也不知道这是什么算法的排序
     *
     * @param arr 待排序的数组
     */
    private static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (a > arr[j]){
                    int small = arr[j];
                    arr[i] = small;
                    arr[j] = a;
                    a = small;
                }
            }
        }
    }
}
