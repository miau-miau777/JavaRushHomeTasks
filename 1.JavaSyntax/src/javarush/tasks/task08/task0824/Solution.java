package javarush.tasks.task08.task0824;

import java.util.ArrayList;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ch1 = new Human("Robby", true, 10, new ArrayList<>());
        Human ch2 = new Human("Monika", false, 8, new ArrayList<>());
        Human ch3 = new Human("Jon", true, 5, new ArrayList<>());

        ArrayList<Human> child = new ArrayList<>();
        child.add(ch1);
        child.add(ch2);
        child.add(ch3);

        Human father = new Human("Bobby", true, 35, child);
        Human mother = new Human("Carry", false, 34, child);

        ArrayList<Human> f = new ArrayList<>();
        f.add(father);
        ArrayList<Human> m = new ArrayList<>();
        m.add(mother);

        Human grandFather1 = new Human("Mike", true, 60, f);
        Human grandMother1 = new Human("Anna", false, 59, f);
        Human grandFather2 = new Human("Jack", true, 62, m);
        Human grandMother2 = new Human("Shara", false, 55, m);

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

