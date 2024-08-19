/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio3 {

    public static double calcularLongitudEscalera(double altura, double angulo) {

        double anguloRadianes = Math.toRadians(angulo);

        double longitudEscalera = altura / Math.cos(anguloRadianes);

        return longitudEscalera;
    }
}

