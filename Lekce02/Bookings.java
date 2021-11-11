package com.engetohotel;

import java.time.LocalDate;
import java.util.List;

public class Bookings {

    // == ATRIBUTY ==
    private LocalDate stayStart, stayEnd;
    private Guests reservee, addOne = null, addTwo = null;
    private String workOrHoliday;
    private Rooms room;

    // == KONSTRUKTORY ==
    // basic s datem
    public Bookings(LocalDate stayStart, LocalDate stayEnd, String workOrHoliday, Guests reservee, Rooms room, Guests addOne, Guests addTwo) {
        this.stayStart = stayStart;
        this.stayEnd = stayEnd;
        this.workOrHoliday = workOrHoliday;
        this.reservee = reservee;
        this.room = room;
        this.addOne = addOne;
        this.addTwo = addTwo;
    }

    public Bookings(LocalDate stayStart, LocalDate stayEnd, String workOrHoliday, Guests reservee, Rooms room, Guests addOne) {
        this.stayStart = stayStart;
        this.stayEnd = stayEnd;
        this.workOrHoliday = workOrHoliday;
        this.reservee = reservee;
        this.room = room;
        this.addOne = addOne;
    }

    public Bookings(LocalDate stayStart, LocalDate stayEnd, String workOrHoliday, Guests reservee,Rooms room) {
        this.stayStart = stayStart;
        this.stayEnd = stayEnd;
        this.workOrHoliday = workOrHoliday;
        this.reservee = reservee;
        this.room = room;
    }

//    // bez data (6 dní)
//    //hlásí chybu "already defined přesto že to co udávám v this.stayStart etc. je jiné :(
//    // (udělala bych další bez addTwo a addOne, kdyby to fungovalo)
//    public Bookings(Guests reservee, String workOrHoliday) {
//        this.stayStart = LocalDate.now();
//        this.stayEnd = LocalDate.now().plusDays(7);
//        this.workOrHoliday = "Holiday";
//        this.reservee = reservee;
//        this.addOne = addOne;
//        this.addTwo = addTwo;
//    }

    // == METODY ==
    // zacatek a konec pobytu
    public LocalDate getStayStart() {
        return stayStart;
    }
    public void setStayStart(LocalDate stayStart) {
        this.stayStart = stayStart;
    }
    public LocalDate getStayEnd() {
        return stayEnd;
    }
    public void setStayEnd(LocalDate stayEnd) {
        this.stayEnd = stayEnd;
    }

    // pracovní nebo rekreační pobyt
    public String getWorkOrHoliday() {
        return workOrHoliday;
    }
    public void setWorkOrHoliday(String workOrHoliday) {
        this.workOrHoliday = workOrHoliday;
    }

    // rezervující a další (max 3 dohromady)
    public Guests getReservee() {
        return reservee;
    }
    public void setReservee(Guests reservee) {
        this.reservee = reservee;
    }
    public Guests getAddOne() {
        return addOne;
    }
    public void setAddOne(Guests addOne) {
        this.addOne = addOne;
    }
    public Guests getAddTwo() {
        return addTwo;
    }
    public void setAddTwo(Guests addTwo) {
        this.addTwo = addTwo;
    }

    // get desc jednoho bookingu
    public void getDescription(){
        System.out.println("Rezervujici: "+reservee.getSurname()+" "+reservee.getName());
        if (addOne != null){
            System.out.println("Druhy rezervujici: "+addOne.getSurname()+" "+addOne.getName());
        }
        if (addTwo != null){
            System.out.println("Treti rezervujici: "+addTwo.getSurname()+" "+addTwo.getName());
        }
        System.out.println("Pobyt \tod: "+stayStart+" \n\t\tdo: "+stayEnd);
        System.out.println("Typ pobytu: "+workOrHoliday);
        System.out.println("Pokoj: "+room.getRoom()+", pocet posteli: "+room.getNumOfBeds()+", cena: "+room.getPricePerNight()+"/Kc za noc.");
    }
}
