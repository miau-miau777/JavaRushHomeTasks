package javarush.tasks.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        int[] arr = new int[255];
        int minByte = arr[0];

        while (stream.available() > 0) {
            int readByte = stream.read();
            Arrays.fill(arr, readByte);
        }
        for (int value : arr) {
            if (value < minByte) minByte = value;

        }
        reader.close();
        stream.close();
        System.out.println(minByte);

    }
}
/*

        long minByte = 0;
        while (stream.available() > 0) {
            int readByte = stream.read();
            if (readByte > minByte) {
                minByte = readByte;
            }
        }
 */

