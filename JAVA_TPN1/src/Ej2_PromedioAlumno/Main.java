/*
Promedio de Alumno
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nota del primer parcial: ");
        int parcial1 = input.nextInt();
        System.out.print("Ingrese la nota del segundo parcial: ");
        int parcial2 = input.nextInt();
        System.out.print("Ingrese la nota del tercer parcial: ");
        int parcial3 = input.nextInt();
        var promedio = (parcial1 + parcial2 + parcial3) / 3;

        if(promedio>=0 && promedio<=10){
            if(promedio<4){
                System.out.print("Usted desaprobó la materia, su promedio es: " + promedio);
            }else if(promedio>=8){
                System.out.print("Promocionó la materia con un promedio de "+ promedio +". Felicidades!");
            }else{
                System.out.print("Aprobo con promedio regular. Su promedio es: " + promedio);
            }
        }else{
            System.out.print("Error. El promedio " + promedio + " no es valido!");
        }
    }
}