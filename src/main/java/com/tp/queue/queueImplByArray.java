package com.tp.queue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zjuptian
 * @Date: 2020/12/25 10:03
 * @Description: 队列的数组实现
 */
public class queueImplByArray<T> {
    private int currentSize = 0;
    private int maxSize = 10;
    private int front = 0;
    private int back = -1;

    public queueImplByArray(int maxSize) {
        this.maxSize = maxSize;
    }

    List<T> queue = new ArrayList<>();


    public void enqueue(T element){
        if(currentSize == maxSize){
            System.out.println("队列已满");
        }
        else{
            if(back == maxSize-1){
                back = 0;
            }
            else{
                back = back + 1;
            }
            try{
                queue.set(back,element);
            }catch (Exception e){
                queue.add(element);
            }
            currentSize++;
        }
    }

    public void dequeue(){
        if(currentSize == 0){
            System.out.println("队列空！出队失败！");
        }
        else{
            System.out.println("出队："+queue.get(front));
            currentSize--;
            if(front==maxSize-1){
                front = 0;
            }
            else{
                front++;
            }
        }
    }

    public void showAll(){
        if(currentSize==0){
            System.out.println("显示队列：队空！");
        }
        else{
            System.out.println("显示队列：");
            int p = front;
            for(int i = 0; i < currentSize; i++){
                System.out.println(queue.get(p));
                if(p == maxSize-1){
                    p = 0;
                }
                else{
                    p++;
                }
            }
        }
    }
}
