/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarriollodesoftware;

/**
 *
 * @author sacos
 */
public class Ejercicio8 {


    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {

        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {

        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    
    }
}




    


