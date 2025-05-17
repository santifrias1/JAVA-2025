/*
parte2 - Ej2_TPN4
Analisis de Metodos de Ordenamiento
author @santiagofrias
 */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};

        System.out.printf("%-12s %-20s %-20s%n", "Tamaño", "Bubble Sort (ms)", "Arrays.sort (ms)");

        for (int size : sizes) {
            int[] arrayToSort = SortComparacion.generateRandomArray(size);
            int[] copyArray;

            // Medir Bubble Sort
            copyArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
            long startTime = System.nanoTime();
            SortComparacion.bubbleSort(copyArray);
            long endTime = System.nanoTime();
            long bubbleSortTime = (endTime - startTime) / 1_000_000; // Convertir a milisegundos

            // Medir Arrays.sort
            copyArray = Arrays.copyOf(arrayToSort, arrayToSort.length);
            startTime = System.nanoTime();
            Arrays.sort(copyArray);
            endTime = System.nanoTime();
            long arraySortTime = (endTime - startTime) / 1_000_000; // Convertir a milisegundos

            System.out.printf("%-12d %-20d %-20d%n", size, bubbleSortTime, arraySortTime);
        }
    }
}


