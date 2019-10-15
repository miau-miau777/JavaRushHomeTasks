package javarush.tasks.task14.task1419;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;  //ArithmeticException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[5];  //ArrayIndexOutOfBoundsException
            System.out.println(arr[8]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;  //NullPointerException
            if (s.equals("null")) {
                System.out.println(s);
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = Integer.valueOf(15);  //ClassCastException
            String s = (String) o;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "abc";  //NumberFormatException
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[-7];  //NegativeArraySizeException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "abcd";  //StringIndexOutOfBoundsException
            s.substring(2, 7);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream f = new FileInputStream("name");  //FileNotFoundException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Class.forName("task1419.Cat");  //ClassNotFoundException
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];  //ArrayStoreException
            x[0] = new Integer(0);
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}

