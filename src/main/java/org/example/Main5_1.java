package org.example;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что
// 1 человек может иметь несколько телефонов.

import java.util.Scanner;

public class Main5_1 {
    public static void main(String[] args){
        PhonBook phonBook = new PhonBook();
        phonBook.addBook("1", "Иванов: 123456, 234432, 345678");
        phonBook.addBook("2", "Василев: 321456");
        phonBook.addBook("3", "Петров: 234561, 654321");

        System.out.println("Введите индекс конткта: ");
        Scanner scanner = new Scanner(System.in);
        String uid = scanner.nextLine();
        System.out.println(phonBook.printPhonBook(uid));
    }
}
