package com.tp.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * stack 数组实现
 * 包含两个成员变量： stack topOfStack
 */
public class stackImplByArray<T> {
    private List<T> stack = new ArrayList<>();
    private int topOfStack = -1;

    public void pop(){
        if(topOfStack == -1){
            System.out.println("栈空！pop失败！");
        }
        else{
            System.out.println(stack.get(topOfStack));
            topOfStack--;
        }
    }

    public void push(T element){
        topOfStack++;
        try{
            stack.set(topOfStack,element);
        }catch (Exception e){
            stack.add(element);
        }

    }

    public void showAll(){
        for(int i = 0; i <= topOfStack; i++){
            System.out.println(i+":"+stack.get(i));
        }
    }
}
