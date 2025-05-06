package org.ds.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("One",1);
        hashTable.set("Two",2);
        hashTable.set("Three",3);
        hashTable.set("Four",4);
        hashTable.set("Five",5);
        hashTable.set("Six",6);
        hashTable.set("Seven",7);
        hashTable.set("Eight",8);
        hashTable.set("Nine",9);
        hashTable.set("Ten",10);
        System.out.println(hashTable.get("One"));
        System.out.println(hashTable.get("Eleven"));
        System.out.println("All Keys : "+hashTable.getKeys());
        Set<Integer> set = new HashSet<>();
        Map<String, Integer> values = new HashMap<>();
    }
}
