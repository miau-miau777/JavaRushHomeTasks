package javarush.tasks.task15.task1530;

/*
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        LatteMaker lm = new LatteMaker();
        lm.makeDrink();
        System.out.println();
        TeaMaker tm = new TeaMaker();
        tm.makeDrink();
    }
}

