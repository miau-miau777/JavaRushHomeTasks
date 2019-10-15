package javarush.tasks.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }
    static {
        BufferedReader reader = null;
        String string;
        try {
            reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while (((string = reader.readLine()) != null)) {
                lines.add(string);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
