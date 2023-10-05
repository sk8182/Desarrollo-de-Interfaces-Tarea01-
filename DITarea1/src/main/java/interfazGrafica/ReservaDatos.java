package interfazGrafica;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Esta clase representa una ventana de confirmación de reserva.
 * Muestra los datos de la reserva ingresados por el usuario.
 * 
 * @author julio
 */
public class ReservaDatos extends javax.swing.JDialog {

    /**
     * Crea una nueva ventana de confirmación de reserva.
     *
     * @param parent El componente padre de esta ventana.
     * @param modal  Un indicador de si esta ventana debe ser modal o no.
     */
    public ReservaDatos(java.awt.Frame parent, boolean modal) {
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

        nombreCompleto = new javax.swing.JLabel();
        tituloNombreCompleto = new javax.swing.JLabel();
        tituloTelefono = new javax.swing.JLabel();
        tituloFecha = new javax.swing.JLabel();
        tituloTipoEvento = new javax.swing.JLabel();
        tituloAsistentes = new javax.swing.JLabel();
        tituloTipoCocina = new javax.swing.JLabel();
        tituloJornadas = new javax.swing.JLabel();
        tituloHabitaciones = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        tipoEvento = new javax.swing.JLabel();
        asistentes = new javax.swing.JLabel();
        tipoCocina = new javax.swing.JLabel();
        numJornadas = new javax.swing.JLabel();
        habitaciones = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();
        botonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nombreCompleto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tituloNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloNombreCompleto.setForeground(new java.awt.Color(0, 51, 255));
        tituloNombreCompleto.setText("Nombre y Apellidos:");
        tituloNombreCompleto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tituloTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloTelefono.setForeground(new java.awt.Color(0, 51, 255));
        tituloTelefono.setText("Teléfono:");
        tituloTelefono.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tituloFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloFecha.setForeground(new java.awt.Color(0, 51, 255));
        tituloFecha.setText("Fecha del evento:");
        tituloFecha.setToolTipText("");
        tituloFecha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tituloTipoEvento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloTipoEvento.setForeground(new java.awt.Color(0, 51, 255));
        tituloTipoEvento.setText("Tipo de evento:");
        tituloTipoEvento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tituloAsistentes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloAsistentes.setForeground(new java.awt.Color(0, 51, 255));
        tituloAsistentes.setText("Nº Asistentes:");

        tituloTipoCocina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloTipoCocina.setForeground(new java.awt.Color(0, 51, 255));
        tituloTipoCocina.setText("Tipo de cocina:");

        tituloJornadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloJornadas.setForeground(new java.awt.Color(0, 51, 255));
        tituloJornadas.setText("Nº Jornadas:");
        tituloJornadas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tituloHabitaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloHabitaciones.setForeground(new java.awt.Color(0, 51, 255));
        tituloHabitaciones.setText("Habitaciones:");
        tituloHabitaciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        telefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        fecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tipoEvento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        asistentes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tipoCocina.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        numJornadas.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        habitaciones.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        tituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloPrincipal.setText("Verifique que los datos de reserva sean correctos:");

        botonConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonConfirmar.setText("Confirmar");
        botonConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNombreCompleto)
                    .addComponent(tituloJornadas)
                    .addComponent(tituloTipoCocina)
                    .addComponent(tituloAsistentes)
                    .addComponent(tituloTipoEvento)
                    .addComponent(tituloFecha)
                    .addComponent(tituloTelefono)
                    .addComponent(tituloHabitaciones))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(numJornadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoCocina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asistentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloNombreCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloTelefono)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloFecha)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(tituloTipoEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(asistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloAsistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloTipoCocina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloJornadas)
                    .addComponent(numJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloHabitaciones)
                    .addComponent(habitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado cuando se hace clic en el botón "Confirmar".
     * Muestra una ventana de confirmación con un mensaje de éxito.
     *
     * @param evt El evento de acción que desencadenó este método.
     */
    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        
        String mensaje = "Su reserva se ha realizado con éxito";
        VentanaFinal ventanaFinal = new VentanaFinal(null, true, mensaje);
        
        // Agrega un WindowListener a VentanaFinal
        ventanaFinal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Cierra ReservaDatos cuando VentanaFinal se cierra
                dispose(); // Cierra ReservaDatos
            }
        });

        // Muestra la ventana VentanaFinal
        ventanaFinal.setVisible(true);

    }//GEN-LAST:event_botonConfirmarActionPerformed

    /**
     * Establece el nombre completo en la ventana de confirmación.
     *
     * @param nombreYapellidos El nombre completo a establecer.
     */
    public void setNombreCompleto(String nombreYapellidos) {
        this.nombreCompleto.setText(nombreYapellidos);
    }

    /**
     * Establece el teléfono en la ventana de confirmación.
     *
     * @param telefono El teléfono a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono.setText(telefono);
    }

    /**
     * Establece la fecha en la ventana de confirmación.
     *
     * @param fecha La fecha a establecer.
     */
    public void setFecha(String fecha) {
        this.fecha.setText(fecha);
    }

    /**
     * Establece el tipo de evento en la ventana de confirmación.
     *
     * @param evento El tipo de evento a establecer.
     */
    public void setEvento(String evento) {
        this.tipoEvento.setText(evento);
    }

    /**
     * Establece el número de asistentes en la ventana de confirmación.
     *
     * @param asistentes El número de asistentes a establecer.
     */
    public void setAsistentes(String asistentes) {
        this.asistentes.setText(asistentes);
    }

    /**
     * Establece el tipo de cocina en la ventana de confirmación.
     *
     * @param tipoCocina El tipo de cocina a establecer.
     */
    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina.setText(tipoCocina);
    }

    /**
     * Establece el número de jornadas en la ventana de confirmación si es un congreso.
     * Si no es un congreso, oculta esta información.
     *
     * @param numJornadas El número de jornadas a establecer.
     * @param esCongreso Un indicador de si es un congreso o no.
     */
    public void setNumJornadas(String numJornadas, boolean esCongreso) {

        if (esCongreso) {
            this.numJornadas.setText(numJornadas);
        } else {
            this.numJornadas.setVisible(false);
            this.tituloJornadas.setVisible(false);
        }

    }

    /**
     * Establece el número de habitaciones en la ventana de confirmación si es un congreso.
     * Si no es un congreso, oculta esta información.
     *
     * @param habitaciones El número de habitaciones a establecer.
     * @param esCongreso Un indicador de si es un congreso o no.
     */
    public void setHabitaciones(String habitaciones, boolean esCongreso) {
        if (esCongreso) {
            this.habitaciones.setText(habitaciones);
        } else {
            this.habitaciones.setVisible(false);
            this.tituloHabitaciones.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asistentes;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel habitaciones;
    private javax.swing.JLabel nombreCompleto;
    private javax.swing.JLabel numJornadas;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tipoCocina;
    private javax.swing.JLabel tipoEvento;
    private javax.swing.JLabel tituloAsistentes;
    private javax.swing.JLabel tituloFecha;
    private javax.swing.JLabel tituloHabitaciones;
    private javax.swing.JLabel tituloJornadas;
    private javax.swing.JLabel tituloNombreCompleto;
    private javax.swing.JLabel tituloPrincipal;
    private javax.swing.JLabel tituloTelefono;
    private javax.swing.JLabel tituloTipoCocina;
    private javax.swing.JLabel tituloTipoEvento;
    // End of variables declaration//GEN-END:variables

}
