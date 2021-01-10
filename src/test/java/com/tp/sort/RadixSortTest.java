package com.tp.sort;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2021/1/10 11:58
 * @Description:
 */
public class RadixSortTest {
    @Test
    public void test(){
        int[] array = {34,8,64,51,32,21,4,100,23,56,11,11};
        RadixSort.RadixSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
