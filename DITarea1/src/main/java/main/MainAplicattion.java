package main;

import interfazGrafica.VentanaPrincipal;
import javax.swing.SwingUtilities;

/**
 * Clase principal que inicia la aplicación.
 * 
 * @author julio
 */
public class MainAplicattion {

    
    /**
     * Punto de entrada principal de la aplicación.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal principal = new VentanaPrincipal();
            principal.setVisible(true);
        });
    }
}
