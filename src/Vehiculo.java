/**
 * Representa un vehículo con atributos básicos como patente, marca, año y capacidad de carga.
 * Esta clase puede ser utilizada como base para distintos tipos de vehículos.
 * Incluye validaciones para garantizar la integridad de los datos.
 */
public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    private static final int ANIO_MINIMO = 1900;
    private static final int ANIO_MAXIMO = 2025;

    /**
     * Crea un nuevo vehículo con los datos especificados.
     *
     * @param patente Patente del vehículo. No puede ser nula ni vacía.
     * @param marca Marca del vehículo.
     * @param anio Año de fabricación del vehículo. Debe estar entre 1900 y el año actual.
     * @param capacidadCargaKg Capacidad de carga del vehículo en kilogramos. Debe ser positiva.
     * @throws IllegalArgumentException Si alguno de los valores no cumple con las validaciones.
     */
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        validarPatente(patente);
        validarAnio(anio);
        validarCapacidadCargaKg(capacidadCargaKg);

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    /**
     * Obtiene la patente del vehículo.
     *
     * @return La patente del vehículo.
     */
    public String getPatente() {
        return patente;
    }
    /**
     * Obtiene la marca del vehículo.
     *
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Obtiene el año de fabricación del vehículo.
     *
     * @return El año de fabricación.
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Obtiene la capacidad de carga del vehículo en kilogramos.
     *
     * @return La capacidad de carga en kg.
     */
    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    /**
     * Establece la patente del vehículo.
     * La patente no puede ser nula ni vacía.
     *
     * @param patente La nueva patente del vehículo.
     * @throws IllegalArgumentException si la patente es nula o vacía.
     */
    public void setPatente(String patente) {
        validarPatente(patente);
        this.patente = patente;
    }
    /**
     * Establece la marca del vehículo.
     *
     * @param marca La nueva marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Establece el año de fabricación del vehículo.
     * Debe estar entre 1900 y el año máximo permitido.
     *
     * @param anio El nuevo año de fabricación.
     * @throws IllegalArgumentException si el año está fuera del rango permitido.
     */
    public void setAnio(int anio) {
        validarAnio(anio);
        this.anio = anio;
    }
    /**
     * Establece la capacidad de carga del vehículo en kilogramos.
     * Debe ser un valor positivo.
     *
     * @param capacidadCargaKg La nueva capacidad de carga.
     * @throws IllegalArgumentException si el valor no es positivo.
     */
    public void setCapacidadCargaKg(double capacidadCargaKg) {
        validarCapacidadCargaKg(capacidadCargaKg);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    /**
     * Valida que la patente no sea nula ni vacía.
     *
     * @param patente La patente a validar.
     * @throws IllegalArgumentException si la patente es nula o vacía.
     */
    private void validarPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }
    }
    /**
     * Valida que el año esté dentro del rango permitido.
     *
     * @param anio El año a validar.
     * @throws IllegalArgumentException si el año es menor que ANIO_MINIMO o mayor que ANIO_MAXIMO.
     */
    private void validarAnio(int anio) {
        if (anio < ANIO_MINIMO || anio > ANIO_MAXIMO) {
            throw new IllegalArgumentException("El año debe estar entre " + ANIO_MINIMO + " y " + ANIO_MAXIMO + ".");
        }
    }
    /**
     * Valida que la capacidad de carga sea positiva.
     *
     * @param capacidadCargaKg La capacidad de carga a validar.
     * @throws IllegalArgumentException si la capacidad es menor o igual a 0.
     */
    private void validarCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un número positivo.");
        }
    }

    /**
     * Devuelve una representación en texto del vehículo.
     *
     * @return Información detallada del vehículo.
     */
    @Override
    public String toString() {
        return "=== Información del Vehículo ===\n" +
                "Patente: " + patente + "\n" +
                "Marca: " + marca + "\n" +
                "Año: " + anio + "\n" +
                "Capacidad de carga (kg): " + capacidadCargaKg + "\n" +
                "===============================";
    }
}