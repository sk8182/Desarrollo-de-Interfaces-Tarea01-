package interfazGrafica;

/**
 * La clase CerrarVentana es un cuadro de diálogo utilizado para preguntar al usuario si desea cerrar una ventana.
 * Ofrece dos opciones: "Cerrar" y "Cancelar".
 * 
 * @author julio
 */
public class CerrarVentana extends javax.swing.JDialog {

    /**
     * Constructor de la clase CerrarVentana.
     *
     * @param parent El componente principal o ventana padre de la ventana emergente.
     * @param modal Un indicador booleano que indica si la ventana emergente es modal o no.
     */
    public CerrarVentana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cerrarLabel = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        cancelarBoton = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        cerrarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarLabel.setText("¿Desea cerrar la ventana?");
        cerrarLabel.setToolTipText("");
        cerrarLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botonCerrar.setBackground(new java.awt.Color(204, 204, 204));
        botonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCerrar.setText("Cerrar");
        botonCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        cancelarBoton.setBackground(new java.awt.Color(204, 204, 204));
        cancelarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBoton.setText("Cancelar");
        cancelarBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        imagenLabel.setIcon(new javax.swing.ImageIcon("D:\\DAM\\segundo curso\\DESARROLLO INTERFACES\\Unidad1\\DI Tarea1\\ReservaDialog\\src\\main\\java\\imagenes\\iconoCuidado.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(imagenLabel)
                .addGap(27, 27, 27)
                .addComponent(cerrarLabel)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(cerrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Este método se llama cuando se hace clic en el botón "Cerrar". Cierra la aplicación al salir con un código de estado 0.
    *
    * @param evt El evento de acción que desencadenó este método.
    */
    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    /**
    * Este método se llama cuando se hace clic en el botón "Cancelar". Oculta la ventana actual sin cerrar la aplicación.
    *
    * @param evt El evento de acción que desencadenó este método.
    */
    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_cancelarBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel cerrarLabel;
    private javax.swing.JLabel imagenLabel;
    // End of variables declaration//GEN-END:variables
}
