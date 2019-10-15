package javarush.tasks.task10.task1013;

/*
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private Boolean sex;
        private int age;
        private Date birthDay;
        private String address;

        public Human() {}

        public Human(String firstName, String lastName, Boolean sex, int age, Date birthDay, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.birthDay = birthDay;
            this.address = address;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, Date birthDay) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDay = birthDay;
        }

        public Human(String firstName, String lastName, Boolean sex, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, String lastName, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String firstName, String lastName, int age, Date birthDay) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.birthDay = birthDay;
        }

        public Human(String firstName, String lastName, int age, Date birthDay, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.birthDay = birthDay;
            this.address = address;
        }

        public Human(String firstName, String lastName, Boolean sex, Date birthDay) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.birthDay = birthDay;
        }
    }
}

