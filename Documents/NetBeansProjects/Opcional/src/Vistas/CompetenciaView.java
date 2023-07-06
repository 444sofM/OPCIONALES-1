
package Vistas;


import Dao.DeportistaImplementsDAO;
import Modelos.Deportes;
import Modelos.Deportista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;




public class CompetenciaView extends javax.swing.JFrame {

    private DeportistaImplementsDAO datosDeportista;
    private DefaultComboBoxModel<String> comboBoxModel;
    //private Deportista deportistaSeleccionado;
    //private DeportistaController controlador;

    public CompetenciaView(DeportistaImplementsDAO DAO ) {
        //this.controlador = controlador;
        initComponents();
        datosDeportista = new DeportistaImplementsDAO(); // Instanciar el objeto DatosPaciente
        comboBoxModel = new DefaultComboBoxModel<>(); // Crear el modelo para el ComboBox
        deportesBox.setModel(comboBoxModel); // Establecer el modelo en el ComboBox

        // Cargar las alergias iniciales en el ComboBox
        List<Deportes> todasLosDeporteses = datosDeportista.obtenerTodasLoDeporteses();
        for (Deportes deportes : todasLosDeporteses) {
            comboBoxModel.addElement(deportes.getNombre());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        grabarbtn = new javax.swing.JButton();
        cancelarbtn = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();
        salirbtn = new javax.swing.JButton();
        identificacionText = new javax.swing.JTextField();
        nombresText = new javax.swing.JTextField();
        apellidosText = new javax.swing.JTextField();
        deportesBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoDatos = new javax.swing.JTextArea();
        Actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identificacion: ");

        jLabel2.setText("Deporte:");

        jLabel3.setText("Nombres: ");

        jLabel4.setText("Apellidos:");

        grabarbtn.setText("Grabar");
        grabarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarbtnActionPerformed(evt);
            }
        });

        cancelarbtn.setText("Cancelar");
        cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbtnActionPerformed(evt);
            }
        });

        eliminarbtn.setText("Eliminar");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        salirbtn.setText("Salir");
        salirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtnActionPerformed(evt);
            }
        });

        deportesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deportesBoxActionPerformed(evt);
            }
        });

        CampoDatos.setEditable(false);
        CampoDatos.setColumns(20);
        CampoDatos.setRows(5);
        jScrollPane1.setViewportView(CampoDatos);

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombresText, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(deportesBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellidosText)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Actualizar)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(identificacionText)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salirbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grabarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(grabarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(identificacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombresText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deportesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(Actualizar)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void grabarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarbtnActionPerformed
        int identificacion = Integer.parseInt(identificacionText.getText());
        String apellidos = apellidosText.getText();
        String nombres = nombresText.getText();
        String tipoDeporte = deportesBox.getSelectedItem().toString();
        // Crear un nuevo objeto Deportista con los datos ingresados
        Deportista deportista = new Deportista(identificacion, apellidos, nombres, tipoDeporte);

        // Agregar el deportista al objeto DatosDeportista
        datosDeportista.agregarDeportista(deportista);

        // Mostrar un mensaje indicando que el deportista se ha agregado correctamente
        JOptionPane.showMessageDialog(this, "El deportista ha sido agregado correctamente");

        // Obtener el contenido actual del TextArea
        String contenidoActual = CampoDatos.getText();

        // Crear una cadena con la información del deportista agregado
        String informacion = "Identificación: " + identificacion + "\n" +
                             "Apellidos: " + apellidos + "\n" +
                             "Nombres: " + nombres + "\n" +
                             "Deporte: " + tipoDeporte + "\n\n";

        // Concatenar el contenido actual con la nueva información
        String nuevoContenido = contenidoActual + informacion;

        // Mostrar la información en el TextArea
        CampoDatos.setText(nuevoContenido);
    
    }//GEN-LAST:event_grabarbtnActionPerformed

    private void cancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarbtnActionPerformed
        identificacionText.setText(""); // Limpiar campo de identificación
        apellidosText.setText(""); // Limpiar campo de apellidos
        nombresText.setText(""); // Limpiar campo de nombres
        deportesBox.setSelectedIndex(0); // Reiniciar el JComboBox seleccionando el primer elemento

    }//GEN-LAST:event_cancelarbtnActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void salirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirbtnActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // Obtener los datos ingresados en los campos de texto
        int identificacion = Integer.parseInt(identificacionText.getText());
        String apellidos = apellidosText.getText();
        String nombres = nombresText.getText();

        // Verificar si el paciente existe
        Deportista deportista = datosDeportista.buscarDeportista(identificacion);

        if (deportista != null) {
            // Actualizar los datos del paciente
            deportista.setApellidos(apellidos);
            deportista.setNombres(nombres);

            // Mostrar un mensaje indicando que la información se ha actualizado correctamente
            JOptionPane.showMessageDialog(this, "La información del paciente ha sido actualizada correctamente");
        } else {
            // Mostrar un mensaje indicando que el paciente no está registrado
            JOptionPane.showMessageDialog(this, "El paciente no está registrado");
        }
        
    }//GEN-LAST:event_ActualizarActionPerformed

    private void deportesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deportesBoxActionPerformed
        String deporteSeleccionada = deportesBox.getSelectedItem().toString();

        if (comboBoxModel.getIndexOf(deporteSeleccionada) == -1) {
        comboBoxModel.addElement(deporteSeleccionada);
        }
    }//GEN-LAST:event_deportesBoxActionPerformed

  
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
            java.util.logging.Logger.getLogger(CompetenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompetenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompetenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompetenciaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompetenciaView(new DeportistaImplementsDAO()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextArea CampoDatos;
    private javax.swing.JTextField apellidosText;
    private javax.swing.JButton cancelarbtn;
    private javax.swing.JComboBox<String> deportesBox;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JButton grabarbtn;
    private javax.swing.JTextField identificacionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombresText;
    private javax.swing.JButton salirbtn;
    // End of variables declaration//GEN-END:variables
}
