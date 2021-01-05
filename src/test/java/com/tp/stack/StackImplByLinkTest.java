package com.tp.stack;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2020/12/24 13:59
 * @Description:
 */
public class StackImplByLinkTest {
    @Test
    public void test(){
        StackImplByLink<Integer> stack = new StackImplByLink<>();
        stack.push(new Node<Integer>(1));
        stack.push(new Node<Integer>(2));
        stack.pop();
        stack.pop();
        stack.push(new Node<Integer>(3));
        stack.push(new Node<Integer>(4));
        stack.push(new Node<Integer>(5));
        stack.push(new Node<Integer>(6));
        stack.showAll();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.showAll();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
