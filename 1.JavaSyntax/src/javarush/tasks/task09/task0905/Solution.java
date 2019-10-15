package javarush.tasks.task09.task0905;

/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int length = stackTraceElement.length;
        System.out.println(length);
        return length;

    }
}

