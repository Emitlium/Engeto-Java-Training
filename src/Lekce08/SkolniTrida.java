package Lekce08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SkolniTrida {
    public static final String oddelovac = "####################################";
    private String nazevTridy;
    private int rocnik;
    private Ucitel ucitel;
    private List<Student> listStudentu = new ArrayList<>();

    public SkolniTrida(String nazevTridy, int rocnik, Ucitel ucitel) {
        this.nazevTridy = nazevTridy;
        this.rocnik = rocnik;
        this.ucitel = ucitel;
    }

    public String getNazevTridy() {
        return nazevTridy;
    }

    public int getRocnik() {
        return rocnik;
    }

    public Ucitel getUcitel() {
        return ucitel;
    }

    public void addStudenta(Student student) {
        listStudentu.add(student);
    }

    public List<Student> getListStudentu() {
        return listStudentu;
    }

    public String getInformaceV1() {
        String print = oddelovac;
        print += "\nTřída: " + getNazevTridy() + " (ročník: " + getRocnik() + ")";
        print += "\nTřídní učitel: " + getUcitel().getCeleJmeno();
        print += "\nPočet studentů: " + getListStudentu().size() + "\n";
        print += "\n" + oddelovac;

        int i = 1;
        for (Student student : listStudentu) {
            print += "\n# " + i + " # " + student.getstudentskyKod() + " - " + student.getCeleJmeno() + " (" + student.getRokNarozeni() + ")";
            i++;
        }
        return print;
    }

    public String getInformaceV2() {
        String print = getNazevTridy() + ", " + getUcitel().getJmeno() + " " + getUcitel().getPrijmeni();
        for (Student student : listStudentu) {
            print += "\n" + student.getstudentskyKod() + ", " + student.getCeleJmeno();
        }
        return print;
    }

    public String getVlastniInformace() {
        String print = "\n"+oddelovac;
        print += "\nRočník: " + getRocnik();
        print += "\nStudenti:";
        for (Student student : listStudentu) {
            print += "\n\t" + student.getPrijmeni() + ", " + student.getJmeno()+" - "+student.getRokNarozeni();
        }
        return print;
    }

    public void printInfo(){
        System.out.println(getInformaceV1());
        System.out.println("");
        System.out.println(getInformaceV2());
        System.out.println("");
        System.out.println(getVlastniInformace());
    }

    public void exportInfo (String file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(getInformaceV1()+"\n"+getInformaceV2()+"\n"+getVlastniInformace());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}