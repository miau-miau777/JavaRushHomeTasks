package javarush.tasks.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Барановский", "Иван");
        map.put("Иванов", "Петр");
        map.put("Петрова", "Маша");
        map.put("Кузькина", "Катя");
        map.put("Царева", "Маша");
        map.put("Макаренко", "Максим");
        map.put("Баранов", "Сергей");
        map.put("Кузьминкина", "Лена");
        map.put("Сидоров", "Петр");
        map.put("Авдеев", "Максим");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if(name.equals(value)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if(lastName.equals(key)) count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}

