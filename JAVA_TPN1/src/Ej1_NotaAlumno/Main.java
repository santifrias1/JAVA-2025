/*
Nota de Alumno
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("Ingrese la nota de la materia: ");
        int nota = number.nextInt();

        if(nota>=0 && nota<=10){
            if(nota == 10){
                System.out.print("Usted acaba de aprobar con la mejor nota.");
            }else if(nota>=4){
                System.out.print("Usted está aprobado.");
            }else{
                System.out.print("Usted está desaprobado.");
            }
        }else{
            System.out.print("La nota ingresada no es valida.");
        }
    }
}