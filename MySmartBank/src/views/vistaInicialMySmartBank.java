/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author josel
 */
public class vistaInicialMySmartBank extends javax.swing.JFrame {

    /**
     * Creates new form vistaInicialMySmartBank
     */
    public vistaInicialMySmartBank() {
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

        jPanel_Encabezado = new javax.swing.JPanel();
        jLabel_NombreAplicacion = new javax.swing.JLabel();
        jLabel_LogoBancoGrande = new javax.swing.JLabel();
        jButton_AccederApp = new javax.swing.JButton();
        jButton_SalirApp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Smart Bank App");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel_Encabezado.setBackground(new java.awt.Color(216, 216, 216));

        jLabel_NombreAplicacion.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel_NombreAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NombreAplicacion.setText("My Smart_Bank App");

        jLabel_LogoBancoGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_LogoBancoGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBanco(Grande).png"))); // NOI18N

        jButton_AccederApp.setBackground(new java.awt.Color(0, 204, 0));
        jButton_AccederApp.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton_AccederApp.setText("Acceder a la App");
        jButton_AccederApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AccederApp.setMaximumSize(new java.awt.Dimension(150, 30));
        jButton_AccederApp.setMinimumSize(new java.awt.Dimension(150, 30));
        jButton_AccederApp.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton_AccederApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederAppActionPerformed(evt);
            }
        });

        jButton_SalirApp.setBackground(new java.awt.Color(255, 0, 0));
        jButton_SalirApp.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jButton_SalirApp.setText("Salir de la App");
        jButton_SalirApp.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton_SalirApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_SalirApp.setMaximumSize(new java.awt.Dimension(150, 30));
        jButton_SalirApp.setMinimumSize(new java.awt.Dimension(150, 30));
        jButton_SalirApp.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton_SalirApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirAppActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Autor de la App");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_EncabezadoLayout = new javax.swing.GroupLayout(jPanel_Encabezado);
        jPanel_Encabezado.setLayout(jPanel_EncabezadoLayout);
        jPanel_EncabezadoLayout.setHorizontalGroup(
            jPanel_EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_NombreAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_EncabezadoLayout.createSequentialGroup()
                .addGroup(jPanel_EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_EncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_AccederApp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jButton_SalirApp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_EncabezadoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel_LogoBancoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_EncabezadoLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_EncabezadoLayout.setVerticalGroup(
            jPanel_EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EncabezadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel_NombreAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_LogoBancoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AccederApp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SalirApp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("This is my First App made by Jose Luis Lopez");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirAppActionPerformed
        // BOTON SALIRAPP
        this.dispose();
    }//GEN-LAST:event_jButton_SalirAppActionPerformed

    private void jButton_AccederAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederAppActionPerformed
        // BOTON ACCEDERAPP
        vistaAccesoProyecto vistaInicio = new vistaAccesoProyecto();
        vistaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_AccederAppActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON AUTORAPLICACION
        vistaAutorProyecto vistaAutor = new vistaAutorProyecto();
        vistaAutor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaInicialMySmartBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaInicialMySmartBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaInicialMySmartBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaInicialMySmartBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaInicialMySmartBank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_AccederApp;
    private javax.swing.JButton jButton_SalirApp;
    private javax.swing.JLabel jLabel_LogoBancoGrande;
    private javax.swing.JLabel jLabel_NombreAplicacion;
    private javax.swing.JPanel jPanel_Encabezado;
    // End of variables declaration//GEN-END:variables
}