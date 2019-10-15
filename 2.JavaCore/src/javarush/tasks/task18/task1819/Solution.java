package javarush.tasks.task18.task1819;

/*
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        InputStream inStream1 = new FileInputStream(fileName1);
        byte[] buf1 = new byte[inStream1.available()];
        inStream1.read(buf1);
        inStream1.close();

        OutputStream outStream = new FileOutputStream(fileName1);

        InputStream inStream2 = new FileInputStream(fileName2);
        byte[] buf2 = new byte[inStream2.available()];
        inStream2.read(buf2);
        inStream2.close();

        ArrayList<byte[]> list = new ArrayList<>();
        list.add(buf2);
        list.add(buf1);

        for (byte[] result : list
        ) {
            outStream.write(result);
        }

        reader.close();
        outStream.close();
    }
}

