package javarush.tasks.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < intList.size() - 1; i++) {
            if(intList.get(i).equals(intList.get(i + 1))) {
                count++;
                if(count > max) {
                    max = count;
                }
            }else {
                count = 1;
            }
        }
        System.out.println(max);


    }
}
