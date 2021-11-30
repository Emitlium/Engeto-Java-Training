package Lekce08;

public class Clovek {
    protected String jmeno, prijmeni;

    public Clovek(String jmeno, String prijmeni){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }


    public String getCeleJmeno(){
        return this.getPrijmeni()+", "+getJmeno();
    }
}
