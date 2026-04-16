
package views;

import data.Persistencia;

public class AgregarVehiculoView extends javax.swing.JFrame {

    public AgregarVehiculoView() {
        initComponents();
        
        tKXL.setEnabled(false);
        tLitrosE.setEnabled(false);
        jKXL.setEnabled(false);
        jLitrosE.setEnabled(false);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tPatente = new javax.swing.JLabel();
        jPatente = new javax.swing.JTextField();
        tMarca = new javax.swing.JLabel();
        jMarca = new javax.swing.JTextField();
        tModelo = new javax.swing.JLabel();
        jModelo = new javax.swing.JTextField();
        tAnio = new javax.swing.JLabel();
        tCapacidad = new javax.swing.JLabel();
        tSucursal = new javax.swing.JLabel();
        jCSucursal = new javax.swing.JComboBox<>();
        tTipo = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<>();
        jAnio = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jCapacidad = new javax.swing.JSpinner();
        jKwhB = new javax.swing.JSpinner();
        tKwhB = new javax.swing.JLabel();
        jKXL = new javax.swing.JSpinner();
        tKXL = new javax.swing.JLabel();
        jLitrosE = new javax.swing.JSpinner();
        tLitrosE = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tPatente.setText("Patente");

        tMarca.setText("Marca");

        tModelo.setText("Modelo");

        tAnio.setText("Año");

        tCapacidad.setText("Capacidad de carga");

        tSucursal.setText("Sucursal");

        jCSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sucursal1", "Sucursal2" }));
        jCSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSucursalActionPerformed(evt);
            }
        });

        tTipo.setText("Tipo de vehiculo");

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrico", "Combustible" }));
        jCTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoActionPerformed(evt);
            }
        });

        jAnio.setModel(new javax.swing.SpinnerNumberModel(2026, 1900, 2027, 1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Agregar Vehiculos");

        jCapacidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jKwhB.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        tKwhB.setText("Kwh Base");

        jKXL.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        tKXL.setText("Kilometros por Litro");

        jLitrosE.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        tLitrosE.setText("Litros Extra");

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jVolver.setText("Listar Vehiculos");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tKXL)
                            .addComponent(tPatente)
                            .addComponent(tKwhB)
                            .addComponent(tMarca)
                            .addComponent(tSucursal)
                            .addComponent(tModelo)
                            .addComponent(tLitrosE)
                            .addComponent(tTipo)
                            .addComponent(tAnio)
                            .addComponent(tCapacidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPatente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCSucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLitrosE, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jKXL, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jKwhB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel8)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jGuardar)
                .addGap(31, 31, 31)
                .addComponent(jVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPatente)
                    .addComponent(jPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMarca)
                    .addComponent(jMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tModelo)
                    .addComponent(jModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAnio)
                    .addComponent(jAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCapacidad)
                    .addComponent(jCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSucursal)
                    .addComponent(jCSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTipo)
                    .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tKwhB)
                    .addComponent(jKwhB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tKXL)
                    .addComponent(jKXL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLitrosE)
                    .addComponent(jLitrosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jVolver))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSucursalActionPerformed
        
    }//GEN-LAST:event_jCSucursalActionPerformed

    private void jCTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoActionPerformed
        String seleccion = jCTipo.getSelectedItem().toString();
    
        
         if (seleccion.equals("Electrico")) {
             
            tKwhB.setEnabled(true);
            jKwhB.setEnabled(true);
               
            tKXL.setEnabled(false);
            tLitrosE.setEnabled(false);
            jKXL.setEnabled(false);
            jLitrosE.setEnabled(false);             
   
        } else if (seleccion.equals("Combustible")) {

            tKXL.setEnabled(true);
            tLitrosE.setEnabled(true);
            jKXL.setEnabled(true);
            jLitrosE.setEnabled(true);

            tKwhB.setEnabled(false);
            jKwhB.setEnabled(false);
        }
    }//GEN-LAST:event_jCTipoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        
        String tipo = jCTipo.getSelectedItem().toString();
        String marca = jMarca.getText();
        String patente = jPatente.getText();
        String modelo = jModelo.getText();
        int anio = Integer.parseInt(jAnio.getValue().toString());
        int carga = Integer.parseInt(jCapacidad.getValue().toString());
        String suc = jCSucursal.getSelectedItem().toString();
        double kwh = Double.parseDouble(jKwhB.getValue().toString());
        double litros = Double.parseDouble(jKXL.getValue().toString());
        double extra = Double.parseDouble(jLitrosE.getValue().toString());
        
        Persistencia.inicializarVehiculo(tipo, marca, patente, modelo, anio, carga, suc, kwh, litros, extra);
        
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        Controlador.abrirListar();
        Controlador.cerrarAgregar();
    }//GEN-LAST:event_jVolverActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarVehiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarVehiculoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner jAnio;
    private javax.swing.JComboBox<String> jCSucursal;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JSpinner jCapacidad;
    private javax.swing.JButton jGuardar;
    private javax.swing.JSpinner jKXL;
    private javax.swing.JSpinner jKwhB;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jLitrosE;
    private javax.swing.JTextField jMarca;
    private javax.swing.JTextField jModelo;
    private javax.swing.JTextField jPatente;
    private javax.swing.JButton jVolver;
    private javax.swing.JLabel tAnio;
    private javax.swing.JLabel tCapacidad;
    private javax.swing.JLabel tKXL;
    private javax.swing.JLabel tKwhB;
    private javax.swing.JLabel tLitrosE;
    private javax.swing.JLabel tMarca;
    private javax.swing.JLabel tModelo;
    private javax.swing.JLabel tPatente;
    private javax.swing.JLabel tSucursal;
    private javax.swing.JLabel tTipo;
    // End of variables declaration//GEN-END:variables
}
