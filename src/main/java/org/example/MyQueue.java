package org.example;

public class MyQueue {
    String[] arr = new String[10];
    int size;

    void enqueue(String item){
        if (size >= arr.length){
            String[] arr2 = new String[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    boolean empty() {return size == 0;}

    String dequeue(){
        if (empty()){
            return null;
        }
        String firstItem = arr[0];
         String[] arr2 = new String[arr.length];
         System.arraycopy(arr, 1, arr2, 0, arr.length - 1);
         arr = arr2;
         return firstItem;
    }

    String first(){
        if (empty()){
            return null;
        }
        String firstItem = arr[0];
        return firstItem;
    }
}
