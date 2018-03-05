package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();  // создали массив со значениями
        map.put("Иванов", "Женя");
        map.put("Сидоров", "Ваня");
        map.put("Петрова", "Алла");
        map.put("Иванова", "Иона");
        map.put("Уотсон", "Эмма");
        map.put("Богданов", "Женя");
        map.put("Тряпочикн", "Вися");
        map.put("Петров", "Первый");
        map.put("Грозный", "Женя");
        map.put("Ивановы", "Женя");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map); // создаём копию массива
        for (Map.Entry<String, String> pair : copy.entrySet()){          // итератор ?
            int freqeuncy = Collections.frequency(copy.values(), pair.getValue());  // применяем метод Collections.frequency, находит повторения в виде числа > 1
            if (freqeuncy > 1){
                removeItemFromMapByValue(map, pair.getValue()); // если такие имеются то передаём в метод для удаления.
            }

        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
