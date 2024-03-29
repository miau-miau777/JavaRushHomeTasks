package javarush.tasks.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "";
        String str2 = "";

        String string = reader.readLine();
        char[] allChars = string.toCharArray();

        for(int i = 0; i < allChars.length; i++) {
            if(allChars[i] == ' '){
                continue;
            }
            if(isVowel(allChars[i])){
                str1 += allChars[i] + " ";
            }
            else {
                str2 += allChars[i] + " ";
            }
        }
        System.out.println(str1);
        System.out.println(str2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
