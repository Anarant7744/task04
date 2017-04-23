package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import sun.security.util.Length;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.equals(name2))
        System.out.println("Имена идентичны");
        boolean f = ((name1).equals (name2));
        if (f) {
            System.out.println("Имена идентичны");
        }
                int Len1 = name1.length();
                int Len2 = name2.length();
                if ((Len1 == Len2)) {
                    System.out.println("Длины имен равны");
                }
            }
        }