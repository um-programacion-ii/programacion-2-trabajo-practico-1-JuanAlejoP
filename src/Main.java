import java.util.ArrayList;
/**
 * Clase principal del programa. Se encarga de crear e imprimir vehículos y camiones.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * Crea instancias de Vehiculo y Camion, imprime su información por consola
     * utilizando la clase VehiculoPrinter, y realiza pruebas con datos inválidos
     * para validar el manejo de excepciones.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa)
     */

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        VehiculoPrinter printer = new VehiculoPrinter();

        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", 2015, 1200.0);
        Vehiculo v2 = new Vehiculo("DEF456", "Ford", 2020, 1500.0);
        Vehiculo v3 = new Vehiculo("GHI789", "Honda", 2018, 1000.0);

        printer.imprimirInformacion(v1);
        System.out.println();
        printer.imprimirInformacion(v2);
        System.out.println();
        printer.imprimirInformacion(v3);


        // Intentar crear un vehículo con año inválido
        try {
            Vehiculo v4 = new Vehiculo("JKL999", "Chevrolet", 1800, 1300.0);
            printer.imprimirInformacion(v4);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear vehículo inválido: " + e.getMessage());
        }
        // Intentar crear un vehículo con patente vacía
        try {
            Vehiculo v5 = new Vehiculo("", "Nissan", 2019, 1100.0);
            printer.imprimirInformacion(v5);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear vehículo con patente vacía: " + e.getMessage());
        }
        // Intentar crear un vehículo con capacidad de carga negativa
        try {
            Vehiculo v6 = new Vehiculo("MNO321", "Volkswagen", 2017, -500.0);
            printer.imprimirInformacion(v6);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear vehículo con carga negativa: " + e.getMessage());
        }

        // Crear un camión con acoplado y mostrar sus datos
        Camion camion = new Camion("TRK123", "Scania", 2022, 8000.0, true);
        printer.imprimirInformacion(camion);

        // Crear un camión sin acoplado y mostrar sus datos
        Camion camionSinAcoplado = new Camion("TRK789", "Mercedes-Benz", 2021, 7500.0, false);
        printer.imprimirInformacion(camionSinAcoplado);

        // Crear un Auto con cantidad de pasajeros y mostrar sus datos
        Auto auto = new Auto("DEF456", "Toyota", 2020, 500.0, 5);
        printer.imprimirInformacion(auto);

        // Intentar crear un Auto con cantidad de pasajeros inválida
        try {
            Auto autoInvalido = new Auto("ZZZ999", "Fiat", 2023, 400.0, 0);
            printer.imprimirInformacion(autoInvalido);
        } catch (IllegalArgumentException e) {
            System.out.println("\nError al crear auto con cantidad de pasajeros inválida: " + e.getMessage());
        }

        // Referencias de tipo Vehiculo a instancias de Auto y Camion
        Vehiculo vehiculoAuto = new Auto("LSP123", "Renault", 2019, 450.0, 4);
        Vehiculo vehiculoCamion = new Camion("LSP456", "Volvo", 2023, 9500.0, true);

        // Imprimir usando VehiculoPrinter sin usar instanceof ni cast
        printer.imprimirInformacion(vehiculoAuto);
        System.out.println();
        printer.imprimirInformacion(vehiculoCamion);

        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Ford", 2010, 1200.0);
        Auto auto1 = new Auto("DEF456", "Toyota", 2020, 500.0, 5);
        Camion camion1 = new Camion("GHI789", "Mercedes", 2015, 2000.0, true);

        vehiculos.add(vehiculo1);
        vehiculos.add(auto1);
        vehiculos.add(camion1);

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }


    }
}