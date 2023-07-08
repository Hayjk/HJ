package org.example;

// Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
// Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
// Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
// Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет
// повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
// Для сортировки использовать TreeMap.

import java.util.*;

public class Main5_2 {
    public static void main(String[] args) {
        String s = "Иван Иванов,Светлана Петрова,Кристина Белова,\n" +
                "Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,\n" +
                "Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,\n" +
                "Иван Мечников,Петр Петин,Иван Ежов";
        List<String> names = new ArrayList<>();
        names = List.of(s.split(","));

        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (String temp: names){
            String name = temp.split(" ")[0];
            map.put(name, map.getOrDefault(name, 1) + 1);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() > 0){
                System.out.println(entry.getKey() + " - " + entry.getValue() + " повторений");
            }
        }
        }
    }


