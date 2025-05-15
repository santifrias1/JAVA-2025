public class Electrodomesticos {
    private String nombre;
    private double consumo;

    public Electrodomesticos(String nombre, double consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public String getNombre(){ return nombre; }

    public double getConsumo() { return consumo; }
}
