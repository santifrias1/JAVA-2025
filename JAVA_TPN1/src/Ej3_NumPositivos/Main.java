/*
Numeros Positivos entre (1-99)
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char repetir;

        do{
            System.out.print("Ingrese un numero del intervalo (1-99): ");
            int numero = sc.nextInt();

            if(numero>=1 && numero<=99){
                if(numero>=1 && numero<=9){
                    System.out.println("El numero ingresado tiene 1 digito.");
                }else{
                    System.out.println("El numero ingresado tiene 2 digitos.");
                }
            }else{
                System.out.println("El numero ingresado no pertenece al intervalo.");
                System.out.println("Por favor ingrese otro numero, gracias!");
            }

            System.out.print("Desea ejecutar el sistema nuevamente? (S/s): ");
            repetir = sc.next().charAt(0);
        }while (repetir == 'S' || repetir == 's');

        System.out.print("Gracias por utilizar el sistema!");
    }
}