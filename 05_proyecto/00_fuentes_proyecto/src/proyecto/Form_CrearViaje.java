/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rgonzalez
 */
public class Form_CrearViaje extends javax.swing.JFrame {

    /**
     * Creates new form Form_CrearViaje
     */
    public Form_CrearViaje() {
        initComponents();
        LlenarBuses();
        txtFecha.setText(GetFechaActual());
        txtCodViaje.setText(String.valueOf(GenerarCodigoViaje()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodViaje = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        cbxBus = new javax.swing.JComboBox<>();
        txtConductor = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantAsientos = new javax.swing.JTextField();
        txtPasajesDisponibles = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Crear Viaje");

        jLabel2.setText("Codigo Viaje");

        jLabel3.setText("Fecha");

        jLabel4.setText("Hora");

        jLabel5.setText("Bus");

        jLabel6.setText("Conductor");

        jLabel7.setText("Destino");

        jLabel8.setText("Precio");

        jLabel9.setText("Cantidad de Asientos");

        jLabel10.setText("Pasajes Disponibles");

        jLabel11.setText("Estado");

        txtHora.setText("HH:MM");

        cbxBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbxBus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBusItemStateChanged(evt);
            }
        });

        txtCantAsientos.setEditable(false);

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Realizado", "Abortado"}));

        txtFecha.setText("AAAA-MM-DD");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Origen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodViaje)
                            .addComponent(txtHora)
                            .addComponent(txtConductor)
                            .addComponent(txtDestino)
                            .addComponent(txtPrecio)
                            .addComponent(txtCantAsientos)
                            .addComponent(txtPasajesDisponibles)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(txtOrigen))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtConductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCantAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPasajesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxBusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBusItemStateChanged
        // TODO add your handling code here:
        System.out.println("Item changed");
        String patente = cbxBus.getSelectedItem().toString();
        try{
            ClassMysql MysqlHandler= new ClassMysql();
                String query;
                query = "SELECT cantidad_asientos from `Buses` where patente='"+patente+"'";
                System.out.println(query);
                Connection con = MysqlHandler.getCon();
                Statement stm = con.createStatement();
                ResultSet res = stm.executeQuery(query);
                while (res.next()){
                     txtCantAsientos.setText(res.getString("cantidad_asientos"));
                     txtPasajesDisponibles.setText(res.getString("cantidad_asientos"));
                }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cbxBusItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        
        String Codigo,Fecha,Hora,Bus,Conductor,Origen,Destino;
        int Precio,CantAsientos,PasajesDisponibles;
        char Estado;
        Codigo=txtCodViaje.getText();
        Fecha = txtFecha.getText();
        Hora = txtHora.getText();
        Bus = cbxBus.getSelectedItem().toString(); //patente
        Conductor=txtConductor.getText();
        Origen = txtOrigen.getText();
        Destino = txtDestino.getText();
        Precio = Integer.parseInt(txtPrecio.getText());
        CantAsientos = Integer.parseInt(txtCantAsientos.getText());
        PasajesDisponibles = Integer.parseInt(txtPasajesDisponibles.getText());
        Estado = GetEstado(cbxEstado.getSelectedItem().toString());
        
        String Query;
        Query = "INSERT INTO `Proyecto`.`viajes` VALUES ('"
                +Codigo+"','"
                +Fecha+"','"
                +Hora+"','"
                +Bus+"','"
                +Conductor+"','"
                +Origen+"','"
                +Destino+"','"
                +Precio+"','"
                +CantAsientos+"','"
                +PasajesDisponibles+"','"
                +Estado+"')";
        System.out.println(Query);
        
        if (!ValidarCodViaje(Codigo)){
            ClassMysql MysqlHandler= new ClassMysql();
            try{
                MysqlHandler.EjecutarQuery(Query);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(null, "Viaje Agregado");
            dispose();
            }else{
            JOptionPane.showMessageDialog(null, "Codigo ya existe");
            txtCodViaje.requestFocus();
        }
    }//GEN-LAST:event_btGuardarActionPerformed
    
    private char GetEstado(String Estado){
        switch (Estado){
            case "Pendiente":
            return 'P';
            case "Realizado":
            return 'R';
            case "Abortado":
            return 'A';
        }
        return 'A';
    }
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
            java.util.logging.Logger.getLogger(Form_CrearViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_CrearViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_CrearViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_CrearViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_CrearViaje().setVisible(true);
            }
        });
    }

    private void LlenarBuses(){
        cbxBus.addItem("Seleccionar Bus");
        try{
            ClassMysql MysqlHandler= new ClassMysql();
                String query;
                query = "SELECT Patente,modelo from `Buses`";
                Connection con = MysqlHandler.getCon();
                Statement stm = con.createStatement();
                ResultSet res = stm.executeQuery(query);
                while (res.next()){
                     cbxBus.addItem(res.getString("patente"));
                }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    private boolean ValidarCodViaje(String Codigo){
        try{
            ClassMysql MysqlHandler= new ClassMysql();
                String query;
                query = "SELECT CodigoViaje from `viajes` WHERE CodigoViaje='"+Codigo+"'";
                Connection con = MysqlHandler.getCon();
                Statement stm = con.createStatement();
                ResultSet res = stm.executeQuery(query);
                while (res.next()){
                     return true;
                }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    private String GetFechaActual (){
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println(sdf.format(date));
            return sdf.format(date);
        }
    
     private int GenerarCodigoViaje(){
             try{
                ClassMysql MysqlHandler= new ClassMysql();
                String query;
                query = "SELECT MAX(CodigoViaje) as CodViaje from `viajes`";
                Connection con = MysqlHandler.getCon();
                Statement stm = con.createStatement();
                ResultSet res = stm.executeQuery(query);
                while (res.next()){
                    
                     if (res.getInt("CodViaje")>0)
                         return res.getInt("CodViaje")+1;
                     else
                         return 900001;
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
             return 900001;
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JComboBox<String> cbxBus;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantAsientos;
    private javax.swing.JTextField txtCodViaje;
    private javax.swing.JTextField txtConductor;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPasajesDisponibles;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}