package javarush.tasks.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 3 == 0 & list.get(i) % 2 != 0) {
                list1.add(list.get(i));
            }else if(list.get(i) % 2 == 0 & list.get(i) % 3 != 0) {
                list2.add(list.get(i));
            }else if(list.get(i) % 3 == 0 & list.get(i) % 2 == 0) {
                list1.add(list.get(i));
                list2.add(list.get(i));
            }else {
                list3.add(list.get(i));
            }
        }
        printList(list1);
        printList(list2);
        printList(list3);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int x:list
        ) {
            System.out.println(x);
        }
    }
}
