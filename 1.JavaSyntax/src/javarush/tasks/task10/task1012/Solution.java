package javarush.tasks.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        String s = list.toString();
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < chars.length; i++) {
            for (Character ch : alphabet
            ) {
                if (chars[i] == ch) {
                    Integer freq = map.get(ch);

                    map.put(ch, freq == null ? 1 : freq + 1);

                }
            }
        }

        for (Character c : alphabet
        ) {
            for (Map.Entry<Character, Integer> endMap : map.entrySet()
            ) {
                if(c == endMap.getKey()) {
                    System.out.println(c + " " + endMap.getValue());
                }
            }
        }
    }
}
/*
int count = 0;
for(Character ch:alphabet){
   for(String st:list){
      for(String end:st.toCharArray()){
         if(ch==end){
           count++;
         }
      }
      sout(ch+" "+count);
      count = 0;
   }
 }
 */
