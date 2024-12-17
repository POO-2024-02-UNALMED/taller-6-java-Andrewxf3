package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Vehiculo.incrementarCamiones();
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}