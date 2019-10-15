package javarush.tasks.task09.task0902;

/*
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String nameMethod = stackTraceElement[2].getMethodName();
        return nameMethod;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String nameMethod = stackTraceElement[2].getMethodName();
        return nameMethod;
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String nameMethod = stackTraceElement[2].getMethodName();
        return nameMethod;
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String nameMethod = stackTraceElement[2].getMethodName();
        return nameMethod;
    }

    public static String method5() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String nameMethod = stackTraceElement[2].getMethodName();
        return nameMethod;
    }
}

