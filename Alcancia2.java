/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alcancia2;

import javax.swing.JFrame;
import interfaz.InterfazAlcancia;

public class Alcancia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear y configurar la ventana principal
        JFrame ventana = new JFrame("Aplicación Alcancía");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 400);
        ventana.setLocationRelativeTo(null);

        InterfazAlcancia interfaz = new InterfazAlcancia();
        ventana.add(interfaz);

        ventana.setVisible(true);
    }
}
