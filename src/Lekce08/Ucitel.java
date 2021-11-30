package Lekce08;

public class Ucitel extends Clovek{
    public Ucitel(String jmeno, String prijmeni){
        super(jmeno,prijmeni);
    }

    public String getCeleJmeno(){
        return this.getPrijmeni()+", "+getJmeno();
    }

}
