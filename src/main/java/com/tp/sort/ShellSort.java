package com.tp.sort;

/**
 * @Author: zjuptian
 * @Date: 2021/1/5 11:13
 * @Description: 希尔排序，时间复杂度与增量序列有关，最坏O(N^2)
 */
public class ShellSort {
    public static void ShellSort(int[] array){
        int h = array.length/2;
        int temp;
        int i;
        int p;
        while (h >= 1){
            for(p = h; p < array.length ; p ++){
                temp = array[p];
                for( i = p; i >= h; i -= h){
                    if(array[i-h] <= temp){
                        break;
                    }
                    else{
                        array[i] = array[i-h];
                    }
                }
                array[i] = temp;
            }
            h = h/2;
        }
    }
}
