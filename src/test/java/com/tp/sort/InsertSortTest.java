package com.tp.sort;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2021/1/5 10:58
 * @Description:
 */
public class InsertSortTest {
    @Test
    public void test(){
        int[] array = {34,8,64,51,32,21,4,100,23,56,11,11};
        InsetSort.InsertSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
