/**
 * Representa un Camión, que es un tipo de Vehículo con una característica adicional:
 * puede tener o no un acoplado.
 */
public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    /**
     * Crea una nueva instancia de Camión con los datos especificados.
     *
     * @param patente          Patente del Camión.
     * @param marca            Marca del Camión.
     * @param anio             Año de fabricación del Camión.
     * @param capacidadCargaKg Capacidad de carga en kilogramos.
     * @param tieneAcoplado    true si el Camión tiene acoplado, false en caso contrario.
     */
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    /**
     * Devuelve verdadero si el Camión tiene acoplado.
     *
     * @return true si tiene acoplado, false si no.
     */
    public boolean tieneAcoplado() {
        return tieneAcoplado;
    }

    /**
     * Establece si el Camión tiene acoplado.
     *
     * @param tieneAcoplado true si tiene acoplado, false si no.
     */
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    /**
     * Devuelve una representación en texto del Camión, incluyendo los datos heredados
     * y si tiene o no acoplado.
     *
     * @return Información detallada del Camión.
     */
    @Override
    public String toString() {
        return "=== Información del Vehículo ===\n" +
                "Patente: " + getPatente() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Año: " + getAnio() + "\n" +
                "Capacidad de carga (kg): " + getCapacidadCargaKg() + "\n" +
                "Tiene acoplado: " + (tieneAcoplado ? "Sí" : "No") + "\n" +
                "===============================";
    }
}