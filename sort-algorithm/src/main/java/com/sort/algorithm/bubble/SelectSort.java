/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.sort.algorithm.bubble;

/**
 * 假定在待排序的记录序列中，存在多个具有相同的关键字的记录，若经过排序，这些记录的相对次序保持不变，
 * 即在原序列中，r[i]=r[j]，且r[i]在r[j]之前，而在排序后的序列中，r[i]仍在r[j]之前，则称这种排序算法是稳定的；否则称为不稳定的。
 *
 * 堆排序、快速排序、希尔排序、直接选择排序是不稳定的排序算法，
 * 而基数排序、冒泡排序、直接插入排序、折半插入排序、归并排序是稳定的排序算法。
 *
 * 选择排序：默认将第一个值的索引为记录为最小值索引，依次和后面的值进行比较，如果比当前索引还小，那么最小值索引被替换。且值也进行对调。
 * 第一次遍历结束后，第一个位置的值将会是最小的值。
 *
 * 举个例子，序列5 8 5 2 9， 我们知道第一遍选择第1个元素5会和2交换，那么原序列中两个5的相对前后顺序就被破坏了，
 * 所以选择排序不是一个稳定的排序算法。
 *
 * @author luqm
 * @version SelectSort, v0.1 2019/10/14 13:34
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {3, 20, 5, 38, 15, 27, 26, 2};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    // 获取值最小的index位置
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // 表示index = i的数据不是最小，那么进行替换
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
