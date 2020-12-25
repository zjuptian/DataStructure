package com.tp.tree;

/**
 * @Author: zjuptian
 * @Date: 2020/12/25 14:13
 * @Description: 二叉树实现
 */
public class normalBinaryTree<T> {
    private T value;
    private normalBinaryTree<T> leftChild;
    private normalBinaryTree<T> rightChild;

    public normalBinaryTree(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public normalBinaryTree<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(normalBinaryTree<T> leftChild) {
        this.leftChild = leftChild;
    }

    public normalBinaryTree<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(normalBinaryTree<T> rightChild) {
        this.rightChild = rightChild;
    }

    public void preoderTraversal(normalBinaryTree<T> root){
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

    public void inorderTraversal(normalBinaryTree<T> root){
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

    public void postorderTraversal(normalBinaryTree<T> root){
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
