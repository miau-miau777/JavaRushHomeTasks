package javarush.tasks.task10.task1015;

import java.util.ArrayList;


/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrOfList = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add("abc" + i);
        }
        for (int i = 0; i < 5; i++) {
            list2.add("dif" + i);
        }
        arrOfList[0] = list1;
        arrOfList[1] = list2;

        return arrOfList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
