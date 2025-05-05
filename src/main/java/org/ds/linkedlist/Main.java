package org.ds.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.appent(2);
        linkedList.appent(3);
        linkedList.appent(4);
        linkedList.appent(5);
        linkedList.appent(6);
//        linkedList.prePend(1);
//        linkedList.print();
//        linkedList.reverse();
//        linkedList.print();
        System.out.println(linkedList.findMiddleNode().value);
    }

    //return the sum of 2 linked list

}
