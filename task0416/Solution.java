package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double t = Double.parseDouble(s);
        if ((t % 5 == 0) && (t % 5 < 3))
        System.out.println("Зеленый");
        if (t % 4 == 0)
            System.out.println("Красный");
        if (t % 3 == 0)
            System.out.println("Желтый");



    }
}