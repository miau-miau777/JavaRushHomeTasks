package javarush.tasks.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/*
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread sp1 = new SpecialThread();
        list.add(new Thread(sp1));

        SpecialThread sp2 = new SpecialThread();
        list.add(new Thread(sp2));

        SpecialThread sp3 = new SpecialThread();
        list.add(new Thread(sp3));

        SpecialThread sp4 = new SpecialThread();
        list.add(new Thread(sp4));

        SpecialThread sp5 = new SpecialThread();
        list.add(new Thread(sp5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

