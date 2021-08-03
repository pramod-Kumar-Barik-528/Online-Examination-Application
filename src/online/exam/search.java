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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pramod
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    public search() {
        initComponents();
        connect();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void connect()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root", "Prbarik528@gmail.com");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        student = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        homee = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(255, 255, 51));
        jTable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 680, 60));

        jComboBox1.setBackground(new java.awt.Color(0, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- < Select item > -", "admin", "student" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 120, 30));

        student.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        student.setForeground(new java.awt.Color(255, 0, 0));
        student.setText("Student Login");
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });
        getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("||");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        admin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 0, 0));
        admin.setText("Admin Login");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("||");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        homee.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        homee.setForeground(new java.awt.Color(255, 0, 0));
        homee.setText("Home");
        homee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeeMouseClicked(evt);
            }
        });
        getContentPane().add(homee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        jLabel4.setText(" ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("-----Search  Your Detail Using Your registration Name-----------------------------------------------");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 670, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ONLINE EXAMINATION APPLICATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        id.setBackground(new java.awt.Color(255, 255, 0));
        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 0, 0));
        id.setText(" ");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 510, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ss+bb.png"))); // NOI18N
        search.setText(" ");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, 50));

        jLabel5.setBackground(new java.awt.Color(0, 51, 51));
        jLabel5.setText(" ");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 90));

        jLabel6.setBackground(new java.awt.Color(0, 204, 102));
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText(" ");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 360));

        HOME.setText(" ");
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        // TODO add your handling code here:
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ss+rr.png")));
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        // TODO add your handling code here:
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ss+bb.png")));
    }//GEN-LAST:event_searchMouseExited

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        try{
           String sc=jComboBox1.getSelectedItem().toString();
           
            //'"+id+"' sc
            String id1 = id.getText().toString();
              String s= "admin";
            String s1= "student";
             String s2= "- < Select item > -";
             String s3= "";
       
           id.setText(" ");
           
            if(s1.equals(sc))
            {
            pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE SName ='"+id1+"'");
           //  pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE id ='"+id1+"'");
             // pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE phone ='"+id1+"'");
             //  pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE address ='"+id1+"'");
              //  pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE age ='"+id1+"'");
        //    pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE RegdID ='"+id1+"'");
            rs= pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            int c;
            c=rsd.getColumnCount();
            DefaultTableModel d= (DefaultTableModel)jTable2.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
               // jTable2.setVisible(true);
                Vector v= new Vector();
                for(int i=0; i<=c; i++)
                {
                    v.add(rs.getString("id"));
                     v.add(rs.getString("SName"));
                      
                       v.add(rs.getString("phone"));
                        v.add(rs.getString("address"));
                        v.add(rs.getString("age"));
                  
                        
                }
                d.addRow(v);   
            }
            }
            else if(s.equals(sc))
            {
              //  pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE SName ='"+id1+"'");
            pst = con.prepareStatement("SELECT * FROM online_exam."+sc+" WHERE Name ='"+id1+"'");
            rs= pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            int c;
            c=rsd.getColumnCount();
            DefaultTableModel d= (DefaultTableModel)jTable2.getModel();
            d.setRowCount(0);
            
            while(rs.next())
            {
               // jTable2.setVisible(true);
                Vector v= new Vector();
                for(int i=0; i<=c; i++)
                {
                    v.add(rs.getString("RegdID"));
                     v.add(rs.getString("Name"));
                      
                       v.add(rs.getString("Email"));
                        v.add(rs.getString("Phone"));
                        //v.add(rs.getString("age"));
                  
                        
                }
                d.addRow(v);   
            }
            }
            
            else if(s2.equals(sc))
            {
                JOptionPane.showMessageDialog(this, "please Select an Item", "No Data", HEIGHT);
            }
            else if(s3.equals(id1))
            {
                JOptionPane.showMessageDialog(this, "enter your data", "No Data", HEIGHT);
            }
            
        }catch(SQLException ex)
        {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
          String sc1=jComboBox1.getSelectedItem().toString();
          String s= "admin";
           String s1= "student";
        if(s.equals(sc1))
        {
            JOptionPane.showMessageDialog(this, "you selected ** ADMIN**", "YOU CHOOSEED", HEIGHT);
          //  JOptionPane.showConfirmDialog(this, "you selected ** ADMIN**");
            
        }
            if(s1.equals(sc1)) 
            {
                JOptionPane.showMessageDialog(this, "you selected ** STUDENT**", "your choosed ", HEIGHT);
            }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog( HOME,"confirm if you Want to Exit","ONLINE EXAMINATION APPLICATIOM",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void homeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeeMouseClicked
        // TODO add your handling code here:
         new welcome().setVisible(true);
         this.setVisible(false);
         homee.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        homee.setForeground(new java.awt.Color(255, 255, 0));//255, 255, 0
        homee.setText("Home");
    }//GEN-LAST:event_homeeMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        new admin_login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminMouseClicked

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
        // TODO add your handling code here:
         new Student_login().setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_studentMouseClicked

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel homee;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel search;
    private javax.swing.JLabel student;
    // End of variables declaration//GEN-END:variables
}
