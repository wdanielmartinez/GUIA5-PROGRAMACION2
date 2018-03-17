
package Frames;

import guia5progra2.Login;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpnlCerrar = new javax.swing.JPanel();
        jlblCerrarSesion = new javax.swing.JLabel();
        jpnlGuia3y4 = new javax.swing.JPanel();
        jlblGuia3y4 = new javax.swing.JLabel();
        jpnlGuia1 = new javax.swing.JPanel();
        jlblGuia1 = new javax.swing.JLabel();
        jpnlGuia2 = new javax.swing.JPanel();
        jlblGuia2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 630));
        setMinimumSize(new java.awt.Dimension(440, 630));
        setName("Login"); // NOI18N
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlCerrar.setBackground(new java.awt.Color(127, 21, 17));
        jpnlCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jpnlCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnlCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpnlCerrarMouseMoved(evt);
            }
        });
        jpnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnlCerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnlCerrarMouseExited(evt);
            }
        });
        jpnlCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jlblCerrarSesion.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jlblCerrarSesion.setText("Cerrar Sesión");
        jpnlCerrar.add(jlblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jpnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 120, 40));

        jpnlGuia3y4.setBackground(new java.awt.Color(51, 51, 51));
        jpnlGuia3y4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlGuia3y4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnlGuia3y4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpnlGuia3y4MouseMoved(evt);
            }
        });
        jpnlGuia3y4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnlGuia3y4MouseExited(evt);
            }
        });
        jpnlGuia3y4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblGuia3y4.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblGuia3y4.setForeground(new java.awt.Color(255, 255, 255));
        jlblGuia3y4.setText("GUIA #3 y #4");
        jpnlGuia3y4.add(jlblGuia3y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jpnlGuia3y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 190, 50));

        jpnlGuia1.setBackground(new java.awt.Color(51, 51, 51));
        jpnlGuia1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlGuia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnlGuia1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpnlGuia1MouseMoved(evt);
            }
        });
        jpnlGuia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnlGuia1MouseExited(evt);
            }
        });
        jpnlGuia1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblGuia1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblGuia1.setForeground(new java.awt.Color(255, 255, 255));
        jlblGuia1.setText("GUIA #1");
        jlblGuia1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblGuia1MouseMoved(evt);
            }
        });
        jpnlGuia1.add(jlblGuia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel2.add(jpnlGuia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, 50));

        jpnlGuia2.setBackground(new java.awt.Color(51, 51, 51));
        jpnlGuia2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlGuia2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnlGuia2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpnlGuia2MouseMoved(evt);
            }
        });
        jpnlGuia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnlGuia2MouseExited(evt);
            }
        });
        jpnlGuia2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblGuia2.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblGuia2.setForeground(new java.awt.Color(255, 255, 255));
        jlblGuia2.setText("GUIA #2");
        jpnlGuia2.add(jlblGuia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(jpnlGuia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/UES.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 250, 580));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblMenu.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        jlblMenu.setForeground(new java.awt.Color(127, 21, 17));
        jlblMenu.setText("Menú");
        jPanel1.add(jlblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlCerrarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?", "Salir", dialogButton);
        
        if(result == 0){
            Login ventanaLogin = new Login();
            ventanaLogin.setVisible(true);
            Menu.this.dispose();
        }
    }//GEN-LAST:event_jpnlCerrarMouseClicked

    private void jpnlCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlCerrarMouseMoved
        jpnlCerrar.setBackground(new java.awt.Color(50, 69, 55));
    }//GEN-LAST:event_jpnlCerrarMouseMoved

    private void jpnlCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlCerrarMouseExited
        jpnlCerrar.setBackground(new java.awt.Color(127,21,17));
    }//GEN-LAST:event_jpnlCerrarMouseExited

    private void jlblGuia1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblGuia1MouseMoved
        jlblGuia1.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jlblGuia1MouseMoved

    private void jpnlGuia2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGuia2MouseMoved
       jpnlGuia2.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jpnlGuia2MouseMoved

    private void jpnlGuia3y4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGuia3y4MouseMoved
       jpnlGuia3y4.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_jpnlGuia3y4MouseMoved

    private void jpnlGuia1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGuia1MouseExited
        jpnlGuia1.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jpnlGuia1MouseExited

    private void jpnlGuia2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGuia2MouseExited
       jpnlGuia2.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jpnlGuia2MouseExited

    private void jpnlGuia3y4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGuia3y4MouseExited
       jpnlGuia3y4.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_jpnlGuia3y4MouseExited

    private void jpnlGuia1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGuia1MouseMoved
        jpnlGuia1.setBackground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_jpnlGuia1MouseMoved

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblCerrarSesion;
    private javax.swing.JLabel jlblGuia1;
    private javax.swing.JLabel jlblGuia2;
    private javax.swing.JLabel jlblGuia3y4;
    private javax.swing.JLabel jlblMenu;
    private javax.swing.JPanel jpnlCerrar;
    private javax.swing.JPanel jpnlGuia1;
    private javax.swing.JPanel jpnlGuia2;
    private javax.swing.JPanel jpnlGuia3y4;
    // End of variables declaration//GEN-END:variables
}
