package org.example;


// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор

import java.util.Iterator;
import java.util.LinkedList;

public class  Main4_3 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i < 4; i++){
            linkedList.add(i);
        }
        System.out.println("Список: " + linkedList);
        System.out.println("Сумма: " + countSum(linkedList));

    }

    static int countSum(LinkedList list){
        int count = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            count += iterator.next();
        }
        return count;
    }
}
