package com.tp.sort;

import java.util.Arrays;

/**
 * @Author: zjuptian
 * @Date: 2021/1/7 11:43
 * @Description: 归并排序，分治思想，时间复杂度O(Nlog(N))
 */
public class MergeSort {
    public static void mergeSort(int[] array){
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length-1);
    }

    private static void mergeSort(int[] array, int[] temp, int left, int right){
        if(left < right){
            int center = (left + right)/2;
            mergeSort(array,temp,left,center);
            mergeSort(array,temp,center+1,right);
            merge(array,temp,left,center+1,right);
        }
    }

    private static void merge(int[] array, int[] temp, int left, int right, int rightEnd){
        int leftEnd = right - 1;
        int p1 = left;
        int p2 = right;
        int pr = left;
        int num = right - left + 1;
        while(p1 <= leftEnd && p2 <= rightEnd ){
            if(array[p1] < array[p2]){
                temp[pr] = array[p1];
                p1++;
                pr++;
            }
            else{
                temp[pr] = array[p2];
                p2++;
                pr++;
            }
        }
        if(p1 > leftEnd){
            for(int i = p2; i <= rightEnd; i++){
                temp[pr] = array[i];
                pr++;
            }
        }
        if(p2 > rightEnd){
            for(int i = p1; i <= leftEnd; i++){
                temp[pr] = array[i];
                pr++;
            }
        }
        for(int i = left; i <= rightEnd; i++){
            array[i] = temp[i];
        }
    }
}
