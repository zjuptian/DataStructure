package com.tp.heap;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2021/1/3 17:49
 * @Description:
 */
public class BinaryHeapTest {
    @Test
    public void test(){
        Integer[] array = new Integer[11];
        array[1] = 13;
        array[2] = 21;
        array[3] = 16;
        array[4] = 24;
        array[5] = 31;
        array[6] = 19;
        array[7] = 68;
        array[8] = 65;
        array[9] = 26;
        array[10] = 32;
        BinaryHeap<Integer> binaryHeap = new BinaryHeap<>(array);
        binaryHeap.insert(5);
        System.out.println("插入后");
        binaryHeap.showAll();

        binaryHeap.deleteMin();
        System.out.println("删除后");
        binaryHeap.showAll();
        binaryHeap.deleteMin();
        System.out.println("删除后");
        binaryHeap.showAll();
    }
}
