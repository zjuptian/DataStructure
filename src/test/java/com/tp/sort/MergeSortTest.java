package com.tp.sort;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2021/1/7 12:03
 * @Description:
 */
public class MergeSortTest {
    @Test
    public void test(){
        int[] array = {34,8,64,51,32,21,4,100,23,56,11,11};
        MergeSort.mergeSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
