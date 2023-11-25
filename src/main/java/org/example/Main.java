package org.example;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myArrL = new MyLinkedList<>();
        myArrL.add(5);
        myArrL.add(4);
        myArrL.add(0);
        myArrL.add(6);
        myArrL.add(1);
        myArrL.add(9);
        System.out.println(myArrL);
        myArrL.sort();
        System.out.println(myArrL);
        myArrL.remove(3);
        System.out.println(myArrL);
        myArrL.remove((Integer) 4);
        System.out.println(myArrL);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(myArrL);
        System.out.println(myLinkedList);
    }
}