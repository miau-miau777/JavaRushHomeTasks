package javarush.tasks.task18.task1809;

/*
Реверс файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        InputStream inStream = new FileInputStream(fileName1);
        OutputStream outStream = new FileOutputStream(fileName2);

        byte[] arr = new byte[inStream.available()];
        while (inStream.available() > 0) {
            inStream.read(arr);
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            outStream.write(arr[i]);
        }
        reader.close();
        inStream.close();
        outStream.close();
    }
}

