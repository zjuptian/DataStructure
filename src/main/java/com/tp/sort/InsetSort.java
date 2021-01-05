package com.tp.sort;

/**
 * @Author: zjuptian
 * @Date: 2021/1/5 10:49
 * @Description: 插入排序，时间复杂度O(n^2)
 */
public class InsetSort {
    public static void InsertSort(int[] array){
        int temp;
        int i;
        int p;
        for(p = 1; p < array.length; p++){
            temp = array[p];
            for(i = p; i >=1; i--){
                if(array[i-1] <= temp){
                    break;
                }
                else {
                    array[i] = array[i-1];
                }
            }
            array[i] = temp;
        }
    }
}
