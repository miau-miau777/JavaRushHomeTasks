package javarush.tasks.task18.task1808;


/*
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        InputStream stream1 = new FileInputStream(filename1);
        OutputStream stream2 = new FileOutputStream(fileName2);
        OutputStream stream3 = new FileOutputStream(fileName3);

        while (stream1.available() > 0) {
            if (stream1.available() % 2 == 0) {
                byte[] buffer1 = new byte[stream1.available()/2];
                byte[] buffer2 = new byte[stream1.available()/2];
                int data1 = stream1.read(buffer1);
                int data2 = stream1.read(buffer2);
                stream2.write(buffer1, 0, data1);
                stream3.write(buffer2, 0, data2);
            } else {
                byte[] buffer1 = new byte[stream1.available()/2 + 1];
                byte[] buffer2 = new byte[stream1.available()/2];
                int data1 = stream1.read(buffer1);
                int data2 = stream1.read(buffer2);
                stream2.write(buffer1, 0, data1);
                stream3.write(buffer2, 0, data2);
            }
        }
        reader.close();
        stream1.close();
        stream2.close();
        stream3.close();

    }
}

