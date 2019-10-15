package javarush.tasks.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String word = reader1.readLine();
            writer.write(word);
            writer.newLine();
            if(word.equals("exit")) {
                writer.close();
                break;
            }
        }
        reader1.close();
        reader.close();

    }
}

