package Ventanas;

import Clases.Empleado;
import Clases.Response;
import agenciasturismo_juandasilva.Main;
import java.util.Date;
import javax.swing.JOptionPane;

public class VCrearVisitaGuiada extends javax.swing.JFrame {
    
    private final String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";   
    
    public VCrearVisitaGuiada() {
        initComponents();
        setLocationRelativeTo(null);
        NoNombre.setVisible(false);
        NoTematica.setVisible(false);
        NoClientesMaximos.setVisible(false);
        NoNacimiento.setVisible(false);
        NoContratacion.setVisible(false);
        NoNacionalidad.setVisible(false);
        NoCargo.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        tTitulo = new javax.swing.JLabel();
        AceptarModificar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tTematica = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        NoTematica = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tClientesMaximos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NoClientesMaximos = new javax.swing.JLabel();
        NoNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tPrecio = new javax.swing.JTextField();
        NoPrecio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NoNacionalidad = new javax.swing.JLabel();
        tCargo = new javax.swing.JTextField();
        NoCargo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tNacionalidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tNacimiento = new com.toedter.calendar.JDateChooser();
        NoNacimiento = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTitulo.setText("Crear Empleado");

        AceptarModificar.setText("Aceptar y crear");
        AceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarModificarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel123.setText("Temática:");

        NoTematica.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoTematica.setForeground(new java.awt.Color(255, 0, 0));
        NoTematica.setText("*Temática no válida");

        jLabel6.setText("Clientes máximos:");

        jLabel2.setText("Nombre:");

        NoClientesMaximos.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoClientesMaximos.setForeground(new java.awt.Color(255, 0, 0));
        NoClientesMaximos.setText("*Número de clientes máximo no válido");

        NoNombre.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNombre.setForeground(new java.awt.Color(255, 0, 0));
        NoNombre.setText("*Nombre no válido");

        jLabel8.setText("Precio:");

        NoPrecio.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoPrecio.setForeground(new java.awt.Color(255, 0, 0));
        NoPrecio.setText("*Precio no válido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoClientesMaximos)
                            .addComponent(tClientesMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoPrecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel123)
                            .addComponent(jLabel2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NoTematica)
                                .addComponent(tTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoNombre, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoTematica)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tClientesMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoClientesMaximos)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoPrecio)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lugar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        NoNacionalidad.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNacionalidad.setForeground(new java.awt.Color(255, 0, 0));
        NoNacionalidad.setText("*Nacionalidad no válida");

        NoCargo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoCargo.setForeground(new java.awt.Color(255, 0, 0));
        NoCargo.setText("*Cargo no válido");

        jLabel10.setText("Cargo:");

        jLabel9.setText("Nacionalidad:");

        jLabel7.setText("Nacimiento:");

