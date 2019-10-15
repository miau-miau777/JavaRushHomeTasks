package javarush.tasks.task13.task1318;

import java.io.*;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream fileInput = new FileInputStream(fileName);

        while (fileInput.available() > 0) {
            char data = (char)fileInput.read();
            System.out.print(data);
        }
        System.out.println();

        reader.close();
        fileInput.close();
    }
}
