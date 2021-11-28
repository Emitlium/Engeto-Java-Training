package Lekce02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //1) Adela Malikova 1993-03-13, Dvoracek Jan 1995-05-05
        Guests maliAde = new Guests("Malikova","Adela", LocalDate.of(1993,3,13));
        Guests dvorJan = new Guests("Dvoracek", "Jan", LocalDate.of(1995,5,5));
        System.out.println("1. Vypis Adelu a Jana pres 'getDescription' metodu:");
        maliAde.getDescription();
        dvorJan.getDescription();

        //2.1) pokoj 1,2, jednoluzko, cena 1000kc/noc, ano balkon + more
        Rooms room01 = new Rooms(1,1,1000,true, true);
        Rooms room02 = new Rooms(2,1,1000,true, true);
        System.out.println("\n2.1 Vypis pokoju:");
        room01.getDescription();
        room02.getDescription();
        //2.2) pokoj 3, trojluzko, cena 2400/noc, ne balkon, ano more
        Rooms room03 = new Rooms(3,3,2400,false, true);
        System.out.println("\n2.2 Vypis tretiho pokoje:");
        room03.getDescription();

        //3) Adela, pokoj 1, 2021-07-19 - 2021-07-26, pak Adela + Jan, pokoj 3, 2021-09-01 - 2021-09-14
        Bookings entry_001_r01_20210719 = new Bookings(LocalDate.of(2021,7,19), LocalDate.of(2021,7,26),"Work", maliAde,room01);
        Bookings entry_002_r03_20210901 = new Bookings(LocalDate.of(2021,9,1), LocalDate.of(2021,9,14),"Work",maliAde,room03,dvorJan);

        //4 vypis
        System.out.println("\n4. Vypis existujicich zaznamu:");
        entry_001_r01_20210719.getDescription();
        entry_002_r03_20210901.getDescription();
    }
}