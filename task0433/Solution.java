package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s = "S";
        int q = 0 ;
        while (q <= 99)
        {
            if ((q % 10 == 0) && (q != 0))
            {
                System.out.println("");
            }
            q++;
            System.out.print(s);
        }
    }
}
