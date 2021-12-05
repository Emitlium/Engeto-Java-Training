package Lekce09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // VYTVORIME PRIBORY
        List<Pribor> pribory = new ArrayList<>();
        while (pribory.size()<10){
            pribory.add(new Pribor());
        }

        // VYTVORIME FILOSOFY
        String[] jmenaFilozofu = {
                "1. Kant", "2. Descartes", "3. Aristoteles", "4. Platon", "5. Leibniz",
                "6. Hegel", "7. Sokrates", "8. Marx", "9. Cicero", "10. Nietzsche"};

        List<Filosof> filosofove = new ArrayList<>();

        // prvni filosof naopak
        filosofove.add(new Filosof(jmenaFilozofu[filosofove.size()], pribory.get(filosofove.size()+1), pribory.get(filosofove.size())));

        // zbytek filosofu
        while (filosofove.size()<=9){
            filosofove.add(
                    new Filosof(jmenaFilozofu[filosofove.size()],
                    pribory.get(filosofove.size()),
                    pribory.get((filosofove.size()+1)%10)));
        }

        for (int i = 0; i < filosofove.size(); i++) {
            Thread vlakno = new Thread(filosofove.get(i), "Filozof "+(i+1));
            vlakno.start();
        }
    }
}
