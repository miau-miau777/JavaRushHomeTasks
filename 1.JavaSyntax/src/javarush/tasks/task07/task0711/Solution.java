package javarush.tasks.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list  = new ArrayList<>();
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for(int i = 0; i < 13; i++) {
            String str = list.get(list.size()-1);
            list.remove(str);
            list.add(0, str);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
