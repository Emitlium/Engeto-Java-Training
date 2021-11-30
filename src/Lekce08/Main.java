package Lekce08;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Student student01 = new Student("Petr","Svoboda",2011,"ID001");
        Student student02 = new Student("Milan","Říha",2010,"ID123");
        Student student03 = new Student("Jindřich","Nový",2012,"ID345");
        Ucitel ucitel = new Ucitel("Novák","Jan");
        SkolniTrida trida = new SkolniTrida("4.C",4,ucitel);
        trida.addStudenta(student01);
        trida.addStudenta(student02);
        trida.addStudenta(student03);

        trida.printInfo();

        trida.exportInfo("test.txt");

    }
}
