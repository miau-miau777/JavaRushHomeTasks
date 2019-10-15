package javarush.tasks.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int numders : arr
        ) {
            System.out.println(numders);
        }

    }
}