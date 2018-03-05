package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader readerfile = new BufferedReader(new InputStreamReader(System.in));
        // для чтения с консоли имя файла в переменную readerfile

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(readerfile.readLine())));
        // конструкция для построчного чтения с консоли, но уже из файла, который мы в этой строке введем

        readerfile.close(); // закрываем первый поток чтения с консоли, мы его уже ввели

        ArrayList <Integer> list = new ArrayList<Integer>(); // это новый список для записи значений
        String stmp = ""; // переменная строка для чтения строк из файла

        while ((stmp = reader.readLine()) != null) //  пока считываемая строка не null
        {
            if ((Integer.parseInt(stmp)) % 2 == 0)  // если эта строка переведенная в int четная
            {
                list.add(Integer.parseInt(stmp)); // добавляем ее в список
            }
        }
        reader.close(); // закрываем второй поток чтения из файла, мы прочитали весь файл

        Collections.sort(list); // сортируем список с четными числами

        for (int i : list) // выводим на экран
        {
            System.out.println(i);
        }
    }
}
