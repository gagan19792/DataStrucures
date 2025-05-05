package org.ds.stack;

import org.ds.linkedlist.Node;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
    }
    public Node pop(){
        if(height == 0){return null;}
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(7);

        stack.push(23);
        stack.push(3);
        stack.push(11);
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}
