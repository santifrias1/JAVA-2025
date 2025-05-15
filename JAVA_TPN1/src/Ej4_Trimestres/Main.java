/*
Trimestres del Año
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("Ingrese Dia / Mes / Año");
        System.out.println("------------------------");
        System.out.print("Dia: ");
        int dia = input.nextInt();
        System.out.print("Mes: ");
        int mes = input.nextInt();
        System.out.print("Año: ");
        int anio = input.nextInt();

        if(dia>=1 && dia<=31) {
            if (mes >= 1 && mes <= 12) {
                if (mes >= 1 && mes <= 3) {
                    System.out.println("El mes ingresado pertenece al primer trimestre del año " + anio);
                } else if (mes >= 4 && mes <= 6) {
                    System.out.println("El mes ingresado pertenece al segundo trimestre del año " + anio);
                } else if (mes >= 7 && mes <= 9) {
                    System.out.println("El mes ingresado pertenece al tercer trimestre del año " + anio);
                } else {
                    System.out.println("El mes ingresado pertenece al cuarto trimestre del año " + anio);
                }
            } else {
                System.out.print("El mes ingresado no es valido.");
            }
        }else{
            System.out.println("El dia ingresado no es valido.");
        }
    }
}