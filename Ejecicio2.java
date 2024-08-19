/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejecicio2 {

    public static int calcularBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {

        int sillasRequeridas = (estudiantesGordos * 2) + estudiantesFlacos;

        int numeroDeBuses = sillasRequeridas / sillasPorBus;

        if (sillasRequeridas % sillasPorBus != 0) {
            numeroDeBuses++;
        }

        return numeroDeBuses;
    }
}

