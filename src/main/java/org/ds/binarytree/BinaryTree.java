package org.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static class Node<T> {
        private T data;
        private Node<T> leftChild;
        private Node<T> rightChild;

        private Node(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Node<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node<T> rightChild) {
            this.rightChild = rightChild;
        }
    }

    public static void breadthFirst(Node root)
    {
        if(null == root)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            //print(node)
            if(node.getLeftChild()!= null){
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild()!=null){
                queue.add(node.getRightChild());
            }
        }

    }

    public static void depthFirstPreOrder(Node root){
        if(root == null) return;

        //print(root)
        depthFirstPreOrder(root.getLeftChild());
        depthFirstPreOrder(root.getRightChild());
    }

    public static void depthFirstInOrder(Node root){
        if(root == null) return;
        depthFirstPreOrder(root.getLeftChild());
        //print(root)
        depthFirstPreOrder(root.getRightChild());
    }

    public static void depthFirstPostOrder(Node root){
        if(root == null) return;
        depthFirstPreOrder(root.getLeftChild());
        depthFirstPreOrder(root.getRightChild());
        //print(root)
    }

    public static Node insertion(Node<Integer> head, Node<Integer> node){
        if(head == null) return node;

        if(node.getData() <= head.getData()){
            head.setLeftChild(insertion(head.getLeftChild(), node));
        }else{
            head.setRightChild(insertion(head.getRightChild(), node));
        }
        return head;
    }

    public static Node<Integer> lookUp(Node<Integer> head, int data){
        if(head == null) return null;
        if(data == head.getData()){
            return head;
        }
        if(data <= head.getData()){
            return lookUp(head.getLeftChild(), data);
        }else{
            return lookUp(head.getRightChild(), data);
        }
    }

    //Minimum values in BST
    public static int minimumValue(Node<Integer> head){
        if(head == null) return Integer.MIN_VALUE;

        if(head.getLeftChild() == null)
            return head.getData();

        return minimumValue(head.getLeftChild());
    }

    //Maximum depth

    public static int maxDept(Node<Integer> head){
        if(null == head){
            return 0;
        }

        if(head.getLeftChild() == null && head.getRightChild() == null){
            return 0;
        }

        int leftMaxDepth = 1 + maxDept(head.getLeftChild());
        int rightMaxDepth = 1 + maxDept(head.getRightChild());

        return Math.max(leftMaxDepth, rightMaxDepth);
    }

    // Mirror BST
    public static void mirror(Node<Integer> head){
        if(head == null){
            return;
        }
        mirror(head.getLeftChild());

        mirror(head.getRightChild());
        Node<Integer> temp = head.getLeftChild();
        head.setLeftChild(head.getRightChild());
        head.setRightChild(temp);
    }

    // Tree Count
    public static int treeCount(int number){
        if(number <= 1){
            return 1;
        }
        int sum = 0;

        for(int i=1;i<=number;i++){
            int leftCount = treeCount(i-1);
            int rightCount = treeCount(number-1);

            sum = sum +(leftCount*rightCount);
        }

        return sum;
    }

    public static void printRange(Node<Integer> node, int low, int high){
        if(node == null) return;

        if(low <= node.getData()){
            printRange(node.getLeftChild(), low, high);
        }

        if(low <= node.getData() && node.getData() <= high){
            //print(node.getData());
        }
        if(high > node.getData()){
            printRange(node.getRightChild(), low, high);
        }
    }

    public static boolean isBinaryTree(Node<Integer> node, int min, int max){
        if(node == null) return true;

        if(node.getData() <= min || node.getData() >= max){
            return false;
        }
        return isBinaryTree(node.getLeftChild(), min, node.getData()) && isBinaryTree(node.getRightChild(), node.getData(), max);
    }

}
