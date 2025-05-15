import java.util.Scanner;

public class accountBank {
    String accountNumber;
    String userName;
    double money;

    public void moneyDeposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el monto a depositar: $");
        double amount = input.nextDouble();

        if (amount > 0) {
            money += amount;
            System.out.println("╔═══════════════════════════╗");
            System.out.println("║ ¡Depósito exitoso!        ║");
            System.out.println("║ Nuevo saldo: $" + money);
            System.out.println("╚═══════════════════════════╝");
        } else {
            System.out.println("El monto ingresado no es válido.");
        }
    }

    public void moneyRetreat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el monto a retirar: $");
        double amount = input.nextDouble();

        if (amount > 0 && amount <= money) {
            money -= amount;
            System.out.println("╔═══════════════════════════╗");
            System.out.println("║ ¡Retiro exitoso!          ║");
            System.out.println("║ Nuevo saldo: $" + money);
            System.out.println("╚═══════════════════════════╝");
        } else if (amount > money) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("El monto ingresado no es válido.");
        }
    }

    public void balanceCheck() {
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║ Saldo actual: $" + money);
        System.out.println("╚═══════════════════════════╝");
    }
}
