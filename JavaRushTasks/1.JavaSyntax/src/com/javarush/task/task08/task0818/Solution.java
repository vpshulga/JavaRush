package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 100);
        map.put("Ivanov1", 101);
        map.put("Ivanov2", 102);
        map.put("Ivanov3", 103);
        map.put("Ivanov4", 104);
        map.put("Ivanov5", 500);
        map.put("Ivanov6", 506);
        map.put("Ivanov7", 507);
        map.put("Ivanov8", 508);
        map.put("Ivanov9", 509);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            if (it.next().getValue() < 500)
                it.remove();
        }
    }

    public static void main(String[] args) {

    }
}