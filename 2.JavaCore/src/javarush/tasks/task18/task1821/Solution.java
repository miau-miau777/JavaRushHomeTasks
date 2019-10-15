package javarush.tasks.task18.task1821;


/*
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream(args[0]);
        byte[] buf = new byte[stream.available()];
        stream.read(buf);

        char[] ch = new String(buf).toCharArray();

        Map<Character, Integer> map = new TreeMap<>();
        for (char result : ch) {
            if (map.containsKey(result)) {
                map.put(result, map.get(result)+1);
            } else {
                map.put(result, 1);
            }
        }

        for (Map.Entry<Character, Integer> result : map.entrySet()
        ) {
            System.out.println(result.getKey() + " " + result.getValue());
        }
        stream.close();

    }
}

