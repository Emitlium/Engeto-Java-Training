package Lekce01;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UkolPromenne {
    public static void main(String[] args) {
        String nameOfClient = "Jana";
        String surnameOfClient = "Konecna";
        int numberOfPurchases = 5;
        String nameOfCity = "Brno";
        BigDecimal carConsumption = BigDecimal.valueOf(5.5);
        BigDecimal cableLenght = BigDecimal.valueOf(155.6);
        LocalDate clientDateOfBirht = LocalDate.of(2021,5,12);
        String carSPZ = "4E0 5015";
        String ipAddress = "8.8.8.8";

        //TEST
        System.out.println("1.1 Jmeno: " + nameOfClient);
        System.out.println("1.2 Prijmeni: " + surnameOfClient);
        System.out.println("2. Pocet nakupu: " + numberOfPurchases);
        System.out.println("3. Nazev mesta: " + nameOfCity);
        System.out.println("4. Spotreba vozidla: " + carConsumption + " l.");
        System.out.println("5. Delka kabelu na skladě: " + cableLenght + " m.");
        System.out.println("6. Datum narozeni klienta: " + clientDateOfBirht);
        System.out.println("7. SPZ vozidla: " + carSPZ);
        System.out.println("8. IP adresa v4: " + ipAddress);
    }
}
