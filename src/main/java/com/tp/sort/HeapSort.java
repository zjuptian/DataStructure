package com.tp.sort;

/**
 * @Author: zjuptian
 * @Date: 2021/1/6 22:52
 * @Description: 堆排序，时间复杂度O(Nlog(N))
 */
public class HeapSort {
    private static void percDown(int[] array, int i, int n){
        int child;
        int temp;
        for(temp = array[i]; 2*i < n; i++){
            child = 2*i + 1;
            if(child != n-1 && array[child+1] < array[child] ){
                child++;
            }
            if(array[child] < temp){
                array[i] = array[child];
            }
            else{
                break;
            }
        }
        array[i] = temp;
    }

    public static void heapSort(int[] array){
        int[] result = new int[array.length];
        //build heap
        for(int i = array.length/2 - 1; i >=0; i--){
            percDown(array,i,array.length);
        }
        //sort
        for(int i = array.length-1; i>=0; i--){
            result[array.length-1-i] = array[0];
            array[0] = array[i];
            percDown(array,0,i);
        }
        for(int i = 0; i < result.length; i++){
            array[i] = result[i];
        }
    }
}
