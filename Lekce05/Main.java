package com.engeto.ukol;

public class Main {
    // test nacteni souboru

    public static final String FILE_PATH_INPUT = "kvetiny.txt";

    public static void main(String[] args) {

        ListOfPlantsFromFile test = new ListOfPlantsFromFile();
        test.importFromFile(FILE_PATH_INPUT);

        System.out.println(test.size());

    }
}
