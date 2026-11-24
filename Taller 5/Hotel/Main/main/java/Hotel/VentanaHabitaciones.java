/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hotel;

/**
 *
 * @author USUARIO
 */
public class VentanaHabitaciones extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaHabitaciones.class.getName());

    public VentanaHabitaciones() {
        initComponents();
    }

    private Hotel hotel;

    public VentanaHabitaciones(Hotel hotel) {
        this.hotel = hotel;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Importante: Cierra solo esta ventana
        actualizarEstados();
    }

    private void actualizarEstados() {
        javax.swing.JLabel[] etiquetas = {lblHab1, lblHab2, lblHab3, lblHab4, lblHab5, lblHab6, lblHab7, lblHab8, lblHab9, lblHab10};
        for (int i = 0; i < 10; i++) {
            Habitacion hab = (Habitacion) hotel.listaHabitaciones.elementAt(i);
            if (!hab.getDisponible()) {
                etiquetas[i].setText("No disponible");
            } else {
                etiquetas[i].setText("Disponible");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblHab1 = new javax.swing.JLabel();
        lblHab2 = new javax.swing.JLabel();
        lblHab6 = new javax.swing.JLabel();
        lblHab3 = new javax.swing.JLabel();
        lblHab4 = new javax.swing.JLabel();
        lblHab5 = new javax.swing.JLabel();
        lblHab7 = new javax.swing.JLabel();
        lblHab8 = new javax.swing.JLabel();
        lblHab10 = new javax.swing.JLabel();
        lblHab9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        spinnerReserva = new javax.swing.JSpinner();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Habitación 1");

        jLabel2.setText("Habitación 2");

        jLabel3.setText("Habitación 3");

        jLabel4.setText("Habitación 4");

        jLabel5.setText("Habitación5");

        jLabel6.setText("Habitación 6");

        jLabel7.setText("Habitación 7");

        jLabel8.setText("Habitación 8");

        jLabel9.setText("Habitación 9");

        jLabel10.setText("Habitación 10");

        lblHab7.setText("jLabel1");

        lblHab8.setText("jLabel1");

        lblHab10.setText("jLabel1");

        lblHab9.setText("jLabel1");

        jLabel21.setText("Habitación a reservar:");

        spinnerReserva.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(this::btnAceptarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(lblHab6))
                    .addComponent(jLabel1)
                    .addComponent(lblHab1))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHab2)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHab7)
                        .addComponent(jLabel7)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblHab8)
                    .addComponent(jLabel3)
                    .addComponent(lblHab3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHab4)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(lblHab9))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHab5)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(lblHab10))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(33, 33, 33)
                        .addComponent(spinnerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnAceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHab1)
                    .addComponent(lblHab2)
                    .addComponent(lblHab3)
                    .addComponent(lblHab4)
                    .addComponent(lblHab5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHab6)
                    .addComponent(lblHab7)
                    .addComponent(lblHab8)
                    .addComponent(lblHab9)
                    .addComponent(lblHab10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(spinnerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int numHab = (int) spinnerReserva.getValue();
        if (!hotel.buscarHabitaciónOcupada(numHab)) {
            VentanaIngreso vIngreso = new VentanaIngreso(hotel, numHab);
            vIngreso.setVisible(true);
            this.dispose(); // Cierra esta ventana al abrir el registro
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "La habitación seleccionada ya está ocupada", "Mensaje", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaHabitaciones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblHab1;
    private javax.swing.JLabel lblHab10;
    private javax.swing.JLabel lblHab2;
    private javax.swing.JLabel lblHab3;
    private javax.swing.JLabel lblHab4;
    private javax.swing.JLabel lblHab5;
    private javax.swing.JLabel lblHab6;
    private javax.swing.JLabel lblHab7;
    private javax.swing.JLabel lblHab8;
    private javax.swing.JLabel lblHab9;
    private javax.swing.JSpinner spinnerReserva;
    // End of variables declaration//GEN-END:variables
}
