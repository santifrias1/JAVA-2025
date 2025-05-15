/*
Determinar lados de un Triangulo
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int equilatero = 0, isosceles = 0, escaleno = 0;

        System.out.print("Cuantos triángulos desea ingresar: ");
        int i, n = input.nextInt();

        for(i=0; i<n; i++){
            System.out.println("Triángulo "+ (i+1) +":");
            System.out.print("Lado 1: ");
            int a = input.nextInt();
            System.out.print("Lado 2: ");
            int b = input.nextInt();
            System.out.print("Lado 3: ");
            int c = input.nextInt();

            if(a>=0 && b>=0 && c>=0){
                if(a+b>c && a+c>b && b+c>a){
                    if(a==b && b==c){
                        System.out.println("El triángulo es equilátero.");
                        equilatero++;
                    }else if (a==b || b==c || a==c) {
                        System.out.println("El triángulo es isósceles.");
                        isosceles++;
                    }else {
                        System.out.println("El triángulo es escaleno.");
                        escaleno++;
                    }
                }else{
                    System.out.println("No es un triángulo valido.");
                }
            }else{
                System.out.println("Los valores del lado del triángulo no pueden ser negativos.");
            }
        }

        System.out.println("---------------------------");
        System.out.println("Resumen de Triángulos:");
        System.out.println("Cantidad de equiláteros: "+ equilatero);
        System.out.println("Cantidad de isósceles: "+ isosceles);
        System.out.println("Cantidad de escalenos: "+ escaleno);
        System.out.println("---------------------------");

        if(equilatero<isosceles && equilatero<escaleno){
            System.out.print("El triángulo con menor cantidad es el Equilátero  ("+ equilatero +").");
        }else if(isosceles<equilatero && isosceles<escaleno){
            System.out.print("El triángulo con menor cantidad es el isósceles ("+ isosceles +").");
        }else if(escaleno<equilatero && escaleno<isosceles){
            System.out.print("El triángulo con menor cantidad es el escaleno ("+ escaleno +").");
        }else{
            System.out.print("Varios tipos tienen la misma cantidad menor.");
        }
    }
}