/*
Calculo de Interes Compuesto
author @santiagofrias
*/
public class Main {
    public static void main(String[] args) {
        double valorInicial = 10000.0;
        double interesAnual = 0.06; //representa el 6%
        byte tiempo = 5;

        System.out.println("Calculo de Interes Compuesto:");
        System.out.println("Valor Inicial: $"+ valorInicial);
        System.out.println("Tasa de Interes Anual: "+ interesAnual);
        System.out.println("Tiempo: "+ tiempo + " años");

        double valorFuturo = valorInicial * Math.pow(1 + interesAnual, tiempo);
        System.out.println("El valor futuro sin redondeo: $"+ valorFuturo);

        long redondeoLargo = Math.round(valorFuturo);
        System.out.println("Valor futuro redondeado: $"+ redondeoLargo);
    }
}