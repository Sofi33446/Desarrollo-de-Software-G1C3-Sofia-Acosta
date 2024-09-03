/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Guía 2 - Actividad 2
 * Ejercicio: alcancia
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 * Panel donde se muestra el estado actual de la alcancía.
 */
@SuppressWarnings("serial")
public class PanelAlcancia extends JPanel {

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    private JLabel lblAlcancia;
    private JTextArea txtMensaje;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo panel. <br>
     * <b>post: </b> Se construyó el panel y se inicializaron sus componentes.
     */
    public PanelAlcancia() {
        setLayout(new BorderLayout());

        ImageIcon imagenAlcancia = new ImageIcon("./data/alcancia.png");
        ImageIcon imagenAlcanciaRota = new ImageIcon("./data/alcanciaRota.png");

        lblAlcancia = new JLabel(imagenAlcancia);
        add(lblAlcancia, BorderLayout.CENTER);

        txtMensaje = new JTextArea(3, 40);
        txtMensaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txtMensaje.setText("Alcancía vacía");
        txtMensaje.setWrapStyleWord(true);
        txtMensaje.setLineWrap(true);
        txtMensaje.setBackground(getBackground());
        txtMensaje.setEditable(false);
        add(txtMensaje, BorderLayout.SOUTH);

        setBorder(new TitledBorder("Alcancía"));
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Cambia el mensaje mostrado. <br>
     * <b>post: </b> Se cambió el mensaje.
     *
     * @param pMensaje Mensaje que se quiere mostrar. pMensaje != null.
     */
    public void cambiarMensaje(String pMensaje) {
        txtMensaje.setText(pMensaje);
    }

    /**
     * Cambia el dibujo de la alcancía según el estado actual. <br>
     * <b>post: </b> Se actualizó el dibujo de la alcancía.
     *
     * @param pRota Indica si actualmente la alcancía está rota o no.
     */
    public void cambiarImagenAlcancia(boolean pRota) {
        ImageIcon imagenAlcancia = new ImageIcon("./data/alcancia.png");
        ImageIcon imagenAlcanciaRota = new ImageIcon("./data/alcanciaRota.png");

        if (pRota) {
            lblAlcancia.setIcon(imagenAlcanciaRota);
        } else {
            lblAlcancia.setIcon(imagenAlcancia);
        }
    }
}
