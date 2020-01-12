package com.practice.programming;

import java.util.*;

public class BSTLevelOrder{
    public static void main(String[] args) {
        int[] arr = {15, 6, 2, 10, 9, 7, 13};
        arr = solve(arr, arr.length);

        for (int i : arr) {
            System.out.println(i);
        }
    }


    static int[] solve(int[] A, int N) {
        // Return an array of N elements, ith element representing level of A[i]
        // Write your code here

        BST bst = new BST();

        Set<Integer> levels = new LinkedHashSet<>();

        int[] finlevels = new int[A.length];

        for(int i = 0 ; i< A.length; i++){
            bst.insert(A[i], levels);
            //finlevels[i] = bst.getLevel(bst.root, A[i]);
        }

        return finlevels;

    }


    static class BST {
        class Node {
            Node left;
            Node right;
            int item;

            public Node(int item) {
                this.item = item;
            }
        }

        public Node root;

        public BST() {
            this.root = null;
        }


        void insert(int item, Set<Integer> levels) {
            this.root = insertRec(this.root, item, 1, levels);
        }


        Node insertRec(Node root, int item, int level ,Set<Integer> levels) {

            if (root == null) {
                root = new Node(item);
                levels.add(level);
                return root;
            }

            if (item < root.item) {
                root.left = insertRec(root.left, item, ++level, levels);
            }

            if (item > root.item) {
                root.right = insertRec(root.right, item, ++level, levels);
            }

            return root;
        }

        int getLevel(Node root, int item) {
            return getLevelUtil(root, item, 1);
        }


        int getLevelUtil(Node root, int item, int level) {

            if (root == null) {
                return 0;
            }

            if (root.item == item) {
                return level;
            }

            int downLevel = getLevelUtil(root.left, item, level + 1);

            if (downLevel != 0) {
                return downLevel;
            }

            downLevel = getLevelUtil(root.right, item, level + 1);

            return downLevel;
        }


        void inorderTraversal(Node root, Set<Integer> levels) {
            if (root == null) {
                return;
            }

            levels.add(root.item);

            inorderTraversal(root.left, levels);
            inorderTraversal(root.right, levels);


        }
    }
}
