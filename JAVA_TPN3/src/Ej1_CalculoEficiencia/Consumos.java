public class Consumos {
    private double consumoAnterior;
    private double consumoActual;

    Electrodomesticos elect1 = new Electrodomesticos("Heladera", 400.0);
    Electrodomesticos elect2 = new Electrodomesticos("Lavarropas", 300.0);
    Electrodomesticos elect3 = new Electrodomesticos("Aire Acondicionado", 900.0);
    Electrodomesticos elect4 = new Electrodomesticos("Microondas", 600.0);
    Electrodomesticos elect5 = new Electrodomesticos("SmartTV", 200.0);

    public void consumosReducidos(double consumoAnterior, double consumoActual){
        var ahorroAnual = consumoAnterior - consumoActual;
        double indiceEficiencia = Math.sqrt(ahorroAnual);
        System.out.println("Consumo anterior: "+ consumoAnterior +" kWh");
        System.out.println("Consumo actual: "+ consumoActual +" kWh");
        System.out.println("Ahorro anual: "+ ahorroAnual +" kWh");
        System.out.println("Indice de eficiencia (raiz de ahorro): "+ indiceEficiencia +" kWh");
    }

    public void maximoConsumo(){
        double maximo = Math.max(
                Math.max(elect1.getConsumo(), elect2.getConsumo()),
                Math.max(
                        Math.max(elect3.getConsumo(), elect4.getConsumo()),
                        Math.max(elect4.getConsumo(), elect5.getConsumo())
                )
        );
        System.out.println("El máximo consumo es de: " + maximo + " kWh");
    }

    public void minimoConsumo(){
        double minimo = Math.min(
                Math.min(elect1.getConsumo(), elect2.getConsumo()),
                Math.min(
                        Math.min(elect3.getConsumo(), elect4.getConsumo()),
                        Math.min(elect4.getConsumo(), elect5.getConsumo())
                )
        );
        System.out.println("El minimo consumo es de: " + minimo + " kWh");
    }
}
