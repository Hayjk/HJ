package org.example;


// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

import java.util.LinkedList;

public class Main4_1 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i < 6; i++) {
            linkedList.add(i);
        }
        System.out.println("Список: " + linkedList);
        System.out.println("Перевернутый список: " + reversLinkedList(linkedList));
    }

    public static LinkedList reversLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> reverseList = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }
}


