package javarush.tasks.task18.task1822;

/*
Поиск данных внутри файла
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
        String string;
        String[] arr;
        while ((string = bufReader.readLine()) != null) {
            arr = string.split(" ");
            if (arr[0].equals(args[0])) {
                System.out.println(string);
            }
        }
        reader.close();
        bufReader.close();
    }
}

