package vehiculos;

import java.util.HashMap;

public class Fabricante {
    private String nombre;
    private Pais pais;

    private static HashMap<Fabricante, Integer> ventasPorFabricante = new HashMap<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static void registrarVenta(Fabricante fabricante) {
        ventasPorFabricante.put(fabricante, ventasPorFabricante.getOrDefault(fabricante, 0) + 1);
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricaMax = null;
        int maxVentas = 0;

        for (Fabricante fabricante : ventasPorFabricante.keySet()) {
            int ventas = ventasPorFabricante.get(fabricante);
            if (ventas > maxVentas) {
                maxVentas = ventas;
                fabricaMax = fabricante;
            }
        }
        return fabricaMax;
    }
}
