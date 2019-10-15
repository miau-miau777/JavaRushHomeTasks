package javarush.tasks.task13.task1326;

/*
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream stream = new FileInputStream(fileName);
        BufferedReader read = new BufferedReader(new InputStreamReader(stream));

        ArrayList<Integer> list = new ArrayList<>();
        String string;
        while ((string = read.readLine()) != null) {
            int num = Integer.parseInt(string);
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        reader.close();
        stream.close();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

        for (Integer numbers : list
        ) {
            System.out.println(numbers);
        }


    }
}
