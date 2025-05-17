import java.util.Arrays;
import java.util.Locale;

class GeneradorArreglo {
    private String[] arr;

    public GeneradorArreglo(String[] arr) {
        this.arr = arr;
        ordenarArreglo();
    }

    private void ordenarArreglo(){
        Arrays.sort(arr);
    }

    public void mostrarArreglo() {
        System.out.println("\nArreglo Ordenado Alfabéticamente: ");
        for (String palabra : arr) {
            System.out.print("[" + palabra + "] ");
        }
        System.out.println(); // salto de línea
    }

    public int buscarEnArray(String palabra) {
        String palabraBuscar = palabra.toLowerCase(Locale.ROOT);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains(palabraBuscar)) {
                return i;
            }
        }
        return -1;
    }
}