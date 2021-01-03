package com.tp.heap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: zjuptian
 * @Date: 2021/1/3 17:19
 * @Description:
 */
public class binaryHeap<T extends Comparable<? super T>> {
    private int currentSize;
    private T[] array;
    private static final int DEFAULT_CAPACITY = 10;

    public binaryHeap(T[] array) {
        currentSize = 0;
        this.array = array;
        for(int i = 1; i < array.length; i++){
            if(array[i] != null){
                currentSize++;
            }
        }
    }

    public void insert(T element){
        if(currentSize == array.length - 1){
            enlargeArray(array.length * 2 + 1);
        }
        int hole = ++currentSize;
        while(hole != 1){
            if(array[hole/2].compareTo(element) > 0){
                array[hole] = array[hole/2];
                hole = hole/2;
            }
            else{
                break;
            }
        }
        array[hole] = element;
    }

    public void deleteMin(){
        if(currentSize == 0){
            System.out.println("堆空！删除失败！");
        }
        else{
            array[1] = array[currentSize--];
            percolateDown(1);
        }

    }

    public void percolateDown(int hole){
        int child;
        T temp = array[hole];
        for(;hole*2 < currentSize; hole = child){
            child = hole*2;
            if(child != currentSize && array[child+1].compareTo(array[child])<0){
                child++;
            }
            if(array[child].compareTo(temp) < 0){
                array[hole] = array[child];
            }
            else{
                break;
            }
        }
        array[hole] = temp;
    }

    public void enlargeArray(int newSize){
        T[] old = array;
        array = (T[])new Comparable[newSize];
        for(int i = 0; i < old.length; i++)
            array[i] = old[i];

//        this.array = temp;
    }

    public void showAll(){
        for (T t : array) {
            if(t != null)
                System.out.println(t);
        }
    }
}
