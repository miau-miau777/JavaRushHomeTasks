package javarush.tasks.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);

        long maxByte = 0;

        while (stream.available() > 0) {
            int readByte = stream.read();
            if (readByte > maxByte) {
                maxByte = readByte;
            }
        }
        reader.close();
        stream.close();
        System.out.println(maxByte);
    }
}

