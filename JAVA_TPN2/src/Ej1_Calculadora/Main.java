/*
Calculadora Básica
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator miCalculadora = new Calculator();

        System.out.println("╔══════════════════════════╗");
        System.out.println("║        CALCULADORA       ║");
        System.out.println("╚══════════════════════════╝");

        System.out.print("Ingrese el primer número: ");
        double numberOne = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numberTwo = sc.nextDouble();

        double resultado = 0;

        System.out.println();
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║ ¿Qué operación desea realizar?     ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1 - Suma                           ║");
        System.out.println("║ 2 - Resta                          ║");
        System.out.println("║ 3 - Multiplicación                 ║");
        System.out.println("║ 4 - División                       ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.print("Ingrese acá (1, 2, 3, 4): ");
        byte opCalculator = sc.nextByte();

        System.out.println(); // Espacio visual

        switch (opCalculator) {
            case 1:
                resultado = miCalculadora.Sum(numberOne, numberTwo);
                break;
            case 2:
                resultado = miCalculadora.Subtraction(numberOne, numberTwo);
                break;
            case 3:
                resultado = miCalculadora.Multiplication(numberOne, numberTwo);
                break;
            case 4:
                resultado = miCalculadora.Division(numberOne, numberTwo);
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("╔══════════════════════════╗");
        System.out.println("║ Resultado = " + resultado);
        System.out.println("╚══════════════════════════╝");
    }
}

