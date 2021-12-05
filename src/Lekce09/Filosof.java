package Lekce09;

public class Filosof implements Runnable {
    // == ATTRIBUTY ==
    private final int HLAD = 10_000;
    Pribor levy, pravy;
    boolean jeNajezen;
    String name;

    // == KONSTRUKTOR ==
    public Filosof(String name, Pribor pravy, Pribor levy) {
        this.pravy = pravy;
        this.levy = levy;
        this.name = name;
    }

    // == GET&SET ==
    public String getName() {
        return name;
    }

    // == METODY ==
    private void sleep() throws InterruptedException {
        Thread.sleep((int) (Math.random() * 100));
    }

    @Override
    public void run() {
        int i = 0;
        while (i < HLAD) {
            i++;
            try {
                // Nic se neděje
                sleep();
                // vezme si PRAVÝ příbor
                synchronized (pravy) {
                    // čeká
                    sleep();
                    // vezme si LEVÝ příbor
                    synchronized (levy) {
                        System.out.println("Filosof #"+getName()+" snědl "+i+" porci.");
                        sleep();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        System.out.println("Filosof #"+getName()+" dojedl. ---thread ukončen---");
    }
}


