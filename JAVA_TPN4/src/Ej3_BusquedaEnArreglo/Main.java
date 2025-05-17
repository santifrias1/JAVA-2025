/*
Busqueda en Arreglos
author @santiagofrias
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Arreglo generado por el usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = Integer.parseInt(input.nextLine());

        String[] nuevoArr = new String[n];

        // ciclo for para ingresar las palabras al arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            nuevoArr[i] = input.nextLine();
        }

        GeneradorArreglo arreglo1 = new GeneradorArreglo(nuevoArr);
        arreglo1.mostrarArreglo();

        // El usuario ingresa la palabra a buscar
        System.out.print("\nIngrese una palabra para buscarla en el arreglo: ");
        String palabra = input.nextLine();
        int posPalabra = arreglo1.buscarEnArray(palabra);

        if (posPalabra >= 0) {
            System.out.println("La palabra '" + palabra + "' se encuentra en la posición [" + posPalabra + "] del arreglo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no se encuentra en el arreglo.");
        }
    }
}