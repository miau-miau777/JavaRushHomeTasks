package javarush.tasks.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("AUGUST 1 2012"));
        map.put("Уиллис", dateFormat.parse("MAY 5 2012"));
        map.put("Макконахи", dateFormat.parse("MAY 23 2012"));
        map.put("Питт", dateFormat.parse("JULY 15 2012"));
        map.put("Депп", dateFormat.parse("MAY 4 2012"));
        map.put("Ривз", dateFormat.parse("MAY 19 2012"));
        map.put("Смит", dateFormat.parse("MAY 21 2012"));
        map.put("Круз", dateFormat.parse("JUNE 10 2012"));
        map.put("Фримен", dateFormat.parse("MAY 17 2012"));
        map.put("Ферт", dateFormat.parse("MAY 28 2012"));

        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date>  pair = iterator.next();
            Date date = pair.getValue();
            if(date.getMonth() == Calendar.JUNE || date.getMonth() == Calendar.JULY || date.getMonth() == Calendar.AUGUST) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {


    }
}

