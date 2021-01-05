package com.tp.queue;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2020/12/24 17:31
 * @Description:
 */
public class QueueImplByLinkTest {
    @Test
    public void test(){
        QueueImplByLink<Integer> queue = new QueueImplByLink<>();
        queue.enqueue(new Node<Integer>(1));
        queue.enqueue(new Node<Integer>(2));
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(new Node<Integer>(3));
        queue.enqueue(new Node<Integer>(4));
        queue.enqueue(new Node<Integer>(5));
        queue.enqueue(new Node<Integer>(6));
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
