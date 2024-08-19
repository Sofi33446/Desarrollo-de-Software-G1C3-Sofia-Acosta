/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio14 {


    public static String obtenerHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {

        String hermanoMayor = nombre1;
        int edadMayor = edad1;

        if (edad2 > edadMayor) {
            hermanoMayor = nombre2;
            edadMayor = edad2;
        }

        if (edad3 > edadMayor) {
            hermanoMayor = nombre3;
            edadMayor = edad3;
        }

        return hermanoMayor;
    }
}


