package Figuras;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        esfera = new javax.swing.JButton();
        cilindro = new javax.swing.JButton();
        piramide = new javax.swing.JButton();
        cubo = new javax.swing.JButton();
        prisma = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figuras");

        esfera.setText("Esfera");
        esfera.addActionListener(this::esferaActionPerformed);

        cilindro.setText("Cilindro");
        cilindro.addActionListener(this::cilindroActionPerformed);

        piramide.setText("Pirámide");
        piramide.addActionListener(this::piramideActionPerformed);

        cubo.setText("Cubo");
        cubo.addActionListener(this::cuboActionPerformed);

        prisma.setText("Prisma");
        prisma.addActionListener(this::prismaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(cilindro)
                .addGap(18, 18, 18)
                .addComponent(esfera)
                .addGap(18, 18, 18)
                .addComponent(piramide)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cubo)
                .addGap(18, 18, 18)
                .addComponent(prisma)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cilindro)
                    .addComponent(esfera)
                    .addComponent(piramide))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cubo)
                    .addComponent(prisma))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void esferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaActionPerformed
        VentanaEsfera ventanaEsf = new VentanaEsfera();

        ventanaEsf.setVisible(true);
    }//GEN-LAST:event_esferaActionPerformed

    private void cilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroActionPerformed
        VentanaCilindro ventanaCil = new VentanaCilindro();

        ventanaCil.setVisible(true);
    }//GEN-LAST:event_cilindroActionPerformed

    private void piramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piramideActionPerformed
        VentanaPiramide ventanaPir = new VentanaPiramide();

        ventanaPir.setVisible(true);
    }//GEN-LAST:event_piramideActionPerformed

    private void cuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboActionPerformed
        VentanaCubo ventanaCub = new VentanaCubo();

        ventanaCub.setVisible(true);    }//GEN-LAST:event_cuboActionPerformed

    private void prismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prismaActionPerformed
        VentanaPrisma ventanaPri = new VentanaPrisma();

        ventanaPri.setVisible(true);    }//GEN-LAST:event_prismaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cilindro;
    private javax.swing.JButton cubo;
    private javax.swing.JButton esfera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton piramide;
    private javax.swing.JButton prisma;
    // End of variables declaration//GEN-END:variables
}
