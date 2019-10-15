package javarush.tasks.task18.task1810;


/*
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            InputStream stream = new FileInputStream(fileName);
            if (stream.available() < 1000) {
                reader.close();
                stream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}

