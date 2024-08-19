/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio13 {

    public static double calcularAumento(double sueldoActual) {
        double aumento;
        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10; // 10% de aumento
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08; // 8% de aumento
        } else {
            aumento = sueldoActual * 0.05; // 5% de aumento
        }
        return aumento;
    }
}


