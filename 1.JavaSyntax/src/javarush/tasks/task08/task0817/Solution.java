package javarush.tasks.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> names = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (Map.Entry<String, String> item : map.entrySet()
        ) {
            String str = item.getValue();
            if(names.contains(str)) {
                duplicate.add(str);
            }else {
                names.add(str);
            }
        }
        for (String duplName : duplicate
        ) {
            removeItemFromMapByValue(map, duplName);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet()
             ) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
*/
    }
}

