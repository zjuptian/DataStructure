package com.tp.sort;

/**
 * @Author: zjuptian
 * @Date: 2021/1/10 9:24
 * @Description: 快排实现，时间复杂度O(Nlog(N))
 */
public class QuickSort {
    public static void quickSort(int[] array,int left,int right) {
        int i,j,temp,t;
        if(left > right){
            return;
        }
        i = left;
        j = right;
        temp = array[left];
        while(i<j){
            while(array[i] <= temp && i < j){
                i++;
            }
            while(array[j] >= temp && i < j){
                j--;
            }
            if(i < j){
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[left] = array[i];
        array[i] = temp;
        quickSort(array,left,j-1);
        quickSort(array,j+1,right);
    }
}
