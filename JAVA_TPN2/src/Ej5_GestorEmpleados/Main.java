/*
Gestor de Empleados
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employees pageEmployees = new Employees();

        // Agregando empleados
        pageEmployees.addEmployee(1, "Ezequiel Martinez", 5000, "Buen Comportamiento.");
        pageEmployees.addEmployee(2, "Emanuel Farias", 8000, "Buen desempeño esta semana.");
        pageEmployees.addEmployee(3, "Gonzalo Rodriguez", 2000, "Buen Comportamiento.");
        pageEmployees.addEmployee(4, "Ratón Perez", 9000, "Excelente trabajo.");

        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║    Sistema de Gestión de Empleado    ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.println("╔════════════════════════════════════════════════╗");
            System.out.println("║ 1. Ver toda la info de los empleados.          ║");
            System.out.println("║ 2. Aumentar salario por porcentaje.            ║");
            System.out.println("║ 3. Aumentar salario con monto fijo.            ║");
            System.out.println("║ 4. Salir.                                      ║");
            System.out.println("╚════════════════════════════════════════════════╝");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de la entrada

            switch (option) {
                case 1:
                    pageEmployees.showEmployeesInfo();
                    break;
                case 2:
                    System.out.print("Ingrese legajo del empleado: ");
                    int fileNumberPercentage = scanner.nextInt();
                    System.out.print("¿Cual es el porcentaje de aumento? (Ej: 10): ");
                    double percentage = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese razón de aumento: ");
                    String reasonPercentage = scanner.nextLine();
                    pageEmployees.percentageIncrease(fileNumberPercentage, percentage, reasonPercentage);
                    break;
                case 3:
                    System.out.print("Ingrese el legajo del empleado: ");
                    int fileNumberAmount = scanner.nextInt();
                    System.out.print("¿Cual es el aumento fijo? (Ej: 500): ");
                    double fixedAmount = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese razón de aumento: ");
                    String reasonAmount = scanner.nextLine();
                    pageEmployees.fixedAmountIncrease(fileNumberAmount, fixedAmount, reasonAmount);
                    break;
                case 4:
                    System.out.println("╔════════════════════════════╗");
                    System.out.println("║   Nos vemos luego...       ║");
                    System.out.println("╚════════════════════════════╝");
                    break;
                default:
                    System.out.println("Esa opción no existe, intenta otra vez.");
            }
        } while (option != 4);

        scanner.close();
    }
}

