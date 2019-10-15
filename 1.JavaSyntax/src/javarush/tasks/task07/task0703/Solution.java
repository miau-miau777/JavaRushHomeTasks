package javarush.tasks.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] str = new String[10];
        int[] num = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }
        for(int j = 0; j < num.length; j++) {
            for(int k = 0; k < str.length; k++) {
                if(j == k)
                    num[j] = str[k].length();
            }
        }
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }

    }
}
