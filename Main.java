/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehiculo> parqueadero = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Consultar estado del parqueadero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1 -> {
                    // Ingresar vehículo
                    System.out.print("Tipo de vehículo (1. Automóvil, 2. Motocicleta, 3. Camión): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    LocalDateTime horaEntrada = LocalDateTime.now();

                    Vehiculo vehiculo = null;
                    switch (tipo) {
                        case 1 -> {
                            // Automóvil
                            System.out.print("Tipo de combustible (gasolina, diésel, eléctrico): ");
                            String tipoCombustible = scanner.nextLine();
                            vehiculo = new Automovil(placa, marca, modelo, horaEntrada, tipoCombustible);
                    }
                        case 2 -> {
                            // Motocicleta
                            System.out.print("Cilindraje: ");
                            int cilindraje = scanner.nextInt();
                            scanner.nextLine(); // Consumir la nueva línea
                            vehiculo = new Motocicleta(placa, marca, modelo, horaEntrada, cilindraje);
                    }
                        case 3 -> {
                            // Camión
                            System.out.print("Capacidad de carga (en toneladas): ");
                            double capacidadCarga = scanner.nextDouble();
                            scanner.nextLine(); // Consumir la nueva línea
                            vehiculo = new Camion(placa, marca, modelo, horaEntrada, capacidadCarga);
                    }
                        default -> {
                            System.out.println("Tipo de vehículo no válido.");
                            continue;
                    }
                    }

                    if (vehiculo != null) {
                        parqueadero.add(vehiculo);
                        System.out.println("Vehículo ingresado correctamente.");
                    }
                }

                case 2 -> {
                    // Registrar salida de vehículo
                    System.out.print("Ingrese la placa del vehículo que desea registrar la salida: ");
                    String placaSalida = scanner.nextLine();

                    boolean encontrado = false;
                    for (Vehiculo v : parqueadero) {
                        if (v.getPlaca().equals(placaSalida)) {
                            LocalDateTime ahora = LocalDateTime.now();
                            long horas = java.time.Duration.between(v.getHoraEntrada(), ahora).toHours();
                            double costo = calcularCosto(v, horas);

                            System.out.println("Vehículo con placa " + placaSalida + " ha salido.");
                            System.out.println("Costo total: $" + costo);
                            parqueadero.remove(v);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró un vehículo con la placa proporcionada.");
                    }
                }

                case 3 -> {
                    // Consultar estado del parqueadero
                    System.out.println("Vehículos en el parqueadero:");
                    for (Vehiculo v : parqueadero) {
                        System.out.println("Placa: " + v.getPlaca() +
                                ", Marca: " + v.getMarca() +
                                ", Modelo: " + v.getModelo() +
                                ", Hora de entrada: " + v.getHoraEntrada());
                    }
                }

                case 4 -> {
                    // Salir
                    System.out.println("Saliendo...");
                    return;
                }

                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static double calcularCosto(Vehiculo vehiculo, long horas) {
        double tarifaPorHora = 0;

        if (vehiculo instanceof Automovil) {
            tarifaPorHora = 5.0; // Tarifa por hora para automóviles
        } else if (vehiculo instanceof Motocicleta) {
            tarifaPorHora = 3.0; // Tarifa por hora para motocicletas
        } else if (vehiculo instanceof Camion) {
            tarifaPorHora = 10.0; // Tarifa por hora para camiones
        }

        long horasRedondeadas = (long) Math.ceil(horas);
        return horasRedondeadas * tarifaPorHora;
    }
}



