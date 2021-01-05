package com.tp.tree;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2020/12/25 14:30
 * @Description:
 */
public class NormalBinaryTreeTest {
    @Test
    public void test(){
        /**
         * 测试的树结构
         * 1->2->4
         *     ->5
         *  ->3->6
         *     ->7
         */
        //构造树
        NormalBinaryTree<Integer> node1 = new NormalBinaryTree<>(1);
        NormalBinaryTree<Integer> node2 = new NormalBinaryTree<>(2);
        NormalBinaryTree<Integer> node3 = new NormalBinaryTree<>(3);
        NormalBinaryTree<Integer> node4 = new NormalBinaryTree<>(4);
        NormalBinaryTree<Integer> node5 = new NormalBinaryTree<>(5);
        NormalBinaryTree<Integer> node6 = new NormalBinaryTree<>(6);
        NormalBinaryTree<Integer> node7 = new NormalBinaryTree<>(7);
        node1.setLeftChild(node2);
        node1.setRightChild(node3);
        node2.setLeftChild(node4);
        node2.setRightChild(node5);
        node3.setLeftChild(node6);
        node3.setRightChild(node7);
        //先序遍历
        System.out.println("先序遍历");
        node1.preoderTraversal(node1);
        System.out.println("中序遍历");
        node1.inorderTraversal(node1);
        System.out.println("后序遍历");
        node1.postorderTraversal(node1);


    }
}
