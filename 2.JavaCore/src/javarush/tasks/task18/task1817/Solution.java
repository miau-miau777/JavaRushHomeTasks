package javarush.tasks.task18.task1817;


/*
Пробелы
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int countSymbols = 0;
        int countSpace = 0;
        while (inputStream.available() > 0) {
            char chars = (char) inputStream.read();
            countSymbols++;
            if (chars == ' ') {
                countSpace++;
            }
        }
        float result = (float)countSpace /countSymbols*100;
        System.out.println(String.format("%.2f", result));
        inputStream.close();
    }
}

