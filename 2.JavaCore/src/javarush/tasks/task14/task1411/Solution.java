package javarush.tasks.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while ((key = reader.readLine()) != null){
            if (key.equals("user")) {
                Person.User user = new Person.User();
                doWork(user);
            } else if (key.equals("loser")) {
                Person.Loser loser = new Person.Loser();
                doWork(loser);
            } else if (key.equals("coder")) {
                Person.Coder coder = new Person.Coder();
                doWork(coder);
            } else if (key.equals("proger")) {
                Person.Proger proger = new Person.Proger();
                doWork(proger);
            } else
                break;
        }

    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
