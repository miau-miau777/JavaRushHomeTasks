package javarush.tasks.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Барановский", "Иван");
        map.put("Иванов", "Петр");
        map.put("Петрова", "Маша");
        map.put("Кузькина", "Катя");
        map.put("Царева", "Маша");
        map.put("Макаренко", "Максим");
        map.put("Барановский", "Сергей");
        map.put("Кузькина", "Лена");
        map.put("Сидоров", "Петр");
        map.put("Авдеев", "Максим");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
