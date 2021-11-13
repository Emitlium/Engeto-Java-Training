package com.engeto.ukol;

import java.time.LocalDate;

public class Plant {
    // == Attributes ==
    private String name, notes;
    private LocalDate planted, lastWatered;
    private int frequencyOfWatering;

    // == Constructors ==
        // 1. jeden pro nastavení všech atributů
    public Plant(String name, String notes, LocalDate planted, LocalDate lastWatered, int frequencyOfWatering) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.lastWatered = lastWatered;
        this.frequencyOfWatering = frequencyOfWatering;
    }
        // 2. druhý nastaví jako poznámku prázdný řetězec a datum poslední zálivky nastaví na dnešní datum.
    public Plant(String name, LocalDate planted, int frequencyOfWatering) {
        this.name = name;
        this.notes = ""; // -> retezec, neni v konstruktoru
        this.planted = planted;
        this.lastWatered = LocalDate.now(); //-> dnesni datum, neni v konstruktoru
        this.frequencyOfWatering = frequencyOfWatering;
    }
        // 3. třetí nastaví totéž co druhý a navíc výchozí frekvenci zálivky na 7 dnů a datum zasazení na dnešní datum.
        // (Uživatel tedy bude zadávat pouze název rostliny.)
    public Plant(String name) {
        this.name = name;
        this.notes = ""; // stejne jako 2
        this.planted = LocalDate.now(); // zasazeno dnes
        this.lastWatered = LocalDate.now(); // stejne jako 2
        this.frequencyOfWatering = 7;
    }

    // == Getters & Setters ==
        //Vytvořte výchozí přístupové metody pro všechny atributy.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }
    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getLastWatered() {
        return lastWatered;
    }
        //ošetřete zadávání data poslední zálivky
        // — nesmí být starší než datum zasazení rostliny.
    public void setLastWatered(LocalDate lastWatered) throws PlantException {
        if (lastWatered.isBefore(getPlanted())) throw new PlantException ("CHYBA: Kvetina nemuze byt zalita predtim, nez je zasazena.");

        this.lastWatered = lastWatered;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }
        //Ošetřete zadávání frekvence zálivky — pokud je parametrem 0 nebo záporné číslo,
        // systém vyhodí výjimku třídy PlantException s vhodným popisem.
    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering <= 0) throw new PlantException ("CHYBA: Je třeba zalévat! Zadáno je "+getFrequencyOfWatering()+", to by nám to uschlo.");

        this.frequencyOfWatering = frequencyOfWatering;
    }

    // == Methods ==
        // Připravte metodu getWateringInfo(), která vrátí název květiny,
        // datum poslední zálivky a datum doporučené další zálivky.
        // (Metoda vrátí textový řetězec, obsahující požadované informace.)
    public String getWateringInfo(){
        return "Jmeno kvetiny: \n\t"+getName()+"\nNaposledny zalita: \n\t"+getLastWatered()+"\nDoporuceno zalit:\n\t"+lastWatered.plusDays(getFrequencyOfWatering());
    }


}
