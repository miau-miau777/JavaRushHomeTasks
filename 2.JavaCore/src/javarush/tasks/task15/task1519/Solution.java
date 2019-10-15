package javarush.tasks.task15.task1519;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!((line = reader.readLine()).equals("exit"))) {
            try {
                if (Integer.parseInt(line) > 0 && Integer.parseInt(line) < 128) {
                    print(Short.parseShort(line));
                } else {
                    print(Integer.parseInt(line));
                }
            } catch (NumberFormatException e) {
                try {
                    print(Double.parseDouble(line));
                } catch (NumberFormatException ee) {
                    print(line);
                }
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }


}

