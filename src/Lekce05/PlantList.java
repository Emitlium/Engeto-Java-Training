package Lekce05;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlantList {

    // == ATRIBUTES ==

    List<Plant> listOfPlants = new ArrayList<>();


    // == METHODS ==

    // = PLANT manipulation =
    public Plant getPlant(int index) {
        return listOfPlants.get(index);
    }
    public void addPlant(Plant plant) {
        listOfPlants.add(plant);
    }
    public void removePlant(int index) {
        listOfPlants.remove(index);
    }
    public void printInfoOfPlants() {
        for (Plant plant : listOfPlants) {
            plant.printInfo();
        }
    }

    // = IMPORT and EXPORT =
    public PlantList importList(String pathToFile, String oddelovac) throws PlantException {
        PlantList plantList = new PlantList();
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(pathToFile)));
            while (scanner.hasNextLine()) {
                String[] scanned = scanner.nextLine().split(oddelovac);
                Plant temp = new Plant(
                        scanned[0],
                        scanned[1],
                        LocalDate.parse(scanned[3]),
                        LocalDate.parse(scanned[4]),
                        Integer.parseInt(scanned[2])
                );
                plantList.addPlant(temp);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new PlantException("PlantException: " + e.getMessage());
        }
        return plantList;
    }
    public void exportList(String pathToFile, String oddelovac) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile))) {
            for (Plant plant : listOfPlants) {
                writer.write(plant.forExport(oddelovac));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}