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
            while(array[j] >= temp && i < j){
                j--;
            }
            if(i < j){
                array[i] = array[j];
            }
            while(array[i] <= temp && i < j){
                i++;
            }
            if(i < j){
                array[j] = array[i];
            }
        }
        array[i] = temp;
        quickSort(array,left,j-1);
        quickSort(array,j+1,right);
    }
    /*
    39 28 55 87 66 17 39
    39 28 17 87 66 55 39
    87 28 17 39 66 55 39
     */
}
