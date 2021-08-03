/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.exam;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pramod
 */
public class testtttt_for_admin extends javax.swing.JFrame {

    /**
     * Creates new form testtttt_for_admin
     */
    public testtttt_for_admin() {
        initComponents();
         connect();
        Loaddnmane1();
        Loaddnmane() ;
        LoadQuestion();
    }
    
    
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
     
    int anscheck=0;
    int mark=0;
    String cor=null;
    String answer=null;
    Statement stat;
   String id= JOptionPane.showInputDialog("enter your id");
    
    public boolean anscheck()
    {
        
        String answerAnswer="";
        if(r1.isSelected())
        {
            answerAnswer = r1.getText();
        }
        else if(r2.isSelected())
                {
                    answerAnswer=r2.getText();
                }
        else if(r3.isSelected())
        {
            answerAnswer=r3.getText();
        }
        else if(r4.isSelected())
        {
            answerAnswer=r4.getText();
        }
        if(answerAnswer.equals(cor)&&(answer==null || !answer.equals(cor)))
        {
            mark=mark+1;
//            txtmark.setText(String.valueOf(mark));
        }
        else if(!answerAnswer.equals(cor)&&answer!=null)
        {
            
            if(mark>0)
            {
                mark=mark-1;
            }
          //  txtmark.setText(String.valueOf(mark));
        }
        if(!answerAnswer.equals(""))
        {
            try{
                String query ="UPDATE `online_exam`.`eg_exam` SET `givenAnswer` = ? WHERE `Question` = ?";
                pst = con.prepareStatement(query);
                pst.setString(1,answerAnswer);
                pst.setString(2,jLabel2.getText());
                pst.execute();
                
            }catch(Exception ex){ex.printStackTrace();}
             return true;
        }
        return false;
        
    }
    private void NullAllGivenAnswer()
    {
        try{
            String query ="UPDATE `online_exam`.`eg_exam` SET `givenAnswer` = ?";
            pst = con.prepareStatement(query);
            pst.setString(1,null);
            pst.execute();
            
        }catch (Exception ex){ex.printStackTrace();}
    }
    
    private boolean AlreadyAnswer()
    {
        try
        {
            String query = "SELECT `givenAnswer` FROM eg_exam WHERE Question = '"+jLabel2.getText()+"'";
            stat = con.prepareStatement(query);
            ResultSet res= stat.executeQuery(query);
            while(res.next())
            {
                answer = res.getString("givenAnswer");
                if(answer == null)
                {
                    return false;
                }
                break;
            }
            if(r1.getText().equals(answer))
            {
                r1.setSelected(true);
               //r1.setForeground(new java.awt.Color(255, 51, 51));
            }
            else if(r2.getText().equals(answer))
            {
                 r2.setSelected(true);
            }
             else if(r3.getText().equals(answer))
            {
                 r3.setSelected(true);
            }
             else if(r4.getText().equals(answer))
            {
                 r4.setSelected(true);
            }
             
        }catch(SQLException ex){
            System.out.print("Exception caught");
            ex.printStackTrace();}
        return true;
    }
    
    public void connect()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root", "Prbarik528@gmail.com");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void LoadQuestion()
    {
        String query="SELECT * FROM online_exam.eg_exam where course_code = 28";
        Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query);
            while(rs.next())
            {
              //  jLabel3.setText(rs.getString(1));
                jLabel2.setText(rs.getString(2));
                r1.setText(rs.getString(3));
                r2.setText(rs.getString(4));
                r3.setText(rs.getString(5));
                r4.setText(rs.getString(6));
                
                cor =rs.getString(7);
               
                break;
               
            }
            
               
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
        public void Loaddnmane()
    {
        
        //String id=  JOptionPane.showInputDialog(rootPane, "enter your id");
        String query1 = " SELECT * FROM online_exam.student WHERE id = '"+id+"'";
        Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query1);
            while(rs.next())
            {
              //  txt.setText(rs.getString(2));
                
                
                break;
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
          public void Loaddnmane1()
    {
         try{
             
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Prbarik528@gmail.com");
                if(con!=null){ System.out.println("CONNECTION OK......");}
      else{ System.out.println("TRY AGAIN NO CONNECTION !!!!!!!!");} 
             Statement st = con.createStatement();
                
                ResultSet rs = st.executeQuery("SELECT image FROM `online_exam`.`student` WHERE id = '"+id+"'");
                
                if(rs.next()){
                          
                    System.out.print("exit");
                    
                    byte[] img = rs.getBytes("image");

                       

                    //Resize The ImageIcon
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
//                    Image myImg = im.getScaledInstance(lb1.getWidth(),lb1.getHeight(),Image.SCALE_SMOOTH);
                  //  ImageIcon newImage = new ImageIcon(myImg);
                  //  lb1.setIcon(newImage);
                    
                }
                
                else{
                    System.out.print("not exit");
                    JOptionPane.showMessageDialog(null, "No Data");
                    
                }
            }catch(Exception ex){
                ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        r4 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        next = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        r4.setText("jRadioButton1");

        r3.setText("jRadioButton1");

        r1.setText("jRadioButton1");

        r2.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3)
                    .addComponent(r1)
                    .addComponent(r4)
                    .addComponent(r2))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(r2)
                .addGap(18, 18, 18)
                .addComponent(r3)
                .addGap(15, 15, 15)
                .addComponent(r4)
                .addGap(98, 98, 98))
        );

        jLabel2.setText("jLabel1");

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(next))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next)
                        .addGap(192, 192, 192))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
           if(anscheck())
        {
            try{
                if(rs.next())
                {
                   
                    jLabel2.setText(rs.getString("Question"));
                    r1.setText(rs.getString(3));
                    r2.setText(rs.getString(4));
                    r3.setText(rs.getString(5));
                    r4.setText(rs.getString(6));
                    cor=rs.getString(7);
                    // txt.setText(rs.getString(2));
                    
                    if(!AlreadyAnswer())
                    {
                       
                        buttonGroup1.clearSelection();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "this is frist record of student");
                    }
                }
                
            }catch(Exception e){e.printStackTrace();}
        }
        
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(testtttt_for_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testtttt_for_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testtttt_for_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testtttt_for_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testtttt_for_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables
}
