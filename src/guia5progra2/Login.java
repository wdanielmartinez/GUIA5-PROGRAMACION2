
package guia5progra2;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /*
    public void datos(String usuario, String password){
        usuario = "ADMIN";
        password = "123ABC";
    }
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblMinimizar = new javax.swing.JLabel();
        jlblSalir = new javax.swing.JLabel();
        jlblBienvenido = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jlblContraseña = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnIniciar = new javax.swing.JPanel();
        jlblIniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 630));
        setMinimumSize(new java.awt.Dimension(900, 630));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login1(440x630).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 630));

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblMinimizar.setFont(new java.awt.Font("Dubai Medium", 1, 48)); // NOI18N
        jlblMinimizar.setForeground(new java.awt.Color(127, 21, 17));
        jlblMinimizar.setText("-");
        jlblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(jlblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 40));

        jlblSalir.setFont(new java.awt.Font("Dubai Medium", 1, 36)); // NOI18N
        jlblSalir.setForeground(new java.awt.Color(127, 21, 17));
        jlblSalir.setText("x");
        jlblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 12, 20, 30));

        jlblBienvenido.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        jlblBienvenido.setForeground(new java.awt.Color(127, 21, 17));
        jlblBienvenido.setText("Bienvenido");
        jPanel1.add(jlblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 260, 110));

        jlblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jlblUsuario.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlblUsuario.setText("Usuario:");
        jPanel1.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 70));

        jlblContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jlblContraseña.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlblContraseña.setText("Contraseña:");
        jPanel1.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 140, 60));

        jtxtUsuario.setBackground(new java.awt.Color(16, 16, 16));
        jtxtUsuario.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(127, 21, 17));
        jtxtUsuario.setText("Ingrese usuario...");
        jtxtUsuario.setBorder(null);
        jtxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, 60));

        jPassword.setBackground(new java.awt.Color(16, 16, 16));
        jPassword.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jPassword.setForeground(new java.awt.Color(127, 21, 17));
        jPassword.setText("jPasswordField1");
        jPassword.setBorder(null);
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 290, 40));

        jSeparator1.setBackground(new java.awt.Color(127, 21, 17));
        jSeparator1.setForeground(new java.awt.Color(127, 21, 17));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(127, 21, 17));
        jSeparator2.setForeground(new java.awt.Color(127, 21, 17));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 40));

        jbtnIniciar.setBackground(new java.awt.Color(127, 21, 17));
        jbtnIniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnIniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnIniciarMouseMoved(evt);
            }
        });
        jbtnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnIniciarMouseExited(evt);
            }
        });
        jbtnIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblIniciarSesion.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jlblIniciarSesion.setText("Iniciar Sesión");
        jlblIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblIniciarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblIniciarSesionMouseMoved(evt);
            }
        });
        jlblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblIniciarSesionMouseExited(evt);
            }
        });
        jbtnIniciar.add(jlblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 30));

        jPanel1.add(jbtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 460, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSalirMouseClicked

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Salir", dialogButton);
        
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jlblSalirMouseClicked

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked

        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jtxtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUsuarioMouseClicked

        jtxtUsuario.setText("");
    }//GEN-LAST:event_jtxtUsuarioMouseClicked

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked

        jPassword.setText("");
    }//GEN-LAST:event_jPasswordMouseClicked

    private void jlblIniciarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblIniciarSesionMouseMoved

        jlblIniciarSesion.setBackground(new java.awt.Color(50, 69, 55));
    }//GEN-LAST:event_jlblIniciarSesionMouseMoved

    private void jbtnIniciarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIniciarMouseMoved

        jbtnIniciar.setBackground(new java.awt.Color(50, 69, 55));
    }//GEN-LAST:event_jbtnIniciarMouseMoved

    private void jlblIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblIniciarSesionMouseExited

        jbtnIniciar.setBackground(new java.awt.Color(127,21,17));
    }//GEN-LAST:event_jlblIniciarSesionMouseExited

    private void jbtnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIniciarMouseExited

         jbtnIniciar.setBackground(new java.awt.Color(127,21,17));
    }//GEN-LAST:event_jbtnIniciarMouseExited

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jbtnIniciar;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblIniciarSesion;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
