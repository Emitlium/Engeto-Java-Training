package com.engetohotel;

import java.time.LocalDate;

public class Guests {
    // ZADANI: Host = jméno (str), příjmení (str), datum narození (loc date)

    // == ATRIBUTY ==
    private String surname, name;
    private LocalDate dateOfBirth;

    // == KONSTRUKTOR ==
    public Guests(String surname, String name, LocalDate dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // == METODY ==
    // surname
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // date
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //description
    public void getDescription (){
        System.out.println("Navstevnik: "+surname+" "+name+", datum narozeni: " +dateOfBirth.toString());
    }
}