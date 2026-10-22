package Figuras;

public class VentanaPiramide extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPiramide.class.getName());

    public VentanaPiramide() {
        initComponents();
        javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pirámide.png"));
        java.awt.Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        lblImagenPirámide.setIcon(new javax.swing.ImageIcon(imagenEscalada));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        apotema = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        volumen = new javax.swing.JLabel();
        campoBase = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        campoApotema = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        lblImagenPirámide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pirámide");

        radio.setText("Base (cms):");

        altura.setText("Altura (cms):");

        apotema.setText("Apotema (cms):");

        superficie.setText("Superficie (cm2) =");

        volumen.setText("Volumen (cm3) =");

        campoBase.addActionListener(this::campoBaseActionPerformed);

        campoApotema.addActionListener(this::campoApotemaActionPerformed);

        calcular.setText("Calcular");
        calcular.addActionListener(this::calcularActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(superficie, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apotema)
                            .addComponent(altura)
                            .addComponent(radio))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoBase)
                            .addComponent(campoAltura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoApotema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenPirámide)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio)
                    .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apotema)
                    .addComponent(campoApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcular)
                .addGap(17, 17, 17)
                .addComponent(volumen)
                .addGap(18, 18, 18)
                .addComponent(superficie)
                .addGap(18, 18, 18)
                .addComponent(lblImagenPirámide)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoApotemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApotemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApotemaActionPerformed

    private void campoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBaseActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double b = Double.parseDouble(campoBase.getText());
        double a = Double.parseDouble(campoAltura.getText());
        double ap = Double.parseDouble(campoApotema.getText());

        Piramide miPiramide = new Piramide(b, a, ap);

        volumen.setText("Volumen (cm3) = " + String.format("%.2f", miPiramide.getVolumen()));
        superficie.setText("Superficie (cm2) = " + String.format("%.2f", miPiramide.getSuperficie()));
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
        java.awt.EventQueue.invokeLater(() -> new VentanaPiramide().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altura;
    private javax.swing.JLabel apotema;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoApotema;
    private javax.swing.JTextField campoBase;
    private javax.swing.JLabel lblImagenPirámide;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}
