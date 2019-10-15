package javarush.tasks.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] ch = string.toCharArray();
        if (ch[0] != ' ')
            ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ' && ch[i+1] != ' ')
                ch[i+1] = Character.toUpperCase(ch[i+1]);
        }
        String st = "";
        for (int i = 0; i < ch.length; i++) {
            st += ch[i];
        }
        System.out.println(st);

    }
}
