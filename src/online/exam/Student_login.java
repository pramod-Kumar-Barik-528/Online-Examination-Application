/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pramod
 */
public class Student_login extends javax.swing.JFrame {

    /**
     * Creates new form Student_login
     */
    public Student_login() {
        initComponents();
        connect();
        this.close.setVisible(false);
        
    }
    
    
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void connect()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root", "Prbarik528@gmail.com");
           // JOptionPane.showMessageDialog(this, "conection successful");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Student_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        close = new javax.swing.JLabel();
        open = new javax.swing.JLabel();
        txtpswd1 = new javax.swing.JPasswordField();
        regd = new javax.swing.JLabel();
        lg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hm = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ps = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jj = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        close.setText("  ");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 30, -1));

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/open.png"))); // NOI18N
        open.setText(" ");
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openMousePressed(evt);
            }
        });
        getContentPane().add(open, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, 30));

        txtpswd1.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(txtpswd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 240, 30));

        regd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regd.setForeground(new java.awt.Color(204, 0, 0));
        regd.setText("Click Here To Registration");
        regd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regdMouseExited(evt);
            }
        });
        getContentPane().add(regd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        lg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lg1.png"))); // NOI18N
        lg.setText(" ");
        lg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgMouseExited(evt);
            }
        });
        getContentPane().add(lg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        jLabel8.setText(" ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        hm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gm1.png"))); // NOI18N
        hm.setText(" ");
        hm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hmMouseExited(evt);
            }
        });
        getContentPane().add(hm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 120, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student1-removebg-preview.png"))); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 150, 160));

        ps.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ps.setForeground(new java.awt.Color(0, 0, 255));
        ps.setText("@Your passwod id Phone Number");
        getContentPane().add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, 20));

        un.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        un.setForeground(new java.awt.Color(0, 0, 255));
        un.setText("@ UserName is your Name");
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("Student Login Panel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 330, 40));

        txtuname.setBackground(new java.awt.Color(255, 102, 0));
        txtuname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtuname.setForeground(new java.awt.Color(0, 0, 255));
        txtuname.setText(" ");
        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        getContentPane().add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 240, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/output-onlinepngtools (1).png"))); // NOI18N
        jLabel3.setText(" Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/output-onlinepngtools.png"))); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Click here to know your detail");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("||");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jj.setForeground(new java.awt.Color(204, 0, 0));
        jj.setText(" ");
        getContentPane().add(jj, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 354, 300, 30));

        HOME.setBackground(new java.awt.Color(255, 153, 0));
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login11.jpg"))); // NOI18N
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunameActionPerformed

    private void lgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseExited
        // TODO add your handling code here:
        lg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lg1.png")));
    }//GEN-LAST:event_lgMouseExited

    private void lgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseEntered
        // TODO add your handling code here:
        lg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lg2.png")));
    }//GEN-LAST:event_lgMouseEntered

    private void lgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgMouseClicked
        // TODO add your handling code here:
       if(txtuname.getText().trim().isEmpty() && txtpswd1.getText().isEmpty())
       {
           jj.setText("All are fileds are EMpty");
           un.setText("* UserName required");
           ps.setText("* password required");
       }
         else if(txtuname.getText().trim().isEmpty())
       {
           jj.setText("user name filed is empty");
           un.setText("* user name required");
           ps.setText(" ");
       }
       else if(txtpswd1.getText().trim().isEmpty())
       {
           jj.setText("password is filed empty");
           ps.setText("* password required");
            un.setText(" ");
       }
       else
       {
           jj.setText(" ");
           ps.setText(" ");
            un.setText(" ");
       }
      
         try{
           // txtpswd1.setEchoChar((char)0);
          
           String sql="SELECT * FROM online_exam.student WHERE `SName` =  ? and `phone` =  ? ";
           pst =con.prepareStatement(sql);
           pst.setString(1, txtuname.getText());
            pst.setString(2, txtpswd1.getText());
           rs=pst.executeQuery();
           if(rs.next())
           {
              //JOptionPane.showMessageDialog(this,"you are login"); 
               JOptionPane.showMessageDialog(this, "You Are LOged IN");
               new instruction().setVisible(true);
             this.setVisible(false);
           }
           else 
           {
              JOptionPane.showMessageDialog(this,"you are login failedfffffffffffffffff");
             // 
              //JOptionPane.showMessageDialog(this, "login fail");
           }
         //con.close();
        }catch(Exception ex){JOptionPane.showMessageDialog(this,ex.getMessage() );}
    }//GEN-LAST:event_lgMouseClicked

    private void hmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hmMouseExited
        // TODO add your handling code here:
        hm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gm1.png"))); 
    }//GEN-LAST:event_hmMouseExited

    private void hmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hmMouseEntered
        // TODO add your handling code here:
        hm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gm2.png"))); 
    }//GEN-LAST:event_hmMouseEntered

    private void hmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hmMouseClicked
        // TODO add your handling code here:
        new welcome().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_hmMouseClicked

    private void regdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseExited
        // TODO add your handling code here:
         regd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regd.setForeground(new java.awt.Color(204, 0, 0));
        regd.setText("Click Here To Registration");
    }//GEN-LAST:event_regdMouseExited

    private void regdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseEntered
        // TODO add your handling code here:
         regd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regd.setForeground(new java.awt.Color(0, 0, 204));
        regd.setText("Click Here To Registration");
    }//GEN-LAST:event_regdMouseEntered

    private void regdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseClicked
        // TODO add your handling code here:
        new student().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_regdMouseClicked

    private void openMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMousePressed
        // TODO add your handling code here:
        close.setVisible(true);
        open.setVisible(false);
         txtpswd1.setEchoChar((char)0);
    }//GEN-LAST:event_openMousePressed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:
         open.setVisible(true);
        close.setVisible(false);
         txtpswd1.setEchoChar('*');
    }//GEN-LAST:event_closeMousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog( HOME,"confirm if you Want to Exit","ONLINE EXAMINATION APPLICATION",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel close;
    private javax.swing.JLabel hm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel jj;
    private javax.swing.JLabel lg;
    private javax.swing.JLabel open;
    private javax.swing.JLabel ps;
    private javax.swing.JLabel regd;
    private javax.swing.JPasswordField txtpswd1;
    private javax.swing.JTextField txtuname;
    private javax.swing.JLabel un;
    // End of variables declaration//GEN-END:variables
}
