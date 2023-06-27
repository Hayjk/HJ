package org.example;
import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Main1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("n-ое треугольного числа = " + (number / 2) * (number + 1));
        System.out.println("n! = " + (number - 2) * (number - 1) * number);
    }
}
