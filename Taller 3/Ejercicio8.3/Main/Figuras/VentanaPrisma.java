package Figuras;

public class VentanaPrisma extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrisma.class.getName());

    public VentanaPrisma() {
        initComponents();

        javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(getClass().getResource("/imagenes/Prisma.png"));
        java.awt.Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        lblImagenPrisma.setIcon(new javax.swing.ImageIcon(imagenEscalada));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        profundidad = new javax.swing.JLabel();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        campoBase = new javax.swing.JTextField();
        campoProfundidad = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        lblImagenPrisma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prisma");

        base.setText("Base (cms):");

        altura.setText("Altura (cms):");

        profundidad.setText("Profundidad (cms):");

        volumen.setText("Volumen (cm3) =");

        superficie.setText("Superficie (cm2) =");

        calcular.setText("Calcular");
        calcular.addActionListener(this::calcularActionPerformed);

        campoProfundidad.addActionListener(this::campoProfundidadActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(superficie)
                    .addComponent(volumen)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altura)
                            .addComponent(profundidad)
                            .addComponent(base))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoProfundidad)
                                .addComponent(campoAltura)
                                .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(calcular))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenPrisma)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(base)
                    .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profundidad)
                    .addComponent(campoProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcular)
                .addGap(31, 31, 31)
                .addComponent(volumen)
                .addGap(18, 18, 18)
                .addComponent(superficie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(lblImagenPrisma)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProfundidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProfundidadActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double base = Double.parseDouble(campoBase.getText());
        double altura = Double.parseDouble(campoAltura.getText());
        double profundidad = Double.parseDouble(campoProfundidad.getText());

        Prisma miPrisma = new Prisma(base, altura, profundidad);

        volumen.setText("Volumen = " + String.format("%.2f", miPrisma.getVolumen()));
        superficie.setText("Superficie = " + String.format("%.2f", miPrisma.getSuperficie()));
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
        java.awt.EventQueue.invokeLater(() -> new VentanaPrisma().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altura;
    private javax.swing.JLabel base;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoBase;
    private javax.swing.JTextField campoProfundidad;
    private javax.swing.JLabel lblImagenPrisma;
    private javax.swing.JLabel profundidad;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}
