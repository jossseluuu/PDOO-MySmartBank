/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author josel
 */
public class vistaAccesoProyecto extends javax.swing.JFrame {

    /**
     * Creates new form vistaAccesoProyecto
     */
    public vistaAccesoProyecto() {
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

        jPanel_PanelGeneral = new javax.swing.JPanel();
        jLabel_NombreApp = new javax.swing.JLabel();
        jLabel_IndicadorTexto1 = new javax.swing.JLabel();
        jButton_Cliente = new javax.swing.JButton();
        jButton_Tarjeta = new javax.swing.JButton();
        jButton_Cuenta = new javax.swing.JButton();
        jLabel_IndicadorTexto2 = new javax.swing.JLabel();
        jPanel_PanelOpcionesAdicionales = new javax.swing.JPanel();
        jButton_CrearCliente = new javax.swing.JButton();
        jButton_BorrarCliente = new javax.swing.JButton();
        jButton_EditarCliente = new javax.swing.JButton();
        jButton_MostrarCliente = new javax.swing.JButton();
        jButton_CrearCuenta = new javax.swing.JButton();
        jButton_BorrarCuenta = new javax.swing.JButton();
        jButton_EditarCuenta = new javax.swing.JButton();
        jButton_MostrarCuenta = new javax.swing.JButton();
        jButton_MostrarTarjeta = new javax.swing.JButton();
        jButton_BorrarTarjeta = new javax.swing.JButton();
        jButton_EditarTarjeta = new javax.swing.JButton();
        jButton_CrearTarjeta = new javax.swing.JButton();
        jButton_Home = new javax.swing.JButton();
        jButton_Informacion = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jLabel_Separador1 = new javax.swing.JLabel();
        jLabel_Separador2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel_PanelGeneral.setBackground(new java.awt.Color(204, 255, 204));
        jPanel_PanelGeneral.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel_PanelGeneral.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel_PanelGeneral.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel_NombreApp.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel_NombreApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NombreApp.setText("My Smart Bank App");

        jLabel_IndicadorTexto1.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jLabel_IndicadorTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IndicadorTexto1.setText("Indique el Tipo de Operacion que desea Realizar: ");

        jButton_Cliente.setBackground(new java.awt.Color(0, 204, 0));
        jButton_Cliente.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton_Cliente.setLabel("Cliente");
        jButton_Cliente.setMaximumSize(new java.awt.Dimension(35, 180));
        jButton_Cliente.setMinimumSize(new java.awt.Dimension(35, 180));
        jButton_Cliente.setPreferredSize(new java.awt.Dimension(75, 180));
        jButton_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClienteActionPerformed(evt);
            }
        });

        jButton_Tarjeta.setBackground(new java.awt.Color(0, 204, 0));
        jButton_Tarjeta.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton_Tarjeta.setText("Tarjeta");
        jButton_Tarjeta.setMaximumSize(new java.awt.Dimension(35, 180));
        jButton_Tarjeta.setMinimumSize(new java.awt.Dimension(35, 180));
        jButton_Tarjeta.setPreferredSize(new java.awt.Dimension(75, 180));
        jButton_Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TarjetaActionPerformed(evt);
            }
        });

        jButton_Cuenta.setBackground(new java.awt.Color(0, 204, 0));
        jButton_Cuenta.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton_Cuenta.setText("Cuenta");
        jButton_Cuenta.setMaximumSize(new java.awt.Dimension(35, 180));
        jButton_Cuenta.setMinimumSize(new java.awt.Dimension(35, 180));
        jButton_Cuenta.setPreferredSize(new java.awt.Dimension(75, 180));
        jButton_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CuentaActionPerformed(evt);
            }
        });

        jLabel_IndicadorTexto2.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jLabel_IndicadorTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_IndicadorTexto2.setText("Otras Operaciones Adicionales:");

        jPanel_PanelOpcionesAdicionales.setOpaque(false);

        jButton_CrearCliente.setBackground(new java.awt.Color(51, 255, 204));
        jButton_CrearCliente.setText("Crear Cliente");
        jButton_CrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CrearClienteActionPerformed(evt);
            }
        });

        jButton_BorrarCliente.setBackground(new java.awt.Color(51, 255, 204));
        jButton_BorrarCliente.setText("Borrar Cliente");
        jButton_BorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarClienteActionPerformed(evt);
            }
        });

        jButton_EditarCliente.setBackground(new java.awt.Color(51, 255, 204));
        jButton_EditarCliente.setText("Editar Cliente");
        jButton_EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarClienteActionPerformed(evt);
            }
        });

        jButton_MostrarCliente.setBackground(new java.awt.Color(51, 255, 204));
        jButton_MostrarCliente.setText("Mostrar Cliente");
        jButton_MostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarClienteActionPerformed(evt);
            }
        });

        jButton_CrearCuenta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_CrearCuenta.setText("Crear Cuenta");
        jButton_CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CrearCuentaActionPerformed(evt);
            }
        });

        jButton_BorrarCuenta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_BorrarCuenta.setText("Borrar Cuenta");
        jButton_BorrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarCuentaActionPerformed(evt);
            }
        });

        jButton_EditarCuenta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_EditarCuenta.setText("Editar Cuenta");
        jButton_EditarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarCuentaActionPerformed(evt);
            }
        });

        jButton_MostrarCuenta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_MostrarCuenta.setText("Mostrar Cuenta");
        jButton_MostrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarCuentaActionPerformed(evt);
            }
        });

        jButton_MostrarTarjeta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_MostrarTarjeta.setText("Mostrar Tarjeta");
        jButton_MostrarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarTarjetaActionPerformed(evt);
            }
        });

        jButton_BorrarTarjeta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_BorrarTarjeta.setText("Borrar Tarjeta");
        jButton_BorrarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarTarjetaActionPerformed(evt);
            }
        });

        jButton_EditarTarjeta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_EditarTarjeta.setText("Editar Tarjeta");
        jButton_EditarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditarTarjetaActionPerformed(evt);
            }
        });

        jButton_CrearTarjeta.setBackground(new java.awt.Color(51, 255, 204));
        jButton_CrearTarjeta.setText("Crear Tarjeta");
        jButton_CrearTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CrearTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PanelOpcionesAdicionalesLayout = new javax.swing.GroupLayout(jPanel_PanelOpcionesAdicionales);
        jPanel_PanelOpcionesAdicionales.setLayout(jPanel_PanelOpcionesAdicionalesLayout);
        jPanel_PanelOpcionesAdicionalesLayout.setHorizontalGroup(
            jPanel_PanelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createSequentialGroup()
                        .addComponent(jButton_CrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_BorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MostrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createSequentialGroup()
                        .addComponent(jButton_CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_BorrarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_EditarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MostrarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createSequentialGroup()
                        .addComponent(jButton_CrearTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_BorrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_EditarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MostrarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_PanelOpcionesAdicionalesLayout.setVerticalGroup(
            jPanel_PanelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CrearCliente)
                    .addComponent(jButton_BorrarCliente)
                    .addComponent(jButton_EditarCliente)
                    .addComponent(jButton_MostrarCliente))
                .addGap(26, 26, 26)
                .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CrearCuenta)
                    .addComponent(jButton_BorrarCuenta)
                    .addComponent(jButton_EditarCuenta)
                    .addComponent(jButton_MostrarCuenta))
                .addGap(29, 29, 29)
                .addGroup(jPanel_PanelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CrearTarjeta)
                    .addComponent(jButton_BorrarTarjeta)
                    .addComponent(jButton_EditarTarjeta)
                    .addComponent(jButton_MostrarTarjeta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hogar_30px.png"))); // NOI18N
        jButton_Home.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton_Home.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton_Home.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HomeActionPerformed(evt);
            }
        });

        jButton_Informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info_icon_30px.png"))); // NOI18N
        jButton_Informacion.setMaximumSize(new java.awt.Dimension(35, 40));
        jButton_Informacion.setMinimumSize(new java.awt.Dimension(35, 40));
        jButton_Informacion.setPreferredSize(new java.awt.Dimension(35, 40));

        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz_30px.png"))); // NOI18N
        jButton_Salir.setMaximumSize(new java.awt.Dimension(30, 30));
        jButton_Salir.setMinimumSize(new java.awt.Dimension(30, 30));
        jButton_Salir.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jLabel_Separador1.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jLabel_Separador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Separador1.setText("------------------------------------------------------------------");

        jLabel_Separador2.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jLabel_Separador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Separador2.setText("------------------------------------------------------------------");

        javax.swing.GroupLayout jPanel_PanelGeneralLayout = new javax.swing.GroupLayout(jPanel_PanelGeneral);
        jPanel_PanelGeneral.setLayout(jPanel_PanelGeneralLayout);
        jPanel_PanelGeneralLayout.setHorizontalGroup(
            jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_NombreApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_PanelOpcionesAdicionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel_Separador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel_IndicadorTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PanelGeneralLayout.createSequentialGroup()
                        .addComponent(jButton_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jButton_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PanelGeneralLayout.createSequentialGroup()
                        .addGroup(jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_IndicadorTexto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Separador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel_PanelGeneralLayout.setVerticalGroup(
            jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PanelGeneralLayout.createSequentialGroup()
                .addComponent(jLabel_NombreApp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel_Separador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_IndicadorTexto1)
                .addGap(18, 18, 18)
                .addGroup(jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_IndicadorTexto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_PanelOpcionesAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Separador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel_PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Informacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_PanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_PanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ClienteActionPerformed

    private void jButton_TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_TarjetaActionPerformed

    private void jButton_CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CuentaActionPerformed

    private void jButton_CrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CrearClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CrearClienteActionPerformed

    private void jButton_BorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BorrarClienteActionPerformed

    private void jButton_EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EditarClienteActionPerformed

    private void jButton_MostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_MostrarClienteActionPerformed

    private void jButton_CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CrearCuentaActionPerformed

    private void jButton_BorrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BorrarCuentaActionPerformed

    private void jButton_EditarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EditarCuentaActionPerformed

    private void jButton_MostrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_MostrarCuentaActionPerformed

    private void jButton_MostrarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_MostrarTarjetaActionPerformed

    private void jButton_BorrarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BorrarTarjetaActionPerformed

    private void jButton_EditarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditarTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_EditarTarjetaActionPerformed

    private void jButton_CrearTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CrearTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CrearTarjetaActionPerformed

    private void jButton_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HomeActionPerformed
        // TODO add your handling code here:
        new vistaInicialMySmartBank().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_HomeActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // BOTON SALIR
        this.dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(vistaAccesoProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaAccesoProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaAccesoProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaAccesoProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAccesoProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BorrarCliente;
    private javax.swing.JButton jButton_BorrarCuenta;
    private javax.swing.JButton jButton_BorrarTarjeta;
    private javax.swing.JButton jButton_Cliente;
    private javax.swing.JButton jButton_CrearCliente;
    private javax.swing.JButton jButton_CrearCuenta;
    private javax.swing.JButton jButton_CrearTarjeta;
    private javax.swing.JButton jButton_Cuenta;
    private javax.swing.JButton jButton_EditarCliente;
    private javax.swing.JButton jButton_EditarCuenta;
    private javax.swing.JButton jButton_EditarTarjeta;
    private javax.swing.JButton jButton_Home;
    private javax.swing.JButton jButton_Informacion;
    private javax.swing.JButton jButton_MostrarCliente;
    private javax.swing.JButton jButton_MostrarCuenta;
    private javax.swing.JButton jButton_MostrarTarjeta;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_Tarjeta;
    private javax.swing.JLabel jLabel_IndicadorTexto1;
    private javax.swing.JLabel jLabel_IndicadorTexto2;
    private javax.swing.JLabel jLabel_NombreApp;
    private javax.swing.JLabel jLabel_Separador1;
    private javax.swing.JLabel jLabel_Separador2;
    private javax.swing.JPanel jPanel_PanelGeneral;
    private javax.swing.JPanel jPanel_PanelOpcionesAdicionales;
    // End of variables declaration//GEN-END:variables
}
