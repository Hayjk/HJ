package org.example;

//  Реализовать простой калькулятор

import java.util.Scanner;

public class Main1_3 {
 public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Введите первое число");
     int firstNumber = scanner.nextInt();
     System.out.println("Введите второе число");
     int secondNumber = scanner.nextInt();
     System.out.println("Выберите знак операции :\n1(+)\n2(-)\n3(/)\n4(%)\n5(*)");
     int operation = scanner.nextInt();

     int result = 0;
     switch (operation) {
         case 1 -> {
             result = firstNumber + secondNumber;
             System.out.println("Результат = " + result);
         }
         case 2 -> {
             result = firstNumber - secondNumber;
             System.out.println("Результат = " + result);
         }
         case 3 -> {
             result = firstNumber / secondNumber;
             System.out.println("Результат = " + result);
         }
         case 4 -> {
             result = firstNumber % secondNumber;
             System.out.println("Результат = " + result);
         }
         case 5 -> {
             result = firstNumber * secondNumber;
             System.out.println("Результат = " + result);
         }
     }
 }
}

