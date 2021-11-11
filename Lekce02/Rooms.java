package com.engetohotel;

public class Rooms {
    // ZADANI: Pokoj = číslo (int), počet lůžek (int), balkon (boo), výhled na moře (boo), cena za noc (int)

    // == ATRIBUTY ==
    int room, numOfBeds, pricePerNight;
    boolean balcony, seaView;

    // == KONSTURKTOR ==
    public Rooms(int room, int numOfBeds, int pricePerNight, boolean balcony, boolean seaView) {
        this.room = room;
        this.numOfBeds = numOfBeds;
        this.pricePerNight = pricePerNight;
        this.balcony = balcony;
        this.seaView = seaView;
    }

    // == METODY ==
    // pokoj
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }

    // pocet luzek
    public int getNumOfBeds() {
        return numOfBeds;
    }
    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    // cena za noc
    public int getPricePerNight() {
        return pricePerNight;
    }
    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    // ma/nema balkon
    public boolean isBalcony() {
        return balcony;
    }
    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }
    public boolean isSeaView() {
        return seaView;
    }
    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    // description
    public void getDescription(){
        System.out.println("Pokoj c."+room);
        System.out.println("\tPocet luzek: "+numOfBeds);
        System.out.println("\tCena za pokoj za jednu noc: "+pricePerNight);
        if (seaView){
            System.out.println("\tVyhled na more: ano");
        } else {
            System.out.println("\tVyhled na more: ne");
        }
        if (balcony){
            System.out.println("\tBalkon: ano");
        } else {
            System.out.println("\tBalkon: ne");
        }
    }
}