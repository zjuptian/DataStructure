package com.tp.tree;

/**
 * @Author: zjuptian
 * @Date: 2020/12/25 14:13
 * @Description: 二叉树实现
 */
public class NormalBinaryTree<T> {
    private T value;
    private NormalBinaryTree<T> leftChild;
    private NormalBinaryTree<T> rightChild;

    public NormalBinaryTree(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NormalBinaryTree<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NormalBinaryTree<T> leftChild) {
        this.leftChild = leftChild;
    }

    public NormalBinaryTree<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(NormalBinaryTree<T> rightChild) {
        this.rightChild = rightChild;
    }

    public void preoderTraversal(NormalBinaryTree<T> root){
        //递归
        //访问根节点
        System.out.println(root.value);
        //访问左孩子
        if(root.leftChild != null){
            preoderTraversal(root.leftChild);
        }
        //访问右孩子
        if(root.rightChild != null){
            preoderTraversal(root.rightChild);
        }
    }

    public void inorderTraversal(NormalBinaryTree<T> root){
        //访问左孩子
        if(root.leftChild != null){
            inorderTraversal(root.leftChild);
        }
        //访问根节点
        System.out.println(root.value);
        //访问右孩子
        if(root.rightChild != null){
            inorderTraversal(root.rightChild);
        }
    }

    public void postorderTraversal(NormalBinaryTree<T> root){
        //访问左孩子
        if(root.leftChild != null){
            postorderTraversal(root.leftChild);
        }
        //访问右孩子
        if(root.rightChild != null){
            postorderTraversal(root.rightChild);
        }
        //访问根节点
        System.out.println(root.value);
    }
}
