package javarush.tasks.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/*
Клининговый центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment room : apartments) {
            if (room instanceof OneRoomApt) {
                ((OneRoomApt) room).clean1Room();
            } else if (room instanceof TwoRoomApt) {
                ((TwoRoomApt) room).clean2Rooms();
            } else if (room instanceof ThreeRoomApt) {
                ((ThreeRoomApt) room).clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
