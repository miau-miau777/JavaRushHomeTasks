package javarush.tasks.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        try {
            while (true) {
                int x = Integer.parseInt(reader.readLine());
                list.add(x);
            }
        }
        catch (NumberFormatException e)
        {
            for (int num : list
            ) {
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

