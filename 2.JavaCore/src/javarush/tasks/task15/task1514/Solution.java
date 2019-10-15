package javarush.tasks.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/*
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(3.5, "One");
        labels.put(2.0, "Two");
        labels.put(4.7, "Three");
        labels.put(1.2, "Four");
        labels.put(10.9, "Five");
    }
}

