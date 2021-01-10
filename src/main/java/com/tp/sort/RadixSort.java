package com.tp.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2021/1/10 11:30
 * @Description: 基数排序，O(n)
 */
public class RadixSort {
    public static void RadixSort(int[] array){
//        List<List<Integer>> list = new ArrayList<>(10);
        int max_length = 20;
//        int[] copy = Arrays.copyOfRange(array,0,array.length);
        for(int i = 0; i < max_length; i++){
            int[] copy = Arrays.copyOfRange(array,0,array.length);
            int count = 0;
            List<List<Integer>> list = new ArrayList<>(10);
            for(int p = 0; p < 10; p++){
                list.add(new ArrayList<>());
            }
            for(int j = 0; j < array.length; j++){
                copy[j] /= Math.pow(10,i);
                int temp = copy[j] % 10;
                list.get(temp).add(array[j]);
            }
            for(int k = 0; k < 10; k++){
                for(Integer item : list.get(k)){
                    array[count] = item;
                    count++;
                }
            }
        }

    }
}
