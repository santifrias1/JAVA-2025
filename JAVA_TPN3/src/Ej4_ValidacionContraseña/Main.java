/*
Validacion de Contraseña
author @santiagofrias
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nuevaContrasena contrasena = new nuevaContrasena();

        System.out.print("Ingrese la contraseña: ");
        String password = input.next();

        if (contrasena.esContrasenaSegura(password)) {
            System.out.println("¡Contraseña segura! No se necesita generar una nueva.");
        } else {
            System.out.println("La contraseña no es segura. Vamos a generar una por usted.");

            System.out.print("Ingrese su nombre: ");
            String nombre = input.next();

            System.out.print("Ingrese su apellido: ");
            String apellido = input.next();

            System.out.print("Ingrese su fecha de nacimiento: ");
            String fechaNacimiento = input.next();

            String generada = contrasena.generarContrasenaSegura(nombre, apellido, fechaNacimiento);
            System.out.println("Su nueva contraseña segura es: " + generada);
        }
    }
}

