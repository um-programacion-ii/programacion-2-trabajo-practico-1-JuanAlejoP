/**
 * Clase encargada de imprimir por consola la información de un objeto Vehiculo.
 * Aplica el principio de responsabilidad única (SRP), separando la lógica de presentación
 * del modelo de datos.
 */
public class VehiculoPrinter {

    /**
     * Imprime por consola los datos del vehículo proporcionado.
     * Si el parámetro es null, se muestra un mensaje de error.
     *
     * @param vehiculo El objeto Vehiculo cuya información se desea mostrar.
     */
    public void imprimirInformacion(Vehiculo vehiculo) {
        if (vehiculo == null) {
            System.out.println("Error: El vehículo proporcionado es null.");
            return;
        }

        System.out.println("=== Información del Vehículo ===");
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga (kg): " + vehiculo.getCapacidadCargaKg());
        System.out.println("===============================");
    }
}