package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String a2 = reader.readLine();
        int b = Integer.parseInt(a2);
        String a3 = reader.readLine();
        int c = Integer.parseInt(a3);
        if ((a == b) && (a == c))
            System.out.println(a + " " + b + " " + c);
        else  if (a == b )
            System.out.println(a + " " + b);
        else if (b == c)
            System.out.println(b + " " + c);
        else if (a == c)
            System.out.println(a + " " + c);



    }
}