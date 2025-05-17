/*
parte3 - Ej2_TPN4
Ordenamiento de Productos por Nombre y Precio
author @santiagofrias
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Notebook", 1519998.00,15));
        productos.add(new Producto("SmartTV", 1241999.00, 10));
        productos.add(new Producto("Telefono", 448999.00, 13));

        System.out.println("Ordenamiento por nombre (Comparable<>): ");
        Collections.sort(productos);
        for(Producto p : productos){
            System.out.println("→ "+ p.getNombre() +" - $"+ p.getPrecio() +" - "+ p.getStock() +" Unidades disponibles.");
        }

        System.out.println("\nOrdenamiento por precio (Comparator<>): ");
        Collections.sort(productos, new ComparadorPorPrecio());
        for(Producto p : productos){
            System.out.println("→ "+ p.getNombre() +" - $"+ p.getPrecio() +" - "+ p.getStock() +" Unidades disponibles.");
        }
    }
}

