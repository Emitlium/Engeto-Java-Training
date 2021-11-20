package Moje.java.moje;

public class Main {
    public static final String KVETINY_IMPORT = "kvetiny_01.txt";
    public static final String KVETINY_EXPORT = "kvetiny_02.txt";

    public static void main(String[] args) throws PlantException {

        System.out.println("--- TEST: Vytisknuti importovaneho souboru.");
        PlantList test01 = new PlantList().importList(KVETINY_IMPORT,";");
        test01.printInfoOfPlants();

        System.out.println("--- TEST: Vytisknuti importovaneho souboru - 0 index, pridani nove kytky.");
        test01.removePlant(0);
        Plant ruze = new Plant("Ruze");
        test01.addPlant(ruze);
        test01.printInfoOfPlants();

        System.out.println("--- TEST: Export souboru.");
        test01.exportList(KVETINY_EXPORT,";");

    }
}
