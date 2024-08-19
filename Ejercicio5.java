/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio5 {


    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeno) {

        double areaGrande = calcularAreaCirculo(radioGrande);
        

        double areaPequena = calcularAreaCirculo(radioPequeno);

        return areaGrande - areaPequena;
    }
}
