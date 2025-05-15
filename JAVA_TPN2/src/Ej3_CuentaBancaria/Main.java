/*
Cuenta Bancaria
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        accountBank myAccount = new accountBank();
        Scanner input = new Scanner(System.in);

        myAccount.accountNumber = "33445566";
        myAccount.userName = "Frias Santiago";
        myAccount.money = 3000.0;

        int action;

        do {
            System.out.println("╔═══════════════════════════╗");
            System.out.println("║       BANCO MACRO         ║");
            System.out.println("╚═══════════════════════════╝");
            System.out.println("Bienvenido, " + myAccount.userName + "!");
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║ ¿Qué acción desea realizar?   ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ 1 - Consultar saldo           ║");
            System.out.println("║ 2 - Depositar saldo           ║");
            System.out.println("║ 3 - Retirar saldo             ║");
            System.out.println("║ 0 - Salir                     ║");
            System.out.println("╚═══════════════════════════════╝");
            System.out.print("Ingrese la acción a realizar: ");
            action = input.nextInt();

            System.out.println();

            switch (action) {
                case 1:
                    myAccount.balanceCheck();
                    break;
                case 2:
                    myAccount.moneyDeposit();
                    break;
                case 3:
                    myAccount.moneyRetreat();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar Banco Macro. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("La acción ingresada no es válida.");
            }

            System.out.println();

        } while (action != 0);
    }
}

