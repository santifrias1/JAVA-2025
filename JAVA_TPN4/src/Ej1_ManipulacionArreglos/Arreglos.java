import java.util.Scanner;

public class Arreglos {
    private int cantidad;
    private int[] numeros;

    public void ingresoNumeros() {
        Scanner input = new Scanner(System.in);

        System.out.print("Cuantos numeros desea ingresar?: ");
        cantidad = input.nextInt();
        numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }
    }

    public void sumaElementos() {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

    public void numeroMayor(){
        int mayor = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: "+ mayor);
    }

    public void numeroMenor(){
        int menor = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El número menor es: "+ menor);
    }

    public void invertirArreglo(){

        System.out.println("\nArreglo normal: ");
        for(int num : numeros){
            System.out.print(num +"     ");
        }

        for(int i = 0; i < numeros.length / 2; i++){
            int invert = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = invert;
        }

        System.out.println("\n\nArreglo Invertido: ");
        for(int numInvert : numeros){
            System.out.print(numInvert +"     ");
        }
    }

}
