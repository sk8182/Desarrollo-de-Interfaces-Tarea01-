package interfazGrafica;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * La clase VentanaFinal es un cuadro de diálogo utilizado para mostrar un mensaje en una ventana emergente.
 * Puede utilizarse para mostrar mensajes informativos o de confirmación.
 * 
 * @author julio
 */
public class VentanaFinal extends JDialog {

    /**
     * Constructor de la clase VentanaFinal.
     *
     * @param parent El componente principal o ventana padre de la ventana emergente.
     * @param modal Un indicador booleano que indica si la ventana emergente es modal o no.
     * @param mensaje El mensaje que se mostrará en la ventana emergente.
     */
    public VentanaFinal(java.awt.Frame parent, boolean modal, String mensaje) {
        super(parent, modal);

        // Configura un layout de flujo (FlowLayout) para centrar el mensaje
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Crea un JLabel con el mensaje
        JLabel label = new JLabel(mensaje);

        // Agrega el JLabel al diálogo
        add(label);

        // Configura el tamaño y la ubicación del diálogo
        setSize(300, 100);
        setLocationRelativeTo(parent); // Centra el diálogo en relación con el componente principal

        // Agrega un WindowListener para controlar el cierre del diálogo
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {                
                  dispose();   // Cierra el diálogo al hacer clic en el botón de cierre               
                }       
            
        });

    }
}
