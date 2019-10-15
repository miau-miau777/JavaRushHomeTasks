package javarush.tasks.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(new Cat());
        }
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat obj : cats
        ) {
            System.out.println(obj);
        }
    }

    public static class Cat {}
}

