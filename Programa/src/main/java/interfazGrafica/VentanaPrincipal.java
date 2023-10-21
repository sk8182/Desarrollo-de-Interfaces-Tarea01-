package interfazGrafica;

/**
 * La clase VentanaPrincipal representa la ventana principal de la aplicación de
 * gestión hotelera. Esta ventana contiene un botón para abrir el formulario de
 * reserva y muestra una imagen y texto de bienvenida.
 *
 * @author julio
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de la ventana principal.
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * Este método se llama desde el constructor para inicializar la interfaz
     * gráfica de la ventana. No se recomienda modificar este código, ya que el
     * contenido de la ventana se regenera automáticamente por el editor visual.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAbrirReserva = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imagenLabel = new javax.swing.JLabel();
        textoLabel = new javax.swing.JLabel();
        textoLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAbrir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tarea 1 DI");
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        botonAbrirReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonAbrirReserva.setText("Empezar");
        botonAbrirReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        botonAbrirReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirReservaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        imagenLabel.setIcon(new javax.swing.ImageIcon("D:\\DAM\\segundo curso\\DESARROLLO INTERFACES\\Unidad1\\Programa\\src\\main\\java\\imagenes\\icono.png")); // NOI18N

        textoLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        textoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoLabel.setText("Interfaz de gestión");

        textoLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        textoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoLabel2.setText("hotelera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(textoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(textoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(textoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        menuAbrir.setText("Menú");
        menuAbrir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Empezar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAbrir.add(jMenuItem1);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuAbrir.add(menuSalir);

        jMenuBar1.add(menuAbrir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(botonAbrirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAbrirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic en el botón "Empezar", abre el formulario de
     * reserva.
     * 
     * @param evt El evento de acción que desencadenó este método.
     */
    private void botonAbrirReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirReservaActionPerformed
        
        abrirReservaDialog();
    }//GEN-LAST:event_botonAbrirReservaActionPerformed

    /**
     * Maneja el evento de cierre de la ventana principal, muestra un cuadro
     * de diálogo de confirmación antes de cerrar la aplicación.
     * 
     * @param evt El evento de ventana que desencadenó este método.
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        cerrarVentana();
    }//GEN-LAST:event_formWindowClosing

    /**
     * Maneja el evento de clic en el elemento de menú "Empezar", abre el
     * formulario de reserva.
     * 
     * @param evt El evento de acción que desencadenó este método.
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        abrirReservaDialog();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * Maneja el evento de clic en el elemento de menú "Salir", muestra un
     * cuadro de diálogo de confirmación antes de cerrar la aplicación.
     * 
     * @param evt El evento de acción que desencadenó este método.
     */
    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        
        cerrarVentana();
    }//GEN-LAST:event_menuSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbrirReserva;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAbrir;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JLabel textoLabel;
    private javax.swing.JLabel textoLabel2;
    // End of variables declaration//GEN-END:variables
    
     /**
     * Abre el formulario de reserva como un cuadro de diálogo modal.
     */
    private void abrirReservaDialog() {
        ReservaFormulario dialog = new ReservaFormulario(this, true);
        dialog.setVisible(true);
    }
    
     /**
     * Muestra un cuadro de diálogo de confirmación antes de cerrar la ventana
     * principal.
     */
    private void cerrarVentana() {
        CerrarVentana cerrar = new CerrarVentana(this, true);
        cerrar.setVisible(true);
    }

}
