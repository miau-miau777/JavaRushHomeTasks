package javarush.tasks.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            map.put("Name"+i, random.nextInt(1000));
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            Integer salary = pair.getValue();
            if(salary < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {
        /*Map<String, Integer> map = createMap();
        System.out.println(map);
        System.out.println();
        removeItemFromMap(map);
        System.out.println(map);
*/
    }
}
