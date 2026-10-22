package Figuras;

public class VentanaEsfera extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaEsfera.class.getName());

    public VentanaEsfera() {
        initComponents();
        javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(getClass().getResource("/imagenes/Esfera.png"));
    java.awt.Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    lblImagenEsfera.setIcon(new javax.swing.ImageIcon(imagenEscalada));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        lblImagenEsfera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esfera");

        radio.setText("Radio (cms):");

        campoRadio.addActionListener(this::campoRadioActionPerformed);

        calcular.setText("Calcular");
        calcular.addActionListener(this::calcularActionPerformed);

        volumen.setText("Volumen (cm3) =");

        superficie.setText("Superficie (cm3) =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volumen)
                            .addComponent(radio)
                            .addComponent(superficie))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImagenEsfera)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcular)
                .addGap(18, 18, 18)
                .addComponent(volumen)
                .addGap(35, 35, 35)
                .addComponent(superficie)
                .addGap(31, 31, 31)
                .addComponent(lblImagenEsfera)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRadioActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double r = Double.parseDouble(campoRadio.getText());

        Esfera miEsfera = new Esfera(r);

        volumen.setText("Volumen (cm3) = " + String.format("%.2f", miEsfera.getVolumen()));
        superficie.setText("Superficie (cm2) = " + String.format("%.2f", miEsfera.getSuperficie()));
    }//GEN-LAST:event_calcularActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new VentanaEsfera().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel lblImagenEsfera;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}
