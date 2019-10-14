/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.sort.algorithm.bubble;

/**
 * 插入排序（Insertion-Sort）:通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
 *
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 *
 * @author luqm
 * @version InsertSort, v0.1 2019/10/14 14:08
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {3,20,5,38,15,27,26,2};
        insertSort2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }

    private static void insertSort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                // 依次对小于i的已排序区进行对比，找到合适的位置，跳出当前循环
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    // 否则增加了无用的遍历
                    break;
                }
            }
        }
    }

}
