package com.engeto.ukol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfPlantsFromFile {

    // Vytvořte třídu pro ukládání seznamu pokojových květin.
    // Jako atribut bude mít kolekci, uchovávající květiny.

    // == Attributes ==
    public static final String FILE_PATH = "kvetiny.txt";
    public static final String TAB = "\t";
    List<Plant> listOfPlants = new ArrayList<>();


//    Přidejte metody pro přidání nové květiny, získání květiny na zadaném pořadí
//    a odebrání květiny ze seznamu.

    // == Methods ==
    public void addNewPlant(Plant plant) {
        listOfPlants.add(plant);
    }

    public Plant getPlant(int plantNumber) {
        return listOfPlants.get(plantNumber);
    }

    public void deletePlant(int plantNumber) {
        listOfPlants.remove(plantNumber);
    }

    public int size(){
        return listOfPlants.size();
    }


//    Přidejte do seznamu květin metodu pro načtení květin ze souboru.
//    V případě chybného vstupu vraťte výjimku.

    public void importFromFile(String filePathInput) {
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                String[] items = nextLine.split(TAB);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//    Přidejte do seznamu květin metodu pro uložení aktualizovaného seznamu do souboru.

    public void exportToFile(String filePathInput) {
        try (PrintWriter writer = new PrintWriter(new File(FILE_PATH))) {
            for (Plant plant : listOfPlants) {
                String outputLine =
                        plant.getName() + TAB + plant.getName() + TAB + plant.getFrequencyOfWatering() + TAB + plant.getLastWatered() + TAB + plant.getPlanted();
                writer.println(outputLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}