package com.onePieceOfCode.paulAndMark.day10_collections_framework;

import java.util.*;

public class CollectionOrderDemo {
    public static void main(String[] args) {
        List<Integer> numberFrom1To10 = Arrays.asList(2, 4, 6, 1, 3, 4, 5, 8, 10, 7, 9);
        System.out.println("Printing Original Numbers" + numberFrom1To10);
        System.out.println();


        //HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        for (int num : numberFrom1To10) {
            hashMap.put(num, "Value: " + num);
        }
        System.out.println("HashMap: " + hashMap);
        System.out.println();

        //Tree Map
        Map<Integer, String> treeMap = new TreeMap<>();
        for (int num : numberFrom1To10) {
            treeMap.put(num, "Value: " + num);
        }
        System.out.println("TreeMap: " + treeMap);
        System.out.println();

        //HashSet
        Set<Integer> hashSet = new HashSet<>(numberFrom1To10);
        System.out.println("HashSet: " + hashSet);
        System.out.println();

        //TreeSet
        Set<Integer> treeSet = new TreeSet<>(numberFrom1To10);
        System.out.println("TreeSet: " + treeSet);
        System.out.println();

        //ArrayList
        List<Integer> arrayList = new ArrayList<>(numberFrom1To10);
        System.out.println("ArrayList: " + arrayList);

        //LinkedList
        List<Integer> linkedList = new LinkedList<>(numberFrom1To10);
        System.out.println("LinkedList: " + linkedList);
        System.out.println();

        Collections.shuffle(numberFrom1To10);
        System.out.println("Shuffling the numbers from the List: " + numberFrom1To10);
        System.out.println();

        //hashmap
        hashMap.clear();
        for (int num : numberFrom1To10) {
            hashMap.put(num, " ,Value: " + num);
        }
        System.out.println("HashMap: " + hashMap);
        System.out.println();

        //treemap
        treeMap.clear();
        for (int num : numberFrom1To10) {
            treeMap.put(num, " ,Value: " + num);
        }
        System.out.println("TreeMap: " + treeMap);
        System.out.println();

        //hashset
        hashSet.clear();
        hashSet.addAll(numberFrom1To10);
        System.out.println("HashSet: " + hashSet);
        System.out.println();

        //treeset
        treeSet.clear();
        treeSet.addAll(numberFrom1To10);
        System.out.println("TreeSet: " + treeSet);
        System.out.println();

        //arraylist
        arrayList.clear();
        arrayList.addAll(numberFrom1To10);
        System.out.println("ArrayList: " + arrayList);
        System.out.println();

        //linkedlist
        linkedList.clear();
        linkedList.addAll(numberFrom1To10);
        System.out.println("ArrayList: " + linkedList);


        }
    }

