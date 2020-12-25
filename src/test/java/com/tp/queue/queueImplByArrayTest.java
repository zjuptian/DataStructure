package com.tp.queue;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2020/12/25 10:38
 * @Description:
 */
public class queueImplByArrayTest {
    @Test
    public void test(){
        queueImplByArray<Integer> queue = new queueImplByArray<>(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.showAll();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.showAll();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
