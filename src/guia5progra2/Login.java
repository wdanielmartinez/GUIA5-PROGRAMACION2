
package guia5progra2;

import Frames.Menu;
import java.awt.Component;
//import java.awt.Menu;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    private Component confirmation;
    private String usuario, password;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public void datos(String usuario, String password){
        usuario = "ADMIN";
        password = "123ABC";
    }

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
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 630));
        setMinimumSize(new java.awt.Dimension(900, 630));
        setName("Menú"); // NOI18N
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

        txtUsuario.setBackground(new java.awt.Color(16, 16, 16));
        txtUsuario.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(127, 21, 17));
        txtUsuario.setText("Ingrese usuario...");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, 60));

        txtPassword.setBackground(new java.awt.Color(16, 16, 16));
        txtPassword.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(127, 21, 17));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 290, 40));

        jSeparator1.setBackground(new java.awt.Color(127, 21, 17));
        jSeparator1.setForeground(new java.awt.Color(127, 21, 17));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(127, 21, 17));
        jSeparator2.setForeground(new java.awt.Color(127, 21, 17));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 320, 40));

        jbtnIniciarSesion.setBackground(new java.awt.Color(127, 21, 17));
        jbtnIniciarSesion.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jbtnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnIniciarSesion.setText("Iniciar Sesión");
        jbtnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 120, 40));

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

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked

        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked

        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
       datos(usuario, password);
       
       if(usuario.equals(txtUsuario.getText()) && password.equals(txtPassword.getText())){
           Menu ventanaMenu = new Menu();
           ventanaMenu.setVisible(true);
           Login.this.dispose();
       }else if(txtUsuario.getText().equals("") && txtPassword.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
        txtUsuario.setFocusable(true);
       }else if(txtUsuario.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
        txtUsuario.setFocusable(true);
       }else if(txtPassword.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
        txtPassword.setFocusable(true);
       }
        else if(txtUsuario.getText().compareTo(usuario)!=0 && txtPassword.getText().compareTo(password)!=0){
        JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
        txtUsuario.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(usuario)!=0){
        JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
        txtUsuario.setFocusable(true);
        }else if(txtPassword.getText().compareTo(password)!=0){
        JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
        txtPassword.setFocusable(true);
        }
    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
