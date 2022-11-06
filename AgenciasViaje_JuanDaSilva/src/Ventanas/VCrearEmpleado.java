package Ventanas;

import Clases.Empleado;
import Clases.Response;
import agenciasturismo_juandasilva.Main;
import java.util.Date;
import javax.swing.JOptionPane;

public class VCrearEmpleado extends javax.swing.JFrame {
    
    private final String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";   
    
    public VCrearEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        eNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tDni = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        AceptarModificar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        NoApellido1 = new javax.swing.JLabel();
        NoDni = new javax.swing.JLabel();
        NoNombre = new javax.swing.JLabel();
        tApellido1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tNacimiento = new com.toedter.calendar.JDateChooser();
        NoNacimiento = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tContratacion = new com.toedter.calendar.JDateChooser();
        NoContratacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tNacionalidad = new javax.swing.JTextField();
        NoNacionalidad = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tCargo = new javax.swing.JTextField();
        NoCargo = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tTitulo.setText("Crear Empleado");

        jLabel2.setText("DNI:");

        eNombre.setText("Nombre:");

        jLabel6.setText("Apellido:");

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

        NoApellido1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoApellido1.setForeground(new java.awt.Color(255, 0, 0));
        NoApellido1.setText("*Apellido no válido");

        NoDni.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoDni.setForeground(new java.awt.Color(255, 0, 0));
        NoDni.setText("*DNI no válido");

        NoNombre.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNombre.setForeground(new java.awt.Color(255, 0, 0));
        NoNombre.setText("*Nombre no válido");

        jLabel7.setText("Nacimiento:");

        NoNacimiento.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNacimiento.setForeground(new java.awt.Color(255, 0, 0));
        NoNacimiento.setText("*Fecha no válida (dd/mm/aaaa)");

        jLabel8.setText("Contratación:");

        NoContratacion.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoContratacion.setForeground(new java.awt.Color(255, 0, 0));
        NoContratacion.setText("*Fecha no válida (dd/mm/aaaa)");

        jLabel9.setText("Nacionalidad:");

        NoNacionalidad.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoNacionalidad.setForeground(new java.awt.Color(255, 0, 0));
        NoNacionalidad.setText("*Nacionalidad no válida");

        jLabel10.setText("Cargo:");

        NoCargo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        NoCargo.setForeground(new java.awt.Color(255, 0, 0));
        NoCargo.setText("*Cargo no válido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eNombre)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoDni)
                            .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(AceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NoNacimiento)
                                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NoApellido1)
                                .addComponent(tApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NoNombre)
                                .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoNacionalidad)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NoContratacion)
                                .addComponent(tContratacion, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addComponent(tNacionalidad))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoCargo)
                            .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoDni)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNombre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoApellido1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNacimiento)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoContratacion)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoNacionalidad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Main.cerrarCrearEmpleado();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void AceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarModificarActionPerformed
        if(validarDatos()){
            String dni = tDni.getText();
            String nombre = tNombre.getText();
            String apellido1 = tApellido1.getText();
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
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearEmpleado().setVisible(true);
            }
        });
    }
    
    public boolean validarDatos(){
        NoDni.setVisible(false);
        NoNombre.setVisible(false);
        NoApellido1.setVisible(false);
        NoNacimiento.setVisible(false);
        NoContratacion.setVisible(false);
        NoNacionalidad.setVisible(false);
        NoCargo.setVisible(false);
        boolean valido = true;
        String dni = tDni.getText();
        String nombre = tNombre.getText();
        String apellido1 = tApellido1.getText();
        Date nacimiento = tNacimiento.getDate();
        Date contratacion = tContratacion.getDate();
        String nacionalidad = tNacionalidad.getText();
        String cargo = tCargo.getText();
        if(dni == null || dni.isBlank()){
            NoDni.setText("*El DNI es obligatorio.");
            NoDni.setVisible(true);
            valido = false;
        }else if(!validarDNI(dni)){
            NoDni.setText("*El DNI no es correcto.");
            NoDni.setVisible(true);
            valido = false;
        }
        if(nombre == null || nombre.isBlank()){
            NoNombre.setText("*El nombre es obligatorio.");
            NoNombre.setVisible(true);
            valido = false;
        }
        if(apellido1 == null || apellido1.isBlank()){
            NoApellido1.setText("*Los apellidos son obligatorios.");
            NoApellido1.setVisible(true);
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
    private javax.swing.JLabel NoApellido1;
    private javax.swing.JLabel NoCargo;
    private javax.swing.JLabel NoContratacion;
    private javax.swing.JLabel NoDni;
    private javax.swing.JLabel NoNacimiento;
    private javax.swing.JLabel NoNacionalidad;
    private javax.swing.JLabel NoNombre;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel eNombre;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField tApellido1;
    private javax.swing.JTextField tCargo;
    private com.toedter.calendar.JDateChooser tContratacion;
    private javax.swing.JTextField tDni;
    private com.toedter.calendar.JDateChooser tNacimiento;
    private javax.swing.JTextField tNacionalidad;
    private javax.swing.JTextField tNombre;
    private javax.swing.JLabel tTitulo;
    // End of variables declaration//GEN-END:variables
}
