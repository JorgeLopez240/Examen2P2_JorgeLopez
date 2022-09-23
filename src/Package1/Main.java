
package Package1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        update_lista_empleados();
        update_comboBox_empleados();
        
        jtable_carros.getTableHeader().setOpaque(false);
        
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
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_marca_carro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_modelo_carro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jdc_fabricacion_carro = new com.toedter.calendar.JDateChooser();
        tf_costo_carro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bt_crear_carro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_mod_marca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_mod_modelo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jdc_mod_fabricacion = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        tf_mod_estado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_mod_costo = new javax.swing.JTextField();
        bt_mod_carro = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_carros = new javax.swing.JTable();
        cb_carros = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cb_empleados_simulacion = new javax.swing.JComboBox<>();
        cb_carros_simulacion = new javax.swing.JComboBox<>();
        jpb_barra = new javax.swing.JProgressBar();
        bt_iniciar_simulacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

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
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 480));

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

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 10, 472));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Crear carro");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 30, -1, -1));

        jLabel8.setText("Marca");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel3.add(tf_marca_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 320, -1));

        jLabel9.setText("Modelo");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel3.add(tf_modelo_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 320, -1));

        jLabel10.setText("Fecha de fabricacion:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel3.add(jdc_fabricacion_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, -1));
        jPanel3.add(tf_costo_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 310, -1));

        jLabel11.setText("Costo de reparacion");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        bt_crear_carro.setText("Crear carro");
        bt_crear_carro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crear_carroMouseClicked(evt);
            }
        });
        jPanel3.add(bt_crear_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 90, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Modificar carro");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel13.setText("Marca");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));
        jPanel3.add(tf_mod_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 260, -1));

        jLabel14.setText("Modelo");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));
        jPanel3.add(tf_mod_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 260, -1));

        jLabel15.setText("Fabricacion");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));
        jPanel3.add(jdc_mod_fabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, -1));

        jLabel16.setText("Estado");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));
        jPanel3.add(tf_mod_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 260, -1));

        jLabel17.setText("Costo de reparacion");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));
        jPanel3.add(tf_mod_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 200, -1));

        bt_mod_carro.setText("Modificar");
        bt_mod_carro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mod_carroMouseClicked(evt);
            }
        });
        jPanel3.add(bt_mod_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 370, 10));

        jtable_carros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Fabricacion", "Estado", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_carros.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtable_carros);
        if (jtable_carros.getColumnModel().getColumnCount() > 0) {
            jtable_carros.getColumnModel().getColumn(0).setResizable(false);
            jtable_carros.getColumnModel().getColumn(1).setResizable(false);
            jtable_carros.getColumnModel().getColumn(2).setResizable(false);
            jtable_carros.getColumnModel().getColumn(3).setResizable(false);
            jtable_carros.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 370, 170));

        cb_carros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_carrosItemStateChanged(evt);
            }
        });
        jPanel3.add(cb_carros, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 170, 30));

        jTabbedPane1.addTab("Carros", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cb_empleados_simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, -1));

        jPanel4.add(cb_carros_simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 149, -1));
        jPanel4.add(jpb_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 660, 30));

        bt_iniciar_simulacion.setText("Iniciar");
        jPanel4.add(bt_iniciar_simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 50));

        jTabbedPane1.addTab("Simulación", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
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
            .addGap(0, 482, Short.MAX_VALUE)
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
            .addGap(0, 482, Short.MAX_VALUE)
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
            .addGap(0, 532, Short.MAX_VALUE)
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
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            int pos = cb_empleados.getSelectedIndex();

            cargarEmpleados();
            empleados.remove(pos);
            escribirEmpleados();
            
            update_lista_empleados();
            update_comboBox_empleados();
            
            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente!");
            
        } else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un empleado!");
        }
    }//GEN-LAST:event_bt_eliminar_empleadoMouseClicked

    private void bt_crear_carroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crear_carroMouseClicked
        // Crear carro
        
        String marca,modelo,estado;
        Date fabricacion;
        double costo_reparacion;
        
        marca = tf_marca_carro.getText();
        modelo = tf_modelo_carro.getText();
        estado = "en espera de entrar a reparación"; // Debido a que se acaba de crear
        fabricacion = jdc_fabricacion_carro.getDate();
        costo_reparacion= Double.parseDouble(tf_costo_carro.getText());
        
        Carro carro = new Carro(marca, modelo, fabricacion, estado, costo_reparacion);
        
        cargarCarros();
        carros.add(carro);
        escribirCarros();
        
        JOptionPane.showMessageDialog(this, "Carro agregado exitosamente!");
        
        update_comboBox_carros();
        
        update_tabla_carros();
        
        tf_marca_carro.setText("");
        tf_modelo_carro.setText("");
        jdc_fabricacion_carro.setDate(null);
        tf_costo_carro.setText("");
        
        
    }//GEN-LAST:event_bt_crear_carroMouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(jTabbedPane1.getSelectedIndex()==1){
            update_comboBox_carros();
            update_tabla_carros();
        } else if(jTabbedPane1.getSelectedIndex()==2){
            update_comboBox_empleados_simulacion();
            update_comboBox_carros_simulacion();
            
            
            
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void cb_carrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_carrosItemStateChanged
        if(evt.getStateChange()==1){
            cargarCarros();
            int pos = cb_carros.getSelectedIndex();
            
            Carro carro = carros.get(pos);
            String n="";
            tf_mod_marca.setText(carro.getMarca());
            tf_mod_modelo.setText(carro.getModelo());
            jdc_mod_fabricacion.setDate(carro.getFabricacion());
            tf_mod_estado.setText(carro.getEstado());
            n+=carro.getCosto_reparacion();
            tf_mod_costo.setText(n);
        }
    }//GEN-LAST:event_cb_carrosItemStateChanged

    private void bt_mod_carroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mod_carroMouseClicked
        // Modificar carro
        
        if(cb_carros.getSelectedIndex()>=0){
            int pos = cb_carros.getSelectedIndex();
            
            String marca,modelo,estado;
            Date fabricacion;
            double costo;
            
            marca = tf_mod_marca.getText();
            modelo = tf_mod_modelo.getText();
            estado = tf_mod_estado.getText();
            fabricacion = jdc_mod_fabricacion.getDate();
            costo = Double.parseDouble(tf_mod_costo.getText());
            
            cargarCarros();
            
            carros.get(pos).setMarca(marca);
            carros.get(pos).setModelo(modelo);
            carros.get(pos).setFabricacion(fabricacion);
            carros.get(pos).setEstado(estado);
            carros.get(pos).setCosto_reparacion(costo);
            
            escribirCarros();
            
            update_comboBox_carros();
            update_tabla_carros();
            
            JOptionPane.showMessageDialog(this, "Modificación exitosa!");
            
        } else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un carro!");
        }
        
        
    }//GEN-LAST:event_bt_mod_carroMouseClicked

    public void cargarEmpleados() {
        try {    
            File archivoEmpleados=new File("./empleados.mcb");
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
        File archivoEmpleados=new File("./empleados.mcb");
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoEmpleados);
            bw = new ObjectOutputStream(fw);
            for (Empleado e : empleados){
                bw.writeObject(e);
            }
            bw.flush();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally{
            try {
                bw.close();
                fw.close();
            }catch (Exception ex) {
                
            }
        }
    }
     
    public void cargarCarros(){
        try {    
            File archivoCarros=new File("./carros.mcb");
            carros = new ArrayList();
            Carro temp;
            if (archivoCarros.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivoCarros);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carro) objeto.readObject()) != null) {
                        carros.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirCarros(){
        File archivoCarros=new File("./carros.mcb");
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoCarros);
            bw = new ObjectOutputStream(fw);
            for (Carro c : carros){
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception ex){
            ex.printStackTrace();
        } finally{
            try {
                bw.close();
                fw.close();
            }catch (Exception ex) {
                
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
        //modelo.removeAllElements();
        for (Empleado e : empleados) {
            modelo.addElement(e);
        }
        cb_empleados.setModel(modelo);
    }
    
    public void update_comboBox_carros(){
        cb_carros.setModel(new DefaultComboBoxModel());
        cargarCarros();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_carros.getModel();
        for (Carro c : carros) {
            modelo.addElement(c);
        }
        cb_carros.setModel(modelo);
    }
    
    public void limpiar_tabla_carros(){
        jtable_carros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Fabricacion", "Estado", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable_carros.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtable_carros);
        if (jtable_carros.getColumnModel().getColumnCount() > 0) {
            jtable_carros.getColumnModel().getColumn(0).setResizable(false);
            jtable_carros.getColumnModel().getColumn(1).setResizable(false);
            jtable_carros.getColumnModel().getColumn(2).setResizable(false);
            jtable_carros.getColumnModel().getColumn(3).setResizable(false);
            jtable_carros.getColumnModel().getColumn(4).setResizable(false);
        }
    }
    
    public void update_tabla_carros(){
        limpiar_tabla_carros();
        
        DefaultTableModel modelo = (DefaultTableModel) jtable_carros.getModel();
        
        cargarCarros();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        for (Carro c : carros) {
            Object [] newrow ={c.getMarca(),c.getModelo(),sdf.format(c.getFabricacion()),c.getEstado(),c.getCosto_reparacion()};
            modelo.addRow(newrow);
        }
        
        jtable_carros.setModel(modelo);
        
    }
    
    public void update_comboBox_empleados_simulacion(){
        cb_empleados_simulacion.setModel(new DefaultComboBoxModel());
        cargarEmpleados();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_empleados_simulacion.getModel();
        for (Empleado e : empleados) {
            modelo.addElement(e);
        }
        cb_empleados_simulacion.setModel(modelo);
    }
    
    public void update_comboBox_carros_simulacion(){
        cb_carros_simulacion.setModel(new DefaultComboBoxModel());
        cargarCarros();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_carros_simulacion.getModel();
        for (Carro c : carros) {
            if(c.getEstado().equals("en espera de entrar a reparación")){
                modelo.addElement(c);
            }
        }
        cb_carros_simulacion.setModel(modelo);
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
    private javax.swing.JButton bt_crear_carro;
    private javax.swing.JButton bt_crear_empleado;
    private javax.swing.JButton bt_eliminar_empleado;
    private javax.swing.JButton bt_iniciar_simulacion;
    private javax.swing.JButton bt_mod_carro;
    private javax.swing.JComboBox<String> cb_carros;
    private javax.swing.JComboBox<String> cb_carros_simulacion;
    private javax.swing.JComboBox<String> cb_empleados;
    private javax.swing.JComboBox<String> cb_empleados_simulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdc_fabricacion_carro;
    private com.toedter.calendar.JDateChooser jdc_mod_fabricacion;
    private javax.swing.JList<String> jlist_empleados;
    private javax.swing.JProgressBar jpb_barra;
    private javax.swing.JTable jtable_carros;
    private javax.swing.JTextField tf_costo_carro;
    private javax.swing.JTextField tf_edad_empleado;
    private javax.swing.JTextField tf_id_empleado;
    private javax.swing.JTextField tf_marca_carro;
    private javax.swing.JTextField tf_mod_costo;
    private javax.swing.JTextField tf_mod_estado;
    private javax.swing.JTextField tf_mod_marca;
    private javax.swing.JTextField tf_mod_modelo;
    private javax.swing.JTextField tf_modelo_carro;
    private javax.swing.JTextField tf_nombre_empleado;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Carro> carros = new ArrayList();
    
}
