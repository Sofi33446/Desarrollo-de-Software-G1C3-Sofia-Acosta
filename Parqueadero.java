/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double registrarSalida(String placa) {
        Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
        if (vehiculo != null) {
            LocalDateTime horaSalida = LocalDateTime.now();
            Duration duracion = Duration.between(vehiculo.getHoraEntrada(), horaSalida);
            long horas = duracion.toHours() + (duracion.toMinutesPart() > 0 ? 1 : 0);
            vehiculos.remove(vehiculo);

            if (vehiculo instanceof Automovil) {
                return horas * 5000;
            } else if (vehiculo instanceof Motocicleta) {
                return horas * 3000;
            } else if (vehiculo instanceof Camion) {
                return horas * 10000; 
            }
        }
        throw new RuntimeException("Vehículo no encontrado");
    }

    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }

    private Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
}
