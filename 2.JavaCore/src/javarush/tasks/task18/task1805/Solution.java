package javarush.tasks.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        byte[] arr = new byte[256];
        while (stream.available() > 0) {
            arr[stream.read()]++;
        }
        for (int i = 0; i <= 255; i++) {
            if (arr[i] > 0) {
                System.out.print(i + " ");
            }
        }
        reader.close();
        stream.close();
    }
}
/*
2.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream stream = new FileInputStream(fileName);
        Set<Integer> set = new TreeSet<>();

        while (stream.available() > 0) {
            set.add(stream.read());
        }
        for (Integer result : set
             ) {
            System.out.println(result);
        }
        reader.close();
        stream.close();
 */

