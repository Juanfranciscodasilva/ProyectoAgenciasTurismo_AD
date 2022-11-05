package Ventanas;

import Enum.EnumAgencias;
import agenciasturismo_juandasilva.Main;

public class VSeleccionAgencia extends javax.swing.JFrame {

    public VSeleccionAgencia() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btElCaminante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btViajesEroski = new javax.swing.JButton();
        btViajesAraba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btElCaminante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btElCaminante.setText("El Caminante");
        btElCaminante.setMaximumSize(new java.awt.Dimension(103, 45));
        btElCaminante.setMinimumSize(new java.awt.Dimension(103, 45));
        btElCaminante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btElCaminanteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selecciona la Agencia");
        jLabel3.setToolTipText("");

        btViajesEroski.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btViajesEroski.setText("Viajes Eroski");
        btViajesEroski.setMaximumSize(new java.awt.Dimension(103, 45));
        btViajesEroski.setMinimumSize(new java.awt.Dimension(103, 45));
        btViajesEroski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViajesEroskiActionPerformed(evt);
            }
        });

        btViajesAraba.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btViajesAraba.setText("Viajes Araba");
        btViajesAraba.setMaximumSize(new java.awt.Dimension(103, 45));
        btViajesAraba.setMinimumSize(new java.awt.Dimension(103, 45));
        btViajesAraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViajesArabaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btElCaminante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btViajesEroski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btViajesAraba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btElCaminante, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btViajesEroski, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btViajesAraba, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btElCaminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btElCaminanteActionPerformed
        Main.SeleccionarAgencia(EnumAgencias.el_caminante);
    }//GEN-LAST:event_btElCaminanteActionPerformed

    private void btViajesEroskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViajesEroskiActionPerformed
        Main.SeleccionarAgencia(EnumAgencias.viajes_eroski);
    }//GEN-LAST:event_btViajesEroskiActionPerformed

    private void btViajesArabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViajesArabaActionPerformed
        Main.SeleccionarAgencia(EnumAgencias.viajes_araba);
    }//GEN-LAST:event_btViajesArabaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VSeleccionAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSeleccionAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSeleccionAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSeleccionAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSeleccionAgencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btElCaminante;
    private javax.swing.JButton btViajesAraba;
    private javax.swing.JButton btViajesEroski;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
