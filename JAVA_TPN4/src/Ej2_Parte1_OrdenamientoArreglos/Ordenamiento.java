import java.util.Arrays;
//clase que contiene los metodos de ordenamiento
class Ordenamiento {
    public int[] miArreglo = {3, 12, 5, 9, 2}; //arreglo no ordenado

    public void arregloNoOrdenado() {
        System.out.println("Arreglo Original: ");
        for (int num : miArreglo) {
            System.out.print("[" + num + "] ");
        }
        System.out.println(); //salto de linea
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void mostrarBubbleSort() {
        System.out.println("\nMetodo de Ordenamiento Bubble Sort: ");
        Ordenamiento.bubbleSort(miArreglo);
        //for-each para mostrar arreglo
        for (int num : miArreglo) {
            System.out.print("[" + num + "] ");
        }
        System.out.println(); //salto de linea
    }

    public void mostrarArraysSort() {
        System.out.println("\nMetodo de Ordenamiento Arrays.sort: ");
        Arrays.sort(miArreglo); //metodo ordenamiento Arrays.sort
        //for-each para mostrar arreglo
        for (int num : miArreglo) {
            System.out.print("[" + num + "] ");
        }
    }
}
