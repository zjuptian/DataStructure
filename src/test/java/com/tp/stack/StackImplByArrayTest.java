package com.tp.stack;

import org.junit.Test;

public class StackImplByArrayTest {
    @Test

    public void test() {
        StackImplByArray<Integer> stack = new StackImplByArray<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
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
