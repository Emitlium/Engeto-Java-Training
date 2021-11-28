package Lekce05;

import java.time.LocalDate;

public class Plant {

    // == ATRIBUTES ==

    private String name, notes;
    private LocalDate planted, watering;
    private int frequencyOfWatering;


    // == CONSTRUCTORS ==
    // = kompletni konstruktor
    public Plant(String name, String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }
    // konstruktor jen s name, planted, frequency, poznamky a posledni zaliti je automaticky na nic a dnes
    public Plant(String name, LocalDate planted, int frequencyOfWatering) {
        this(name, "", planted, LocalDate.now(), frequencyOfWatering);
    }
    // konstruktor jen s name, zbytek je pevně nastaven
    public Plant(String name){
        this(name,LocalDate.now(),7);
    }


    // == METHODS ==
    // = GET&SET

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
    public LocalDate getWatering() {
        return watering;
    }
    public void setWatering(LocalDate watering) throws PlantException {
        if (watering.isBefore(getPlanted())) throw new PlantException("Datum zaliti je pred datem zasazeni.");
        this.watering = watering;
    }
    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }
    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering <=0) throw new PlantException("Frekvence zalevani "+getName()+" je 0 nebo mensi.");
        this.frequencyOfWatering = frequencyOfWatering;
    }


    // Other Methods

    public String getWateringInfo(){
        String info;
        info = "Kvetina: "+getName();
        info += "\n\tDatum zaliti kvetiny:\t"+getWatering()+"\n\tDoporucene dalsi zaliti:\t"+ getWatering().plusDays(getFrequencyOfWatering());
        return info;
    }

    // místo vypisování sout sout sout
    public void printInfo(){
        System.out.println(getWateringInfo());
    }

    // STRING na export
    public String forExport(String oddelovac){
        String export = getName()+oddelovac;
        export += getNotes()+oddelovac;
        export += getFrequencyOfWatering()+oddelovac;
        export += getPlanted()+oddelovac;
        export += getWatering()+"\n";
        return export;
    }
}
