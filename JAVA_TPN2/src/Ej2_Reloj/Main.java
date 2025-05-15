/*
Reloj con bucle infinito
author @santiagofrias
*/
public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        myClock.setTime(00, 00, 00);

        System.out.println("╔════════════════════╗");
        System.out.println("║       RELOJ        ║");
        System.out.println("╚════════════════════╝");

        while (true) {
            myClock.showTime();
            myClock.advanceSecond();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Reloj interrumpido.");
                break;
            }
        }
    }
}

