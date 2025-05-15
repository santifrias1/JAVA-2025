/*
Coordenadas de un punto en el plano xy
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Coordenadas de un punto en el plano");
        System.out.println("-----------------------------------");
        System.out.print("Ingrese un valor para x: ");
        int x = input.nextInt();
        System.out.print("Ingrese un valor para y: ");
        int y = input.nextInt();

        if(x!=0 && y!=0){
            if(x>0 && y>0){
                System.out.println("De acuerdo a las coordenas, su punto pertenece al primer cuadrante.");
                System.out.print("El punto en el plano es: ("+ x +", "+ y +")");
            } else if (x<0 && y>0) {
                System.out.println("De acuerdo a las coordenas, su punto pertenece al segundo cuadrante.");
                System.out.print("El punto en el plano es: ("+ x +", "+ y +")");
            } else if (x<0 && y<0) {
                System.out.println("De acuerdo a las coordenas su punto pertenece al tercer cuadrante.");
                System.out.print("El punto en el plano es: ("+ x +", "+ y +")");
            }else{
                System.out.println("De acuerdo a las coordenas su punto pertenece al cuarto cuadrante.");
                System.out.print("El punto en el plano es: ("+ x +", "+ y +")");
            }
        }else{
            System.out.println("El valor de alguna de las variables es 0.");
        }
        }
    }