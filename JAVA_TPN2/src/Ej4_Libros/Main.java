/*
Simulador de Libreria
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstBook physicsBook = new firstBook();
        secondBook mathsBook = new secondBook();

        physicsBook.nameAuthor = "Raymond A. Serway";
        physicsBook.titleBook = "Physics, Electricity and Magnetism";
        physicsBook.bookCode = "978-6075224909";
        physicsBook.state = "Disponible";

        mathsBook.nameAuthor = "James Stewart";
        mathsBook.titleBook = "Calculus Early Transcendentals, 7th Edition";
        mathsBook.bookCode = "978-1111426682";
        mathsBook.state = "Disponible";

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("╔═════════════════════════════════╗");
            System.out.println("║            LIBRERÍA             ║");
            System.out.println("╠═════════════════════════════════╣");
            System.out.println("║ 1. Mostrar libro de Física      ║");
            System.out.println("║ 2. Mostrar libro de Matemática  ║");
            System.out.println("║ 3. Prestar libro de Física      ║");
            System.out.println("║ 4. Prestar libro de Matemática  ║");
            System.out.println("║ 5. Devolver libro de Física     ║");
            System.out.println("║ 6. Devolver libro de Matemática ║");
            System.out.println("║ 0. Salir                        ║");
            System.out.println("╚═════════════════════════════════╝");
            System.out.print("Seleccione una opción: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    physicsBook.showInformation();
                    break;
                case 2:
                    mathsBook.showInformation();
                    break;
                case 3:
                    physicsBook.lendBook();
                    break;
                case 4:
                    mathsBook.lendBook();
                    break;
                case 5:
                    physicsBook.returnBook();
                    break;
                case 6:
                    mathsBook.returnBook();
                    break;
                case 0:
                    System.out.println("Saliendo de la librería...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();

        } while (option != 0);

        input.close();
    }
}

