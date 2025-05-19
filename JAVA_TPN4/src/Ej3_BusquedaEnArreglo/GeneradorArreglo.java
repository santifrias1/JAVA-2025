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

    public void buscarEnArray(String palabra) {
        String palabraBuscar = palabra.toLowerCase(Locale.ROOT);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains(palabraBuscar)) {
                System.out.println("La cadena "+palabraBuscar+" se encuentra en el indice ["+i+"]: "+arr[i]+"");
            }else{
                System.out.println("No se encontró la cadena");
            }


        }

    }
}