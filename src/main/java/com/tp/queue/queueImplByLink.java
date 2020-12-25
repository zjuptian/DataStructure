package com.tp.queue;

/**
 * @Author: zjuptian
 * @Date: 2020/12/24 17:22
 * @Description: 队列的链表实现
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
public class queueImplByLink<T> {
    private Node<T> rear = new Node<>();
    private Node<T> front = rear;

    public void enqueue(Node<T> newNode){
        if(rear.data == null){
            rear.data = newNode.data;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }

    }

    public void dequeue(){
        if(front == rear){
            if(rear.data != null){
                System.out.println("出队"+front.data);
                rear.data = null;
            }
            else{
                System.out.println("队列空！出队失败！");
            }


        }
        else{
            Node<T> p = front;
            System.out.println("出队"+front.data);
            front = front.next;
            p.next = null;
        }

    }

    public void showAll(){
        Node<T> pointer = front;
        System.out.println("显示当前队列元素");
        while(pointer != null ){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

}
