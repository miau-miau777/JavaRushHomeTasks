package javarush.tasks.task14.task1420;

/*
НОД
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());

        if (num1 <= 0 || num2 <= 0) {
            throw new Exception();
        }
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            }else {
                num2 = num2 % num1;
            }
        }
        int result = num1 + num2;
        System.out.println(result);
    }
}
