package org.example;
import java.util.ArrayList;

// Вывести все простые числа от 1 до 1000

public class Main1_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }
}

