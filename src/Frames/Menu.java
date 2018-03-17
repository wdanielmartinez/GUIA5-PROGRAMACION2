
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
        jlblCerrar = new javax.swing.JLabel();
        jpnlGuia3y4 = new javax.swing.JPanel();
        jlblGuia3y4 = new javax.swing.JLabel();
        jpnlGuia1 = new javax.swing.JPanel();
        jlblGuia1 = new javax.swing.JLabel();
        jpnlGuia2 = new javax.swing.JPanel();
        jlblGuia2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 630));
        setMinimumSize(new java.awt.Dimension(440, 630));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlCerrar.setBackground(new java.awt.Color(127, 21, 17));
        jpnlCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jpnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnlCerrarMouseClicked(evt);
            }
        });
        jpnlCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblCerrar.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jlblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jlblCerrar.setText("Cerrar Sesión");
        jlblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCerrarMouseClicked(evt);
            }
        });
        jpnlCerrar.add(jlblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jpnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 120, 40));

        jpnlGuia3y4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlGuia3y4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblGuia3y4.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblGuia3y4.setForeground(new java.awt.Color(255, 255, 255));
        jlblGuia3y4.setText("GUIA #3 y #4");
        jpnlGuia3y4.add(jlblGuia3y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jpnlGuia3y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, 50));

        jpnlGuia1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlGuia1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblGuia1.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblGuia1.setForeground(new java.awt.Color(255, 255, 255));
        jlblGuia1.setText("GUIA #1");
        jpnlGuia1.add(jlblGuia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel2.add(jpnlGuia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, 50));

        jpnlGuia2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnlGuia2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblGuia2.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jlblGuia2.setForeground(new java.awt.Color(255, 255, 255));
        jlblGuia2.setText("GUIA #2");
        jpnlGuia2.add(jlblGuia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(jpnlGuia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, 50));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
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

    private void jlblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?", "Salir", dialogButton);
        
        if(result == 0){
            Login ventanaLogin = new Login();
            ventanaLogin.setVisible(true);
            Menu.this.dispose();
        }
    }//GEN-LAST:event_jlblCerrarMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlblCerrar;
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
