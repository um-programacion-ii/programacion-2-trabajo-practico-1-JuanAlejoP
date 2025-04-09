/**
 * Representa un Auto, que es un tipo de Vehículo con una característica adicional:
 * la cantidad de pasajeros que puede transportar.
 */
public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    /**
     * Crea una nueva instancia de Auto con los datos especificados.
     *
     * @param patente           Patente del Auto.
     * @param marca             Marca del Auto.
     * @param anio              Año de fabricación del Auto.
     * @param capacidadCargaKg  Capacidad de carga en kilogramos.
     * @param cantidadPasajeros Cantidad de pasajeros (debe ser mayor a cero).
     */
    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        validarCantidadPasajeros(cantidadPasajeros);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * Devuelve la cantidad de pasajeros del Auto.
     *
     * @return Cantidad de pasajeros.
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * Establece la cantidad de pasajeros del Auto.
     *
     * @param cantidadPasajeros Nueva cantidad de pasajeros (debe ser mayor a cero).
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
     * @throws IllegalArgumentException si la cantidad no es mayor a cero.
     */
    private void validarCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a cero.");
        }
    }

    /**
     * Devuelve una representación en texto del Auto, incluyendo los datos heredados
     * y la cantidad de pasajeros.
     *
     * @return Información detallada del Auto.
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