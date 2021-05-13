
package presentacion;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

        public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnsalir = new javax.swing.JButton();
        btnentrar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalir.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        btnsalir.setText("Cerrar");
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 130, 30));

        btnentrar.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        btnentrar.setText("Entrar");
        btnentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnentrarMouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 130, 30));

        txtusuario.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        jDialog1.getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        jLabel2.setText("Usuario:");
        jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        jLabel3.setText("Contraseña:");
        jDialog1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));
        jDialog1.getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img1.jpg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnentrarMouseClicked
String Usuario = "admin";
        String Contraseña= "123";
        
        
        String Pass= new String(password.getPassword());
        
        if (txtusuario.getText ().equals(Usuario)&& Pass.equals(Contraseña)){
        
        Menu MN= new Menu();
        MN.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnentrarMouseClicked
else{
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrectos");
        }
    }
    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_btnsalirMouseClicked


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
