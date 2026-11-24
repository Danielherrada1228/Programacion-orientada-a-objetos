/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hotel;

/**
 *
 * @author USUARIO
 */
public class VentanaSalida extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaSalida.class.getName());

    /**
     * Creates new form VentanaSalida
     */
    public VentanaSalida() {
        initComponents();
    }

    private Hotel hotel;
    private int numHab;
    private Habitacion habOcupada;

    public VentanaSalida(Hotel hotel, int numHab) {
        this.hotel = hotel;
        this.numHab = numHab;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNumHab.setText("Habitación: " + numHab);
        String fIngreso = hotel.buscarFechaIngresoHabitación(numHab);
        lblFechaIngreso.setText("Fecha de ingreso: " + fIngreso);

        for (int i = 0; i < hotel.listaHabitaciones.size(); i++) {
            Habitacion h = (Habitacion) hotel.listaHabitaciones.elementAt(i);
            if (h.getNúmeroHabitación() == numHab) {
                habOcupada = h;
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblNumHab = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnSalida = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salida de Huéspedes");

        lblNumHab.setText("Habitacion:");

        lblFechaIngreso.setText("Fecha de Ingreso:");

        jLabel3.setText("Fecha de salida (aaaa-mm-dd):");

        lblDias.setText("Cantidad de días:");

        txtFechaSalida.setColumns(12);

        lblTotal.setText("Total: $");

        btnSalida.setText("Registrar Salida");
        btnSalida.setEnabled(false);
        btnSalida.addActionListener(this::btnSalidaActionPerformed);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblFechaIngreso)
                            .addComponent(lblDias)
                            .addComponent(lblTotal)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSalida)
                                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblNumHab))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnCalcular)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNumHab)
                .addGap(18, 18, 18)
                .addComponent(lblFechaIngreso)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblDias)
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalida)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            String fechaSStr = txtFechaSalida.getText();
            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fechaSalida = formato.parse(fechaSStr);
            java.util.Date fechaIngreso = habOcupada.getHuésped().getFechaIngreso();

            if (fechaIngreso.compareTo(fechaSalida) < 0) {
                habOcupada.getHuésped().setFechaSalida(fechaSalida);
                int dias = habOcupada.getHuésped().obtenerDíasAlojamiento();
                double total = dias * habOcupada.getPrecioDía();

                lblDias.setText("Cantidad de días: " + dias);
                lblTotal.setText("Total: $" + String.format("%.2f", total));
                btnSalida.setEnabled(true); // Habilita el botón para liberar la habitación
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "La fecha de salida debe ser posterior a la fecha de ingreso", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Formato de fecha inválido (Use aaaa-mm-dd)", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
    habOcupada.setHuésped(null);
    habOcupada.setDisponible(true); // Libera la habitación
    javax.swing.JOptionPane.showMessageDialog(this, "Se ha registrado la salida del huésped correctamente", "Mensaje", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    this.dispose();
    }//GEN-LAST:event_btnSalidaActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new VentanaSalida().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblNumHab;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}
