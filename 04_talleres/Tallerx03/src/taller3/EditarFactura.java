/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rgonzalez
 */
public class EditarFactura extends javax.swing.JFrame {

    /**
     * Creates new form EditarFactura
     */
    String Folio;
    
    public EditarFactura(String nFolio) {
        this.Folio = nFolio;
        initComponents();
        QueryFacturas(Folio);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Doble Clic para editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel1))
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFactura(null).setVisible(true);
            }
        });
    }
    
public void Guardar (){
    System.out.println(jTable1.getValueAt(0, 0));//Folio
    System.out.println(jTable1.getValueAt(0, 1));
    System.out.println(jTable1.getValueAt(0, 2));
    System.out.println(jTable1.getValueAt(0, 3));
    System.out.println(jTable1.getValueAt(0, 4));
    System.out.println(jTable1.getValueAt(0, 5));
    System.out.println(jTable1.getValueAt(0, 6));
    System.out.println(jTable1.getValueAt(0, 7));
    String Query = "UPDATE `Facturas` SET"
            +"`rut` = '"+jTable1.getValueAt(0, 1)+"', "
            +"`nombre` = '"+jTable1.getValueAt(0, 2)+"', " 
            +"`glosa` = '"+jTable1.getValueAt(0, 3)+"', " 
            +"`neto` = "+jTable1.getValueAt(0, 4)+", " 
            +"`iva` = "+jTable1.getValueAt(0, 5)+"," 
            +"`total` = "+jTable1.getValueAt(0, 6)+", " 
            +"`estadopago` = '"+jTable1.getValueAt(0, 7)+"' " 
            +" WHERE `folio` ='"+this.Folio+"'";
            
    System.out.println(Query);
    mysql MysqlHanlder = new mysql();
    MysqlHanlder.EjecutarQuery(Query);
    JOptionPane.showMessageDialog(null,"Datos actualizados correctamente. ");
    
            
}
public void QueryFacturas(String folio){
        mysql MysqlHandler = new mysql();
        Connection con = MysqlHandler.getCon();
	String selectString = "select * from Facturas WHERE folio = "+folio+" limit 0,1";
        Object columnNames[] = { "Folio", "Rut", "Nombre", "Glosa","Neto","IVA", "Total","Estado Pago" };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        String [] Row = new String[9];
        Float total=0.0f;
        try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectString);
			while (rs.next()) {
                           Row[0] = rs.getString("folio");
                           Row[1] = rs.getString("rut");
                           Row[2] = rs.getString("nombre");
                           Row[3] = rs.getString("glosa");
                           Row[4] = String.valueOf(rs.getFloat("neto"));
                           Row[5] = String.valueOf(rs.getFloat("iva"));
                           Row[6] = String.valueOf(rs.getFloat("total"));
                           Row[7] = rs.getString("estadopago");
                           total += rs.getFloat("total");
                           model.addRow(Row);
			}
			stmt.close();
			con.close();
                        
                        jTable1.setModel(model);
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}