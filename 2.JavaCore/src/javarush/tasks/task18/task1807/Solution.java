package javarush.tasks.task18.task1807;


/*
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);

        int count = 0;
        int com = 44;
        while (stream.available() > 0) {
            int data = stream.read();
            if (data == com) {
                count++;
            }
        }
        System.out.println(count);
        reader.close();
        stream.close();

    }
}

