package org.example;


// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


public class Main4_2 {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        System.out.println("Размер для проверки: " + queue.size);
        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Показ и удаление первого элемента: " + queue.dequeue());
        System.out.println("Первый элемент: " + queue.first());
    }
}
