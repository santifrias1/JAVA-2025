/*
Calculo de Eficiencia Energética
author @santiagofrias
*/
public class Main {
    public static void main(String[] args) {
        Consumos miCasa = new Consumos();
        miCasa.consumosReducidos(10000.0, 7500.0);
        miCasa.maximoConsumo();
        miCasa.minimoConsumo();
    }
}

