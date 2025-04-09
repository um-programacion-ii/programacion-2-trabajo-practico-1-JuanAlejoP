/**
 * Representa un auto, que es un tipo de vehículo con una característica adicional:
 * la cantidad de pasajeros. Hereda de la clase Vehiculo.
 */
public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    /**
     * Crea un nuevo auto con los datos especificados.
     *
     * @param patente Patente del auto.
     * @param marca Marca del auto.
     * @param anio Año de fabricación del auto.
     * @param capacidadCargaKg Capacidad de carga del auto en kilogramos.
     * @param cantidadPasajeros Cantidad de pasajeros. Debe ser mayor a cero.
     */
    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        validarCantidadPasajeros(cantidadPasajeros);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * Devuelve la cantidad de pasajeros del auto.
     *
     * @return Cantidad de pasajeros.
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * Establece la cantidad de pasajeros del auto.
     *
     * @param cantidadPasajeros Cantidad de pasajeros. Debe ser mayor a cero.
     * @throws IllegalArgumentException si el valor no es mayor a cero.
     */
    public void setCantidadPasajeros(int cantidadPasajeros) {
        validarCantidadPasajeros(cantidadPasajeros);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * Valida que la cantidad de pasajeros sea mayor a cero.
     *
     * @param cantidadPasajeros Cantidad a validar.
     * @throws IllegalArgumentException si el valor no es mayor a cero.
     */
    private void validarCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a cero.");
        }
    }

    /**
     * Devuelve una representación en texto del auto, incluyendo los datos heredados
     * y la cantidad de pasajeros.
     *
     * @return Información detallada del auto.
     */
    @Override
    public String toString() {
        return "=== Información del Vehículo ===\n" +
                "Patente: " + getPatente() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Año: " + getAnio() + "\n" +
                "Capacidad de carga (kg): " + getCapacidadCargaKg() + "\n" +
                "Cantidad de pasajeros: " + cantidadPasajeros + "\n" +
                "===============================";
    }
}
