package javarush.tasks.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) {
            String str = reader.readLine();
            list.add(0, str);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
