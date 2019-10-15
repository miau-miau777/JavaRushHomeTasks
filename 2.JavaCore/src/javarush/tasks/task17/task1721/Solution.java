package javarush.tasks.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String filename2 = reader.readLine();

        BufferedReader readFile1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
        String strings1;
        while ((strings1 = readFile1.readLine()) != null) {
            allLines.add(strings1);
        }
        BufferedReader readFile2 = new BufferedReader(new InputStreamReader(new FileInputStream(filename2)));
        String strings2;
        while ((strings2 = readFile2.readLine()) != null) {
            forRemoveLines.add(strings2);
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

        reader.close();
        readFile1.close();
        readFile2.close();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            for (int i = 0; i < allLines.size(); i++) {
                for (int j = 0; j < forRemoveLines.size(); j++) {
                    if (allLines.get(i).equals(forRemoveLines.get(j))) {
                        allLines.remove(i);
                    }
                }
            }
            /*for (String file : allLines
            ) {
                System.out.println(file);
            }
           */
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}

