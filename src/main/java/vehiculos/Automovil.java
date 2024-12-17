package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Vehiculo.incrementarAutomoviles();
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
