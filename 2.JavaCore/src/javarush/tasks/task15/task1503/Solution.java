package javarush.tasks.task15.task1503;

/*
ООП - машинки
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class LuxuriousCar {
        protected void printlnDesire() {
            String str = Constants.WANT_STRING + Constants.LUXURIOUS_CAR;
            System.out.println(str);
        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            String str = Constants.WANT_STRING + Constants.CHEAP_CAR;
            System.out.println(str);
        }
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            String str = Constants.WANT_STRING + Constants.FERRARI_NAME;
            System.out.println(str);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            String str = Constants.WANT_STRING + Constants.LANOS_NAME;
            System.out.println(str);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}

