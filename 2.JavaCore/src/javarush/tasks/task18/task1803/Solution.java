package javarush.tasks.task18.task1803;

import java.io.*;


/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        byte[] arr = new byte[256];
        byte count;
        int maxCount = arr[0];

        while (stream.available() > 0) {
            count = (byte) stream.read();
            arr[count]++;
        }

        for (int i = 0; i < arr.length; i++) {
            int repeat = arr[i];
            if (repeat > maxCount) {
                maxCount = repeat;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxCount) {
                System.out.print(i + " ");
            }
        }
        reader.close();
        stream.close();
    }
}

