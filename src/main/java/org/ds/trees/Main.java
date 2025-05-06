package org.ds.trees;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBinarySearchTree = new BinarySearchTree();
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(25);
        myBinarySearchTree.insert(5);
        myBinarySearchTree.insert(3);
        myBinarySearchTree.insert(2);
        myBinarySearchTree.insert(35);
        myBinarySearchTree.insert(45);
        myBinarySearchTree.insert(55);
        System.out.println(myBinarySearchTree.contains(55));
        System.out.println(myBinarySearchTree.contains(545));
    }
}
