package vehiculos;

import java.util.HashMap;

public class Pais {
    private String nombre;

    private static HashMap<Pais, Integer> ventasPorPais = new HashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void registrarVenta(Pais pais) {
        ventasPorPais.put(pais, ventasPorPais.getOrDefault(pais, 0) + 1);
    }

    public static Pais paisMasVendedor() {
        Pais paisMax = null;
        int maxVentas = 0;

        for (Pais pais : ventasPorPais.keySet()) {
            int ventas = ventasPorPais.get(pais);
            if (ventas > maxVentas) {
                maxVentas = ventas;
                paisMax = pais;
            }
        }
        return paisMax;
    }
}
