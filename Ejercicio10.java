/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio10 {

    public static double aplicarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return (double) num1 / num2;
                } else {
                    throw new IllegalArgumentException("División por cero no permitida.");
                }
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
    }
}

