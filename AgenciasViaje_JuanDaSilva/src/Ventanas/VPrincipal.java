
package Ventanas;

import Enum.EnumAgencias;
import agenciasturismo_juandasilva.Main;
import javax.swing.JOptionPane;


public class VPrincipal extends javax.swing.JFrame {

    public EnumAgencias agenciaSeleccionada;
    
    public VPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public VPrincipal(EnumAgencias agencia) {
        initComponents();
        setLocationRelativeTo(null);
        this.agenciaSeleccionada = agencia;
        if(agencia == EnumAgencias.el_caminante){
            eTitulo1.setText("El");
            eTitulo2.setText("Caminante");
        }else if(agencia == EnumAgencias.viajes_eroski){
            eTitulo1.setText("Viajes");
            eTitulo2.setText("Eroski");
        }else{
            eTitulo1.setText("Viajes");
            eTitulo2.setText("Araba");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eTitulo2 = new javax.swing.JLabel();
        eTitulo1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NuevaVisitaGuiada = new javax.swing.JMenuItem();
        ModificarVisitaGuiada = new javax.swing.JMenuItem();
        BajaDeVisitaGuiada = new javax.swing.JMenuItem();
        VerDatosVisitasGuiadas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        AltaEmpleado = new javax.swing.JMenuItem();
        ModificarEmpleado = new javax.swing.JMenuItem();
        BajaEmpleado = new javax.swing.JMenuItem();
        EmpleadoVisitas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AltaCliente = new javax.swing.JMenuItem();
        ModificarCliente = new javax.swing.JMenuItem();
        BajaCliente = new javax.swing.JMenuItem();
        VerVisitasGuiadasDelCliente = new javax.swing.JMenuItem();
        DatosAgencia = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        eTitulo2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        eTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTitulo2.setText("Araba");
        eTitulo2.setName(""); // NOI18N

        eTitulo1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        eTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTitulo1.setText("Viajes");
        eTitulo1.setMaximumSize(new java.awt.Dimension(45, 62));

        Salir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("Cerrar Sesión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Visitas Guiadas");

        NuevaVisitaGuiada.setText("Nueva visita guiada");
        NuevaVisitaGuiada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVisitaGuiadaActionPerformed(evt);
            }
        });
        jMenu1.add(NuevaVisitaGuiada);

        ModificarVisitaGuiada.setText("Modificar visita guiada");
        ModificarVisitaGuiada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarVisitaGuiadaActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarVisitaGuiada);

        BajaDeVisitaGuiada.setText("Baja de visita guiada");
        BajaDeVisitaGuiada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaDeVisitaGuiadaActionPerformed(evt);
            }
        });
        jMenu1.add(BajaDeVisitaGuiada);

        VerDatosVisitasGuiadas.setText("Ver datos visitas guiadas");
        VerDatosVisitasGuiadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosVisitasGuiadasActionPerformed(evt);
            }
        });
        jMenu1.add(VerDatosVisitasGuiadas);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Empleados");

        AltaEmpleado.setText("Alta de empleado");
        AltaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaEmpleadoActionPerformed(evt);
            }
        });
        jMenu5.add(AltaEmpleado);

        ModificarEmpleado.setText("Modificar empleado");
        jMenu5.add(ModificarEmpleado);

        BajaEmpleado.setText("Baja de empleado");
        jMenu5.add(BajaEmpleado);

        EmpleadoVisitas.setText("Visitas en responsabilidad");
        jMenu5.add(EmpleadoVisitas);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Clientes");

        AltaCliente.setText("Alta de cliente");
        AltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(AltaCliente);

        ModificarCliente.setText("Modificar cliente");
        ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(ModificarCliente);

        BajaCliente.setText("Baja de cliente");
        BajaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(BajaCliente);

        VerVisitasGuiadasDelCliente.setText("Ver visitas guiadas del cliente");
        VerVisitasGuiadasDelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerVisitasGuiadasDelClienteActionPerformed(evt);
            }
        });
        jMenu2.add(VerVisitasGuiadasDelCliente);

        jMenuBar1.add(jMenu2);

        DatosAgencia.setText("Agencia");

        jMenuItem3.setText("Datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        DatosAgencia.add(jMenuItem3);

        jMenuBar1.add(DatosAgencia);

        jMenu3.setText("Salir");

        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eTitulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eTitulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(eTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Main.cerrarPrograma();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Main.cerrarSesion();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BajaDeVisitaGuiadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaDeVisitaGuiadaActionPerformed
//        Main.entrarVerModificarEliminarCamp(1);
    }//GEN-LAST:event_BajaDeVisitaGuiadaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Main.cerrarPrograma();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Main.cerrarSesion();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void NuevaVisitaGuiadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVisitaGuiadaActionPerformed

    }//GEN-LAST:event_NuevaVisitaGuiadaActionPerformed

    private void ModificarVisitaGuiadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarVisitaGuiadaActionPerformed

    }//GEN-LAST:event_ModificarVisitaGuiadaActionPerformed

    private void VerDatosVisitasGuiadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosVisitasGuiadasActionPerformed

    }//GEN-LAST:event_VerDatosVisitasGuiadasActionPerformed

    private void ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarClienteActionPerformed

    }//GEN-LAST:event_ModificarClienteActionPerformed

    private void BajaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaClienteActionPerformed

    }//GEN-LAST:event_BajaClienteActionPerformed

    private void VerVisitasGuiadasDelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerVisitasGuiadasDelClienteActionPerformed

    }//GEN-LAST:event_VerVisitasGuiadasDelClienteActionPerformed

    private void AltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaClienteActionPerformed
        Main.abrirCrearCliente();
    }//GEN-LAST:event_AltaClienteActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Main.abrirVentanaDatosAgencia();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void AltaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaEmpleadoActionPerformed
        Main.abrirCrearEmpleado();
    }//GEN-LAST:event_AltaEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaCliente;
    private javax.swing.JMenuItem AltaEmpleado;
    private javax.swing.JMenuItem BajaCliente;
    private javax.swing.JMenuItem BajaDeVisitaGuiada;
    private javax.swing.JMenuItem BajaEmpleado;
    private javax.swing.JMenu DatosAgencia;
    private javax.swing.JMenuItem EmpleadoVisitas;
    private javax.swing.JMenuItem ModificarCliente;
    private javax.swing.JMenuItem ModificarEmpleado;
    private javax.swing.JMenuItem ModificarVisitaGuiada;
    private javax.swing.JMenuItem NuevaVisitaGuiada;
    private javax.swing.JButton Salir;
    private javax.swing.JMenuItem VerDatosVisitasGuiadas;
    private javax.swing.JMenuItem VerVisitasGuiadasDelCliente;
    private javax.swing.JLabel eTitulo1;
    private javax.swing.JLabel eTitulo2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

    public void NoCampamentos() {
        JOptionPane.showMessageDialog(this,"No hay campamentos","", JOptionPane.WARNING_MESSAGE);
    }
    
    public void NoPersonas() {
        JOptionPane.showMessageDialog(this,"No hay personas registradas","", JOptionPane.WARNING_MESSAGE);
    }
}
