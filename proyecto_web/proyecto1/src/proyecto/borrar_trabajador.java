/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane; 
import java.sql.Connection; 
import java.sql.PreparedStatement;

import java.sql.Statement;

/**
 *
 * @author Dani
 */
public class borrar_trabajador extends javax.swing.JFrame {
    public static final String PATH = "jdbc:mysql://localhost:3306/restaurante";
    public static final String USUARIO = "root";
    public static final String PASS = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
 public static Connection getConection() {
        Connection con = null; //vacia la conecion
        try {

            Class.forName("com.mysql.jdbc.Driver"); //manda a llamar el drive
            con = (Connection) DriverManager.getConnection(PATH, USUARIO, PASS);//le dice donde esta que usuario y pasword
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    /**
     * Creates new form borrar_trabajador
     */
    public borrar_trabajador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_id_empleado = new javax.swing.JTextField();
        jb_borrar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar Trabajador ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("id_empleado");

        jtf_id_empleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jb_borrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jb_borrar.setText("Borrar");
        jb_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarMouseClicked(evt);
            }
        });
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        jb_cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jb_cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                            .addComponent(jb_borrar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jtf_id_empleado))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_borrar)
                    .addComponent(jb_cancelar))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
        Connection con = null;
        
        try{
            
            con = getConection();
            ps = con.prepareStatement("DELETE FROM empleados WHERE id=?");
            ps.setString(1, this.jtf_id_empleado.getText());            
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Resgistro eliminado");
                this.jtf_id_empleado.setText(null);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar el registro de empleado");
                 this.jtf_id_empleado.setText(null);
            }
            
            con.close();
            
        } catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jb_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cancelarMouseClicked
        try{
            JOptionPane.showMessageDialog(null, "Desea cancelar la eliminación");
            this.jtf_id_empleado.setText("");
        } catch(Exception err){
        JOptionPane.showMessageDialog(null, "Error"+err.getMessage());
        }
    }//GEN-LAST:event_jb_cancelarMouseClicked

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
            java.util.logging.Logger.getLogger(borrar_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrar_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrar_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrar_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrar_trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JTextField jtf_id_empleado;
    // End of variables declaration//GEN-END:variables

    private static class c {

        public c() {
        }
    }
    }
