package com.tp.tree;

import org.junit.Test;

/**
 * @Author: zjuptian
 * @Date: 2020/12/25 14:30
 * @Description:
 */
public class normalBinaryTreeTest {
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
        normalBinaryTree<Integer> node1 = new normalBinaryTree<>(1);
        normalBinaryTree<Integer> node2 = new normalBinaryTree<>(2);
        normalBinaryTree<Integer> node3 = new normalBinaryTree<>(3);
        normalBinaryTree<Integer> node4 = new normalBinaryTree<>(4);
        normalBinaryTree<Integer> node5 = new normalBinaryTree<>(5);
        normalBinaryTree<Integer> node6 = new normalBinaryTree<>(6);
        normalBinaryTree<Integer> node7 = new normalBinaryTree<>(7);
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
