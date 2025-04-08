/**
 * Clase principal del programa. Se encarga de crear e imprimir vehículos.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * Crea instancias de Vehiculo e imprime su información por consola
     * utilizando la clase VehiculoPrinter.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa)
     */

    public static void main(String[] args) {
        VehiculoPrinter printer = new VehiculoPrinter();

        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", 2015, 1200.0);
        Vehiculo v2 = new Vehiculo("DEF456", "Ford", 2020, 1500.0);
        Vehiculo v3 = new Vehiculo("GHI789", "Honda", 2018, 1000.0);

        // v1.mostrarInformacion();
        // System.out.println();
        // v2.mostrarInformacion();
        // System.out.println();
        // v3.mostrarInformacion();

        printer.imprimirInformacion(v1);
        System.out.println();
        printer.imprimirInformacion(v2);
        System.out.println();
        printer.imprimirInformacion(v3);


        // Intentar crear un vehículo con año inválido
        try {
            Vehiculo v4 = new Vehiculo("JKL999", "Chevrolet", 1800, 1300.0);
            // v4.mostrarInformacion();
            printer.imprimirInformacion(v4);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear vehículo inválido: " + e.getMessage());
        }
        // Intentar crear un vehículo con patente vacía
        try {
            Vehiculo v5 = new Vehiculo("", "Nissan", 2019, 1100.0);
            // v5.mostrarInformacion();
            printer.imprimirInformacion(v5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear vehículo con patente vacía: " + e.getMessage());
        }
        // Intentar crear un vehículo con capacidad de carga negativa
        try {
            Vehiculo v6 = new Vehiculo("MNO321", "Volkswagen", 2017, -500.0);
            // v6.mostrarInformacion();
            printer.imprimirInformacion(v6);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear vehículo con carga negativa: " + e.getMessage());
        }
    }
}