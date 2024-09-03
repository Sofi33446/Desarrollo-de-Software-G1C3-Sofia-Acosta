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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel en el que se encuentran los botones para romper la alcancía y crear una nueva.
 */
@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String ROMPER = "romper";
    private static final String NUEVA = "nueva";
    private static final String OPCION_1 = "opcion1";
    private static final String OPCION_2 = "opcion2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    private InterfazAlcancia principal;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    private JButton btnRomper;
    private JButton btnNueva;
    private JButton btnOpcion1;
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo panel. <br>
     * <b>post: </b> Se construyó el panel y se inicializaron sus componentes.
     *
     * @param pPrincipal Referencia a la clase principal de la interfaz. pPrincipal != null
     */
    public PanelBotones(InterfazAlcancia pPrincipal) {
        principal = pPrincipal;

        setLayout(new BorderLayout());

        // Panel para el botón de romper la alcancía
        JPanel panelInternoRomper = new JPanel();
        btnRomper = new JButton(new ImageIcon("./data/martillo.png"));
        btnRomper.setActionCommand(ROMPER);
        btnRomper.setMargin(new Insets(1, 1, 1, 1));
        btnRomper.addActionListener(this);
        btnRomper.setOpaque(false);
        btnRomper.setContentAreaFilled(false);

        panelInternoRomper.add(btnRomper);
        panelInternoRomper.setBorder(new TitledBorder("Romper alcancía"));
        add(panelInternoRomper, BorderLayout.CENTER);

        // Panel para los otros botones
        JPanel panelInternoBotones = new JPanel();

        btnNueva = new JButton("Nueva alcancía");
        btnNueva.setActionCommand(NUEVA);
        btnNueva.addActionListener(this);
        panelInternoBotones.add(btnNueva);

        btnOpcion1 = new JButton("Moneda Numerosa");
        btnOpcion1.setActionCommand(OPCION_1);
        btnOpcion1.addActionListener(this);
        panelInternoBotones.add(btnOpcion1);

        btnOpcion2 = new JButton("Valiosa?");
        btnOpcion2.setActionCommand(OPCION_2);
        btnOpcion2.addActionListener(this);
        panelInternoBotones.add(btnOpcion2);

        add(panelInternoBotones, BorderLayout.SOUTH);
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent pEvento) {
        String comando = pEvento.getActionCommand();

        switch (comando) {
            case NUEVA:
                principal.nuevaAlcancia();
                break;
            case ROMPER:
                principal.romperAlcancia();
                break;
            case OPCION_1:
                principal.reqFunc1();
                break;
            case OPCION_2:
                principal.reqFunc2();
                break;
            default:
                throw new IllegalArgumentException("Comando desconocido: " + comando);
        }
    }
}