package javarush.tasks.task07.task0716;

import java.util.ArrayList;

/*
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р") & strings.get(i).contains("л")) {
                continue;
            }else if(strings.get(i).contains("л") & !strings.get(i).contains("р")) {
                String str = strings.get(i);
                strings.add(i, str);
                i++;

            }else if(strings.get(i).contains("р") & !strings.get(i).contains("л")) {
                strings.remove(i);
                i--;
            }
        }
        return strings;
    }
}
