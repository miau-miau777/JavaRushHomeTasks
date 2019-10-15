package javarush.tasks.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] num = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        System.arraycopy(num, 0, arr1, 0, 10);
        System.arraycopy(num, 10, arr2, 0, 10);

        for(int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }
}