        NoNacimiento.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNacimiento.setForeground(new java.awt.Color(255, 0, 0));
        NoNacimiento.setText("*Fecha no válida (dd/mm/aaaa)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoNacionalidad)
                            .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoCargo)
                            .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoNacimiento)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNacionalidad)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNacimiento)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(AceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Main.cerrarCrearEmpleado();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void AceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarModificarActionPerformed
        if(validarDatos()){
            String dni = tNombre.getText();
            String nombre = tTematica.getText();
            String apellido1 = tClientesMaximos.getText();
            Date nacimiento = tNacimiento.getDate();
            Date contratacion = tContratacion.getDate();
            String nacionalidad = tNacionalidad.getText();
            String cargo = tCargo.getText();
            
            Empleado e = new Empleado();
            e.setDni(dni.toUpperCase());
            e.setNombre(nombre);
            e.setApellido1(apellido1);
            e.setFechaNacimiento(nacimiento);
            e.setFechaContratacion(contratacion);
            e.setNacionalidad(nacionalidad);
            e.setCargo(cargo);
            
            Response respuesta = null;
            respuesta = Main.insertarEmpleado(e);
            if(respuesta != null){
                if(respuesta.isCorrecto()){
                    JOptionPane.showMessageDialog(null, "Se ha insertado al empleado correctamente.");
                    Main.cerrarCrearEmpleado();
                }else{
                    JOptionPane.showMessageDialog(null,respuesta.getMensajeError(),"", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error insesperado. Vuelve a intentarlo.","", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_AceptarModificarActionPerformed

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
            java.util.logging.Logger.getLogger(VCrearVisitaGuiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearVisitaGuiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearVisitaGuiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearVisitaGuiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VCrearVisitaGuiada().setVisible(true);
            }
        });
    }
    
    public boolean validarDatos(){
        NoNombre.setVisible(false);
        NoTematica.setVisible(false);
        NoClientesMaximos.setVisible(false);
        NoNacimiento.setVisible(false);
        NoContratacion.setVisible(false);
        NoNacionalidad.setVisible(false);
        NoCargo.setVisible(false);
        boolean valido = true;
        String dni = tNombre.getText();
        String nombre = tTematica.getText();
        String apellido1 = tClientesMaximos.getText();
        Date nacimiento = tNacimiento.getDate();
        Date contratacion = tContratacion.getDate();
        String nacionalidad = tNacionalidad.getText();
        String cargo = tCargo.getText();
        if(dni == null || dni.isBlank()){
            NoNombre.setText("*El DNI es obligatorio.");
            NoNombre.setVisible(true);
            valido = false;
        }else if(!validarDNI(dni)){
            NoNombre.setText("*El DNI no es correcto.");
            NoNombre.setVisible(true);
            valido = false;
        }
        if(nombre == null || nombre.isBlank()){
            NoTematica.setText("*El nombre es obligatorio.");
            NoTematica.setVisible(true);
            valido = false;
        }
        if(apellido1 == null || apellido1.isBlank()){
            NoClientesMaximos.setText("*Los apellidos son obligatorios.");
            NoClientesMaximos.setVisible(true);
            valido = false;
        }
        if(nacimiento == null){
            NoNacimiento.setText("*La fecha de nacimiento es obligatoria.");
            NoNacimiento.setVisible(true);
            valido = false;
        }else if(nacimiento.compareTo((new Date())) > 0){
            NoNacimiento.setText("*La fecha de nacimiento es posterior a hoy.");
            NoNacimiento.setVisible(true);
            valido = false;
        }
        if(contratacion == null){
            NoContratacion.setText("*La fecha de contratación es obligatoria.");
            NoContratacion.setVisible(true);
            valido = false;
        }else if(nacimiento != null && contratacion.compareTo(nacimiento) < 0){
            NoContratacion.setText("*Las fechas son incongruentes.");
            NoContratacion.setVisible(true);
            valido = false;
        }
        if(nacionalidad == null || nacionalidad.isBlank()){
            NoNacionalidad.setText("*La nacionalidad es obligatoria.");
            NoNacionalidad.setVisible(true);
            valido = false;
        }
        if(cargo == null || cargo.isBlank()){
            NoCargo.setText("*El cargo es obligatorio.");
            NoCargo.setVisible(true);
            valido = false;
        }
        return valido;
    }
    
     private boolean validarDNI(String dni) {
        dni = dni.toUpperCase();
        String intPartDNI = dni.trim().replaceAll(" ", "").substring(0, 8);
        if(dni.length() == 9){
            char ltrDNI = dni.charAt(8);
            if(isNumeric(intPartDNI)){
                int valNumDni = Integer.parseInt(intPartDNI) % 23;
                if(dniChars.charAt(valNumDni)== ltrDNI){
                    return true;
                }
            }
        }
        return false;
    }
     
     private boolean isNumeric(String numeroString){
         try{
             int numeroConvertido = Integer.parseInt(numeroString);
             return true;
         }catch(Exception ex){
             return false;
         }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarModificar;
    private javax.swing.JLabel NoCargo;
    private javax.swing.JLabel NoClientesMaximos;
    private javax.swing.JLabel NoNacimiento;
    private javax.swing.JLabel NoNacionalidad;
    private javax.swing.JLabel NoNombre;
    private javax.swing.JLabel NoPrecio;
    private javax.swing.JLabel NoTematica;
    private javax.swing.JButton bCancelar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField tCargo;
    private javax.swing.JTextField tClientesMaximos;
    private com.toedter.calendar.JDateChooser tNacimiento;
    private javax.swing.JTextField tNacionalidad;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPrecio;
    private javax.swing.JTextField tTematica;
    private javax.swing.JLabel tTitulo;
    // End of variables declaration//GEN-END:variables
}
