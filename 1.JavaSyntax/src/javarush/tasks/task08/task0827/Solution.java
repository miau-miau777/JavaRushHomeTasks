package javarush.tasks.task08.task0827;

import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("FEBRUARY 2 2013"));
    }

    public static boolean isDateOdd(String date)
    {
        Date startTime = new Date(date);
        startTime.setSeconds(0);
        startTime.setMinutes(0);
        startTime.setHours(0);

        startTime.setDate(1);
        startTime.setMonth(0);
        startTime.setYear(0);

        Date currentTime = new Date(date);
        long msTimeDistance = currentTime.getTime() - startTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        if(dayCount % 2 != 0) {
            return true;
        }else
            return false;
    }
}
