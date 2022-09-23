
package Package1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        update_lista_empleados();
        update_comboBox_empleados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre_empleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_edad_empleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_id_empleado = new javax.swing.JTextField();
        bt_crear_empleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_empleados = new javax.swing.JComboBox<>();
        bt_eliminar_empleado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_empleados = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Crear Empleado");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel2.add(tf_nombre_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 370, -1));

        jLabel3.setText("Edad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel2.add(tf_edad_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 370, -1));

        jLabel4.setText("Id");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel2.add(tf_id_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, -1));

        bt_crear_empleado.setText("Crear empleado");
        bt_crear_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_empleadoMouseClicked(evt);
            }
        });
        jPanel2.add(bt_crear_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 120, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Eliminar empleado");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jPanel2.add(cb_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 220, -1));

        bt_eliminar_empleado.setText("Eliminar");
        bt_eliminar_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminar_empleadoMouseClicked(evt);
            }
        });
        jPanel2.add(bt_eliminar_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Lista de empleados");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 280, 20));

        jlist_empleados.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jlist_empleados);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 220, 170));

        jTabbedPane1.addTab("Empleados", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Carros", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simulación", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pagos", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Entregas", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reparaciones", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_crear_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_empleadoMouseClicked
        //Crear empleado
        
        String nombre,id;
        int edad;
        int carros_reparados = 0; // Se le asignan 0 carros reparados porque se acaba de crear
        
        nombre = tf_nombre_empleado.getText();
        id = tf_id_empleado.getText();
        edad = Integer.parseInt(tf_edad_empleado.getText());
        
        Empleado empleado = new Empleado(nombre, edad, id, carros_reparados);
        
        cargarEmpleados();
        empleados.add(empleado);
        escribirEmpleados();
        
        JOptionPane.showMessageDialog(this, "Empleado creado exitosamente!");
        
        tf_nombre_empleado.setText("");
        tf_edad_empleado.setText("");
        tf_id_empleado.setText("");
        
        update_lista_empleados();
        update_comboBox_empleados();
        
    }//GEN-LAST:event_bt_crear_empleadoMouseClicked

    private void bt_eliminar_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminar_empleadoMouseClicked
        //Eliminar empleado 
        
        if(cb_empleados.getSelectedIndex()>=0){
            Empleado empleado = (Empleado) cb_empleados.getSelectedItem();
            cargarEmpleados();
            empleados.remove(empleado);
            //JOptionPane.showMessageDialog(this,empleado);
            escribirEmpleados();
            JOptionPane.showMessageDialog(this,"Empleado eliminado exitosamente!");
            cargarEmpleados();
            update_lista_empleados();
            update_comboBox_empleados();
            System.out.println(empleados);
            
        } else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado!");
        }
        
    }//GEN-LAST:event_bt_eliminar_empleadoMouseClicked

    public void cargarEmpleados() {
        try {            
            empleados = new ArrayList();
            Empleado temp;
            if (archivoEmpleados.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivoEmpleados);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleado) objeto.readObject()) != null) {
                        empleados.add(temp);
                    }
                } catch (EOFException e) {
                    e.printStackTrace();
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirEmpleados() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoEmpleados);
            bw = new ObjectOutputStream(fw);
            for (Empleado e : empleados) {
                bw.writeObject(e);
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                
            }
        }
    }
     
    public void update_lista_empleados(){
        
        //Limpiar lista
        jlist_empleados.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jlist_empleados);
        
        
        //Cargar lista 
        
        DefaultListModel modelo = (DefaultListModel) jlist_empleados.getModel();
        
        cargarEmpleados();
        for (Empleado e : empleados) {
            modelo.addElement(e);
        }
        
        jlist_empleados.setModel(modelo);
        
    }
    
    public void update_comboBox_empleados(){
        cb_empleados.setModel(new DefaultComboBoxModel());
        cargarEmpleados();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_empleados.getModel();
        for (Empleado e : empleados) {
            modelo.addElement(e);
        }
        cb_empleados.setModel(modelo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_crear_empleado;
    private javax.swing.JButton bt_eliminar_empleado;
    private javax.swing.JComboBox<String> cb_empleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jlist_empleados;
    private javax.swing.JTextField tf_edad_empleado;
    private javax.swing.JTextField tf_id_empleado;
    private javax.swing.JTextField tf_nombre_empleado;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Empleado> empleados = new ArrayList();
    private File archivoEmpleados = new File("./empleados.mcb");
    
}
