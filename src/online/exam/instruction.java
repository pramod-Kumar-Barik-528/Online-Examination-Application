/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.exam;

import javax.swing.JOptionPane;

/**
 *
 * @author Pramod
 */
public class instruction extends javax.swing.JFrame {

    /**
     * Creates new form instruction
     */
    public instruction() {
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

        back = new javax.swing.JLabel();
        takeExam = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bbb.png"))); // NOI18N
        back.setText(" ");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        takeExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/te+blue.png"))); // NOI18N
        takeExam.setText(" ");
        takeExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takeExamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                takeExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                takeExamMouseExited(evt);
            }
        });
        getContentPane().add(takeExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("6. your mark shown button left side in the Exam page..");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("5. After give the answer then click next to get another question ..");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("4. system provie you one question at a time ... ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("3. make sure check your Name displaly or not in top left side in your exam page.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("2. when you Enter you registrtion Number system will display your Name .");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("1. when you enter in the sytem . system want you your registration number .  ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Instruction");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText(" ALL THE BEST");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText(" Read All The Point and check Your Self");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText(" ONLINE EXAMINATION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        HOME.setBackground(new java.awt.Color(255, 0, 0));
        HOME.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 0, 0));
        HOME.setText(" ");
        HOME.setOpaque(true);
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 430));

        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void takeExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeExamMouseExited
        // TODO add your handling code here:
        takeExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/te+blue.png")));
    }//GEN-LAST:event_takeExamMouseExited

    private void takeExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeExamMouseEntered
        // TODO add your handling code here:
        takeExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/te+y.png")));
    }//GEN-LAST:event_takeExamMouseEntered

    private void takeExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeExamMouseClicked
        // TODO add your handling code here:
        
        takeExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/te+g.png")));
         //JOptionPane.showConfirmDialog(this,"Ready To Take Exam");
          if (JOptionPane.showConfirmDialog( HOME,"confirm Ready To Take Exam","ONLINE EXAMINATION APPLICATION",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
          {  // System.exit(0);
        this.setVisible(false);
         new Test().setVisible(true);
          }
    }//GEN-LAST:event_takeExamMouseClicked

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
         back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bbb.png"))); 
    }//GEN-LAST:event_backMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
         back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bb.png"))); 
    }//GEN-LAST:event_backMouseEntered

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
         back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.png"))); 
         new Student_login().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instruction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel takeExam;
    // End of variables declaration//GEN-END:variables
}
