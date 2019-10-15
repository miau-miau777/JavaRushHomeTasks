package javarush.tasks.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            } else {
                String family = reader.readLine();
                map.put(city, family);
            }
        }
        String readCity = reader.readLine();

        for(Map.Entry<String, String> obj : map.entrySet()) {
            if(readCity.equals(obj.getKey())) {
                System.out.println(obj.getValue());
            }
        }

    }
}
