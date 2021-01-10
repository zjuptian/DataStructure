package com.tp.sort;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2021/1/10 9:42
 * @Description:
 */
public class QuickSortTest {
    @Test
    public void test(){
        int[] array = {34,8,64,51,32,21,4,100,23,56,11,11};
        QuickSort.quickSort(array,0,array.length-1);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
