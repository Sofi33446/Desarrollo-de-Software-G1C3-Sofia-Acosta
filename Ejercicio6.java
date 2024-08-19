/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio6 {

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularHipotenusa(double catetoA, double catetoB) {
        return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        // Hallamos la hipotenusa (lado más largo del triángulo)
        double hipotenusa = calcularHipotenusa(ladoB, ladoC);

        return ladoA + ladoB + hipotenusa;
    }
}

    

