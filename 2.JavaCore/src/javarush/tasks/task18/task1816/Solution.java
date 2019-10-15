package javarush.tasks.task18.task1816;


/*
Английские буквы
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int countSymbols = 0;
        while (inputStream.available() > 0) {
            char chars = (char)inputStream.read();
            Pattern pattern = Pattern.compile("^[a-zA-Z]$");
            Matcher matcher = pattern.matcher(Character.toString(chars));
            if (matcher.matches()) {
                countSymbols++;
            }
        }
        System.out.println(countSymbols);
        inputStream.close();
    }
}

