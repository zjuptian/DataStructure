package com.tp.stack;

/**
 * @Author: zjuptian
 * @Date: 2020/12/24 12:17
 * @Description: 栈的链表实现
 */
class Node<T>{
    public T data;
    public Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

public class StackImplByLink<T> {
    private Node<T> stackBottom = new Node<>();

    private Node<T> stackTop = stackBottom;
    public StackImplByLink() {
    }

    public StackImplByLink(Node<T> stackTop, Node<T> stackBottom) {
        this.stackTop = stackTop;
        this.stackBottom = stackBottom;
    }

    public void push(Node<T> newNode){
        newNode.next = stackTop;
        stackTop = newNode;
    }

    public void pop(){
        if(stackTop == stackBottom){
            System.out.println("栈空！pop失败！");
        }
        else{
            System.out.println(stackTop.data);
            stackTop = stackTop.next;
        }
    }

    public void showAll(){
        int i = 0;
        Node<T> pointer = stackTop;
        while(pointer != stackBottom){
            System.out.println(i+":"+pointer.data);
            pointer = pointer.next;
            i--;
        }
    }

}

