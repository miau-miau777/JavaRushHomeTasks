package javarush.tasks.task18.task1818;

/*
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        OutputStream outStream = new FileOutputStream(fileName1);
        InputStream inStream1 = new FileInputStream(fileName2);
        InputStream inStream2 = new FileInputStream(fileName3);

        while (inStream1.available() > 0) {
            int data = inStream1.read();
            outStream.write(data);
        }
        while (inStream2.available() > 0) {
            int data = inStream2.read();
            outStream.write(data);
        }
        reader.close();
        outStream.close();
        inStream1.close();
        inStream2.close();
    }
}
