
package Vistas;


import Dao.DeportistaImplementsDAO;
import Modelos.Deportes;
import Modelos.Deportista;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;




public class CompetenciaView extends javax.swing.JFrame {

    private DeportistaImplementsDAO datosDeportista;
    private DefaultComboBoxModel<String> comboBoxModel;

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Actualizar)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(identificacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nombresText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidosText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deportesBox, 0, 183, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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
         // Obtener los valores ingresados en los campos
        int identificacion;
        try {
            identificacion = Integer.parseInt(identificacionText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una identificación válida", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método sin continuar
        }

        String apellidos = apellidosText.getText();
        String nombres = nombresText.getText();
        String tipoDeporte = deportesBox.getSelectedItem().toString();

        // Validar que todos los campos estén completos
        if (identificacion == 0 || apellidos.isEmpty() || nombres.isEmpty() || tipoDeporte.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método sin continuar
        }

        // Crear un nuevo objeto Deportista con los datos ingresados
        Deportista deportista = new Deportista(identificacion, apellidos, nombres, tipoDeporte);

        // Agregar el deportista al objeto DatosDeportista
        datosDeportista.agregarDeportista(deportista);

        // Mostrar un mensaje indicando que el deportista se ha agregado correctamente
        JOptionPane.showMessageDialog(this, "El deportista ha sido agregado correctamente");
        System.out.println(datosDeportista);

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

    private void actualizarContenidoTextArea() {
        StringBuilder contenido = new StringBuilder();

        // Recorrer la lista de deportistas y agregar la información al StringBuilder
        for (Deportista deportista : datosDeportista.obtenerTodosLosDeportistas()) {
            contenido.append("Identificación: ").append(deportista.getIdentificacion()).append("\n");
            contenido.append("Apellidos: ").append(deportista.getApellidos()).append("\n");
            contenido.append("Nombres: ").append(deportista.getNombres()).append("\n");
            contenido.append("Deporte: ").append(deportista.getTipoDeporte()).append("\n");
            contenido.append("--------------------------------------\n");
        }

        // Establecer el contenido del JTextArea con el texto generado
        CampoDatos.setText(contenido.toString());
        }
    
    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
        // Obtener la identificación del deportista a eliminar
        int identificacion;
        try {
            identificacion = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la identificación del deportista a eliminar"));
        } catch (NumberFormatException e) {
            System.out.println("");
            return; // Salir del método sin continuar
        }

        // Verificar si el deportista existe en el objeto DatosDeportista
        if (datosDeportista.existeDeportista(identificacion)) {
            // Eliminar el deportista del objeto DatosDeportista
            datosDeportista.eliminarDeportista(identificacion);

            // Mostrar un mensaje indicando que el deportista ha sido eliminado correctamente
            JOptionPane.showMessageDialog(this, "El deportista ha sido eliminado correctamente");

            // Limpiar los campos de texto
            identificacionText.setText("");
            apellidosText.setText("");
            nombresText.setText("");
            deportesBox.setSelectedIndex(0); // O seleccionar un valor predeterminado si lo deseas

            // Actualizar el contenido del TextArea con la lista actualizada de deportistas
            actualizarContenidoTextArea();
        } else {
            // Mostrar un mensaje indicando que no se encontró un deportista con esa identificación
            JOptionPane.showMessageDialog(this, "No se encontró un deportista con esa identificación");
        }
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void salirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirbtnActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
       try {
            int identificacion = Integer.parseInt(identificacionText.getText());
            String apellidos = apellidosText.getText();
            String nombres = nombresText.getText();
            String tipoDeporte = deportesBox.getSelectedItem().toString();

            // Verificar si los campos de texto están vacíos
            if (apellidos.isEmpty() || nombres.isEmpty() || tipoDeporte.isEmpty()) {
                throw new Exception("Los campos están vacíos");
            }

            // Verificar si el deportista existe
            if (datosDeportista.buscarDeportista(identificacion) != null) {
                // Actualizar la información del deportista
                Deportista deportista = new Deportista(identificacion, apellidos, nombres, tipoDeporte);
                datosDeportista.actualizarDeportista(deportista);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "La información del deportista ha sido actualizada correctamente");

                // Limpiar los campos de texto
                identificacionText.setText("");
                apellidosText.setText("");
                nombresText.setText("");
                deportesBox.setSelectedIndex(0); // Establecer el índice seleccionado en el primer elemento

                // Actualizar el contenido del TextArea con la información actualizada
                actualizarContenidoTextArea();
            } else {
                // Mostrar mensaje de error si el deportista no existe
                JOptionPane.showMessageDialog(this, "No se encontró un deportista con esa identificación");
            }
        } catch (Exception e) {
            // Mostrar mensaje de error si los campos están vacíos
            JOptionPane.showMessageDialog(this, "Los campos están vacíos. No hay nada que actualizar");
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
