/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.exam;
import java.awt.Image;
import  java.io.*;  
import  java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell; 

/**
 *
 * @author Pramod
 */
public final class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        connect();
        Loaddnmane();
        Loaddnmane11();
        Loaddnmane111();
        
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement stat;
    private static final String FOLDER ="C:\\Users\\Dell\\Desktop\\ONLINE_Exam_Record\\";
     String RegdID= JOptionPane.showInputDialog("enter your RegdID");
   
    public void connect()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root", "Prbarik528@gmail.com");
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  public void Loaddnmane11()
    {
        
       
         
        String query1 = "SELECT * FROM online_exam.admin WHERE RegdID = '"+RegdID+"'";
       Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query1);
            
           
            while(rs.next())
            {
                txttt.setText(rs.getString(2));
                
                
           break;
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    public void Loaddnmane()
    {
         try{
             String txt1 = txt.getText();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Prbarik528@gmail.com");
                if(con!=null){ System.out.println("CONNECTION OK......");}
      else{ System.out.println("TRY AGAIN NO CONNECTION !!!!!!!!");} 
             Statement st = con.createStatement();
                
                ResultSet rs = st.executeQuery("SELECT image FROM `online_exam`.`admin` WHERE RegdID = '"+RegdID+"'");
                
                if(rs.next()){
                          
                    System.out.print("exit");
                   // txttt.setText(rs.getString(2));
                    byte[] img = rs.getBytes("image");

                       

                    //Resize The ImageIcon
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(lb1.getWidth(),lb1.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    lb1.setIcon(newImage);
                    
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

        txttt = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qc = new javax.swing.JLabel();
        srec = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        take = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        regd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txttt.setForeground(new java.awt.Color(204, 0, 0));
        txttt.setText(" ");
        getContentPane().add(txttt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 30));

        lb1.setText(" ");
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 120));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("       DashBoard");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/adminn-removebg-preview.png"))); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setText(" ");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 190));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText(" Copyright ?? Online Examination System ?? Pramod kumar barik Development ???");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        qc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/que+blue.png"))); // NOI18N
        qc.setText(" ");
        qc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                qcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                qcMouseExited(evt);
            }
        });
        getContentPane().add(qc, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, 40));

        srec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/srec+blue.png"))); // NOI18N
        srec.setText("  ");
        srec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                srecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                srecMouseExited(evt);
            }
        });
        getContentPane().add(srec, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/std.png"))); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exam-removebg-preview.png"))); // NOI18N
        jLabel4.setText(" ");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/a+yellow.png"))); // NOI18N
        admin.setText(" ");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -10, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/Logout+aa.png"))); // NOI18N
        logout.setText(" ");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, 40));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/sl+aa.png"))); // NOI18N
        login.setText(" ");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 50));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/home+aa.png"))); // NOI18N
        home.setText(" ");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        take.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        take.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/te+aa.png"))); // NOI18N
        take.setText(" ");
        take.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                takeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                takeMouseExited(evt);
            }
        });
        getContentPane().add(take, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/aq+aa.png"))); // NOI18N
        add.setText(" ");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        regd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/sr+aa.png"))); // NOI18N
        regd.setText(" ");
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
        getContentPane().add(regd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close2.png"))); // NOI18N
        jLabel8.setText(" ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("search");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 90, 30));

        txt.setBackground(new java.awt.Color(255, 0, 255));
        txt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt.setForeground(new java.awt.Color(0, 0, 153));
        txt.setText(" ");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 240, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Enetr Your Regd. ID to show your detail in dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        HOME.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin+bg.jpg"))); // NOI18N
        HOME.setText(" ");
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
         logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/Logout+aa1.png")));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
         logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/Logout+aa.png")));
    }//GEN-LAST:event_logoutMouseExited

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
         home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/home+aa.png")));
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
         home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/hm1.png")));
    }//GEN-LAST:event_homeMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        // TODO add your handling code here:
         add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/aq+aa.png")));
    }//GEN-LAST:event_addMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        // TODO add your handling code here:
         add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/aq1.png")));
    }//GEN-LAST:event_addMouseEntered

    private void takeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeMouseExited
        // TODO add your handling code here:
        take.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/te+aa.png")));
    }//GEN-LAST:event_takeMouseExited

    private void takeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeMouseEntered
        // TODO add your handling code here:
        take.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/te1.png")));
    }//GEN-LAST:event_takeMouseEntered

    private void regdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseExited
        // TODO add your handling code here:
         regd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/sr+aa.png"))); 
    }//GEN-LAST:event_regdMouseExited

    private void regdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseEntered
        // TODO add your handling code here:
         regd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/sr1.png"))); 
    }//GEN-LAST:event_regdMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        // TODO add your handling code here:
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/sl+aa.png")));
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        // TODO add your handling code here:
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/sl1.png")));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
         new Student_login().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_loginMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
          new welcome().setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void takeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeMouseClicked
        // TODO add your handling code here:
         new Test().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_takeMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
         new subject().setVisible(true);
       // new Questions().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addMouseClicked

    private void regdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseClicked
        // TODO add your handling code here:
         new student().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_regdMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        new admin_login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        // TODO add your handling code here:
         admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/a+yellow.png")));
    }//GEN-LAST:event_adminMouseExited

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        // TODO add your handling code here:
         admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/a+blue.png")));
    }//GEN-LAST:event_adminMouseEntered

    private void srecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srecMouseExited
        // TODO add your handling code here:
        srec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/srec+blue.png"))); 
    }//GEN-LAST:event_srecMouseExited

    private void srecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srecMouseEntered
        // TODO add your handling code here:
        srec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/srec+yellow.png"))); 
    }//GEN-LAST:event_srecMouseEntered

    private void qcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qcMouseExited
        // TODO add your handling code here:
         qc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/que+blue.png")));
    }//GEN-LAST:event_qcMouseExited

    private void qcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qcMouseEntered
        // TODO add your handling code here:
         qc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/quue+yellow.png")));
    }//GEN-LAST:event_qcMouseEntered

    private void srecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srecMouseClicked
        // TODO add your handling code here:
        
        
        
         try{
             
              File newFolder = new File(FOLDER);
         
        boolean created =  newFolder.mkdir();
         
      
             
      
         
String filename="Student_Record.xls" ;
File file=new File(FOLDER+filename);  
HSSFWorkbook hwb=new HSSFWorkbook();
HSSFSheet sheet =  hwb.createSheet("new sheet");

HSSFRow rowhead=   sheet.createRow((short)0);
rowhead.createCell((short) 0).setCellValue("id");
rowhead.createCell((short) 1).setCellValue("SName");
rowhead.createCell((short) 2).setCellValue("phone");
rowhead.createCell((short) 3).setCellValue("address");
rowhead.createCell((short) 4).setCellValue("age");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root", "Prbarik528@gmail.com");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM online_exam.student");
int i=1;
while(rs.next()){
HSSFRow row=   sheet.createRow((short)i);
row.createCell((short) 0).setCellValue(Integer.toString(rs.getInt("id")));
row.createCell((short) 1).setCellValue(rs.getString("SName"));
 
row.createCell((short) 2).setCellValue(Integer.toString(rs.getInt("phone")));

row.createCell((short) 3).setCellValue(rs.getString("address"));
row.createCell((short) 4).setCellValue(Integer.toString(rs.getInt("age")));
i++;
}
FileOutputStream fileOut =  new FileOutputStream(file);
hwb.write(fileOut);
fileOut.close();
System.out.println("Your excel file has been generated!");
JOptionPane.showMessageDialog(this, "Sucessfully download EXCEL File");

} catch ( IOException | ClassNotFoundException | SQLException ex ) {
    System.out.println(ex);

}
        
        
        
    }//GEN-LAST:event_srecMouseClicked

    private void qcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qcMouseClicked
        // TODO add your handling code here:
        
              try{
             
              File newFolder = new File(FOLDER);
         
        boolean created =  newFolder.mkdir();
         
      
             
      
         
String filename="question_SET.xls" ;
File file=new File(FOLDER+filename);  
HSSFWorkbook hwb=new HSSFWorkbook();
HSSFSheet sheet =  hwb.createSheet("new sheet");

HSSFRow rowhead=   sheet.createRow((short)0);
rowhead.createCell((short) 0).setCellValue("id");
rowhead.createCell((short) 1).setCellValue("Question");
rowhead.createCell((short) 2).setCellValue("option1");
rowhead.createCell((short) 3).setCellValue("option2");
rowhead.createCell((short) 4).setCellValue("option3");
rowhead.createCell((short) 5).setCellValue("option4");
rowhead.createCell((short) 6).setCellValue("answer");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root", "Prbarik528@gmail.com");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM online_exam.question");
int i=1;
while(rs.next()){
HSSFRow row=   sheet.createRow((short)i);
row.createCell((short) 0).setCellValue(Integer.toString(rs.getInt("id")));
row.createCell((short) 1).setCellValue(rs.getString("Question"));
 
 row.createCell((short) 2).setCellValue(rs.getString("option1"));
 row.createCell((short) 3).setCellValue(rs.getString("option2"));
 row.createCell((short) 4).setCellValue(rs.getString("option3"));
 row.createCell((short) 5).setCellValue(rs.getString("option4"));
 

row.createCell((short) 6).setCellValue(rs.getString("answer"));
 
i++;
}
FileOutputStream fileOut =  new FileOutputStream(file);
hwb.write(fileOut);
fileOut.close();
System.out.println("Your excel file has been generated!");
JOptionPane.showMessageDialog(this, "Sucessfully download EXCEL File");

} catch ( IOException | ClassNotFoundException | SQLException ex ) {
    System.out.println(ex);

}
        
        
    }//GEN-LAST:event_qcMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog( HOME,"confirm if you Want to Exit","ONLINE EXAMINATION APPLICATIOM",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    public void Loaddnmane111()
    {
       String txt1 = txt.getText();
        String query1 = "SELECT * FROM online_exam.admin WHERE RegdID = '"+txt1+"'";
       Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query1);
            
           
            while(rs.next())
            {
                txttt.setText(rs.getString(2));
                
                
           break;
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Loaddnmane();
        //String query1 = "SELECT * FROM online_exam.admin WHERE RegdID = '"+RegdID+"'";
       //Statement stat=null;
      
           Loaddnmane111();
            
        
          try{
               //stat=con.createStatement();
            //rs = stat.executeQuery(query1);
             String txt1 = txt.getText();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Prbarik528@gmail.com");
                if(con!=null){ System.out.println("CONNECTION OK......");}
      else{ System.out.println("TRY AGAIN NO CONNECTION !!!!!!!!");} 
             Statement st = con.createStatement();
                
                ResultSet rs = st.executeQuery("SELECT image FROM `online_exam`.`admin` WHERE RegdID = '"+txt1+"'");
                
                if(rs.next()){
                          
                    System.out.print("exit");
                   // txttt.setText(rs.getString(2));
                    byte[] img = rs.getBytes("image");

                       

                    //Resize The ImageIcon
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(lb1.getWidth(),lb1.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    lb1.setIcon(newImage);
                    
                   // txttt.setText(rs.getString(2));
                    //break;
                }
                
                else{
                    System.out.print("not exit");
                    JOptionPane.showMessageDialog(null, "No Data");
                    
                }
              
                
            }catch(Exception ex){
                ex.printStackTrace();
            }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel add;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel qc;
    private javax.swing.JLabel regd;
    private javax.swing.JLabel srec;
    private javax.swing.JLabel take;
    private javax.swing.JTextField txt;
    private javax.swing.JLabel txttt;
    // End of variables declaration//GEN-END:variables
}
