/**
 * Representa un camión, que es un tipo de vehículo con una característica adicional:
 * puede tener un acoplado o no. Hereda de la clase Vehiculo.
 */
public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    /**
     * Crea un nuevo camión con los datos especificados.
     *
     * @param patente Patente del camión.
     * @param marca Marca del camión.
     * @param anio Año de fabricación del camión.
     * @param capacidadCargaKg Capacidad de carga del camión en kilogramos.
     * @param tieneAcoplado Indica si el camión tiene acoplado.
     */
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    /**
     * Indica si el camión tiene acoplado.
     *
     * @return true si tiene acoplado, false en caso contrario.
     */
    public boolean tieneAcoplado() {
        return tieneAcoplado;
    }

    /**
     * Establece si el camión tiene acoplado.
     *
     * @param tieneAcoplado true si tiene acoplado, false en caso contrario.
     */
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }
}