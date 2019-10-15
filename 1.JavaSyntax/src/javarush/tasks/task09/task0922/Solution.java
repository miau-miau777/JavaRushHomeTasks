package javarush.tasks.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-d");
        Date date = dateFormat.parse(reader.readLine());
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat1.format(date).toUpperCase());

    }
}

