/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.exam;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Question
     */
    javax.swing.Timer timer;
    int SEC;
    int MIN;
    public Test() {
        initComponents();
        connect();
        TIMER();
         LoadSUBNAME();
        Loaddnmane1();
        Loaddnmane() ;
        LoadQuestion();
      
        
       //  Loaddnmane() ;
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
    String id1= JOptionPane.showInputDialog("enter your subject code");
    
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
            txtmark.setText(String.valueOf(mark));
        }
        else if(!answerAnswer.equals(cor)&&answer!=null)
        {
            
            if(mark>0)
            {
                mark=mark-1;
            }
            txtmark.setText(String.valueOf(mark));
        }
        if(!answerAnswer.equals(""))
        {
            try{
                String query ="UPDATE `online_exam`.`question` SET `givenAnswer` = ? WHERE `Question` = ?";
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
            String query ="UPDATE `online_exam`.`question` SET `givenAnswer` = ?";
            pst = con.prepareStatement(query);
            pst.setString(1,null);
            pst.execute();
            
        }catch (Exception ex){ex.printStackTrace();}
    }
    
    private boolean AlreadyAnswer()
    {
        try
        {
            String query = "SELECT `givenAnswer` FROM question WHERE Question = '"+jLabel2.getText()+"'";
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
        String query="SELECT * FROM online_exam.question where code = '"+id1+"'";
        Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query);
            while(rs.next())
            {
                jLabel3.setText(rs.getString(1));
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
    
    //TIMER FUNCTION
      public void TIMER()
    {
        
        //String id=  JOptionPane.showInputDialog(rootPane, "enter your id");
        String query1 = "SELECT * FROM online_exam.subject WHERE code = '"+id1+"'";
         //String query1 = "SELECT * FROM aa.timer WHERE timer = 1";
        
        Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query1);
            while(rs.next())
            {
                String time;
               // aa.setText(rs.getString(1));
                 time = rs.getString(3);
                 int i=Integer.parseInt(time);  
                if(i==10)
                {
                     SEC = 10;
        //set menit awal
        MIN = 0;
                    System.out.println("execute");
                    //JOptionPane.showMessageDialog(this, "successfully work");
                     timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set label detik untuk penambahan teks 0
                if(SEC<10)
                    N.setText("0"+SEC);
                else
                    N.setText(""+SEC);
                //set label menit untuk penambahan teks 0
                if(MIN<10)
                    M.setText("0"+MIN);
                else
                    M.setText(""+MIN);
                //menit berkurang jika detik==0
                if(SEC==0){
                    MIN--;
                    //jika menit <0 maka waktu habis
                    if(MIN<0){
                        JOptionPane.showMessageDialog(null,"your time is over");
                        LAST.setVisible(true);
                        LAST1.setVisible(true);
                         LAST2.setVisible(true);
                        timer.stop();
                         HOME.setEnabled(false);
                        //System.exit(0);
                    }
                    SEC = 60;
                }
                SEC--;
            }
        });
        timer.start();
                }
                
                else if(i==15)
                {
                        SEC = 0;
        //set menit awal
        MIN = 15;
                    System.out.println("execute");
                    //JOptionPane.showMessageDialog(this, "successfully work");
                     timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set label detik untuk penambahan teks 0
                if(SEC<10)
                    N.setText("0"+SEC);
                else
                    N.setText(""+SEC);
                //set label menit untuk penambahan teks 0
                if(MIN<10)
                    M.setText("0"+MIN);
                else
                    M.setText(""+MIN);
                //menit berkurang jika detik==0
                if(SEC==0){
                    MIN--;
                    //jika menit <0 maka waktu habis
                    if(MIN<0){
                        JOptionPane.showMessageDialog(null,
                            "Waktu Habis, Aplikasi Keluar Otomatis");
                        LAST.setVisible(true);
                        LAST1.setVisible(true);
                         LAST2.setVisible(true);
                        timer.stop();
                        HOME.setEnabled(false);
                        //System.exit(0);
                    }
                    SEC = 60;
                }
                SEC--;
            }
        });
        timer.start();
                
                }
                
                 else if(i==30)
                {
                        SEC = 0;
        //set menit awal
        MIN = 30;
                    System.out.println("execute");
                    //JOptionPane.showMessageDialog(this, "successfully work");
                     timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set label detik untuk penambahan teks 0
                if(SEC<10)
                    N.setText("0"+SEC);
                else
                    N.setText(""+SEC);
                //set label menit untuk penambahan teks 0
                if(MIN<10)
                    M.setText("0"+MIN);
                else
                    M.setText(""+MIN);
                //menit berkurang jika detik==0
                if(SEC==0){
                    MIN--;
                    //jika menit <0 maka waktu habis
                    if(MIN<0){
                        JOptionPane.showMessageDialog(null,
                            "Waktu Habis, Aplikasi Keluar Otomatis");
                        LAST.setVisible(true);
                        LAST1.setVisible(true);
                         LAST2.setVisible(true);
                        timer.stop();
                        HOME.setEnabled(false);
                        //System.exit(0);
                    }
                    SEC = 60;
                }
                SEC--;
            }
        });
        timer.start();
                
                }
                 else if(i==45)
                {
                        SEC = 0;
        //set menit awal
        MIN = 45;
                    System.out.println("execute");
                    //JOptionPane.showMessageDialog(this, "successfully work");
                     timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set label detik untuk penambahan teks 0
                if(SEC<10)
                    N.setText("0"+SEC);
                else
                    N.setText(""+SEC);
                //set label menit untuk penambahan teks 0
                if(MIN<10)
                    M.setText("0"+MIN);
                else
                    M.setText(""+MIN);
                //menit berkurang jika detik==0
                if(SEC==0){
                    MIN--;
                    //jika menit <0 maka waktu habis
                    if(MIN<0){
                        JOptionPane.showMessageDialog(null,
                            "Waktu Habis, Aplikasi Keluar Otomatis");
                        LAST.setVisible(true);
                        LAST1.setVisible(true);
                         LAST2.setVisible(true);
                        timer.stop();
                        HOME.setEnabled(false);
                        //System.exit(0);
                    }
                    SEC = 60;
                }
                SEC--;
            }
        });
        timer.start();
                
                }
                         else if(i==60)
                {
                        SEC = 0;
        //set menit awal
        MIN = 60;
                    System.out.println("execute");
                    //JOptionPane.showMessageDialog(this, "successfully work");
                     timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set label detik untuk penambahan teks 0
                if(SEC<10)
                    N.setText("0"+SEC);
                else
                    N.setText(""+SEC);
                //set label menit untuk penambahan teks 0
                if(MIN<10)
                    M.setText("0"+MIN);
                else
                    M.setText(""+MIN);
                //menit berkurang jika detik==0
                if(SEC==0){
                    MIN--;
                    //jika menit <0 maka waktu habis
                    if(MIN<0){
                        JOptionPane.showMessageDialog(null,
                            "YOUR TIME IS OVER");
                        LAST.setVisible(true);
                        LAST1.setVisible(true);
                         LAST2.setVisible(true);
                        timer.stop();
                        HOME.setEnabled(false);
                        //System.exit(0);
                    }
                    SEC = 60;
                }
                SEC--;
            }
        });
        timer.start();
                
                }
                 
                
                else
                {
                     System.out.println("try again");
                }
                break;
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
    
    
    
    
    public void LoadSUBNAME()
    {
        
        //String id=  JOptionPane.showInputDialog(rootPane, "enter your id");
        String query1 = "SELECT * FROM online_exam.subject WHERE code = '"+id1+"'";
        Statement stat=null;
        try {
            stat=con.createStatement();
            rs = stat.executeQuery(query1);
            while(rs.next())
            {
                SCODE.setText(rs.getString(1));
                SUB.setText(rs.getString(2));
                
                
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
                txt.setText(rs.getString(2));
                
                
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        LAST2 = new javax.swing.JButton();
        LAST1 = new javax.swing.JLabel();
        LAST = new javax.swing.JLabel();
        NO = new javax.swing.JButton();
        BT = new javax.swing.JButton();
        EXIST = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        txtmark = new javax.swing.JLabel();
        SUB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SCODE = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        HOME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LAST2.setBackground(new java.awt.Color(204, 0, 0));
        LAST2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        LAST2.setForeground(new java.awt.Color(255, 255, 0));
        LAST2.setText("OK");
        LAST2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LAST2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAST2ActionPerformed(evt);
            }
        });
        getContentPane().add(LAST2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 30, 30));

        LAST1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LAST1.setForeground(new java.awt.Color(255, 255, 0));
        LAST1.setText("Click 'OK' To Exist the system");
        getContentPane().add(LAST1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        LAST.setBackground(new java.awt.Color(0, 0, 153));
        LAST.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LAST.setForeground(new java.awt.Color(255, 204, 0));
        LAST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LAST.setText(" YOUR EXAM IS COMPLETED AND SUBMITED ");
        LAST.setOpaque(true);
        getContentPane().add(LAST, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 610, 360));

        NO.setBackground(new java.awt.Color(0, 204, 0));
        NO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NO.setText("NO");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        getContentPane().add(NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        BT.setBackground(new java.awt.Color(204, 0, 0));
        BT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BT.setText("YES");
        BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTActionPerformed(evt);
            }
        });
        getContentPane().add(BT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        EXIST.setBackground(new java.awt.Color(0, 0, 153));
        EXIST.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIST.setForeground(new java.awt.Color(255, 255, 0));
        EXIST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EXIST.setText(" ARE YOU SURE EXIST THE SYSTEM");
        EXIST.setOpaque(true);
        getContentPane().add(EXIST, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 540, 300));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText(" Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 70, -1));

        lb1.setText(" ");
        lb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, 100));

        txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(0, 0, 102));
        txt.setText(" ");
        txt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 150, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Online Test");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 51, 51));
        r1.setText("jRadioButton1");
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setText("jRadioButton2");
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r3.setText("jRadioButton3");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r4.setText("jRadioButton4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r4)
                    .addComponent(r3)
                    .addComponent(r2)
                    .addComponent(r1))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(r1)
                .addGap(18, 18, 18)
                .addComponent(r2)
                .addGap(18, 18, 18)
                .addComponent(r3)
                .addGap(18, 18, 18)
                .addComponent(r4)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 440, 260));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 68, 30));

        next.setBackground(new java.awt.Color(0, 0, 153));
        next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText("Save & Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        txtmark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmark.setForeground(new java.awt.Color(204, 0, 0));
        txtmark.setText("marks");
        getContentPane().add(txtmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        SUB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUB.setForeground(new java.awt.Color(0, 0, 153));
        SUB.setText(" ");
        SUB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(SUB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("SUBJECT :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        SCODE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SCODE.setText(" ");
        SCODE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(SCODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Course Code :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        N.setBackground(new java.awt.Color(0, 255, 255));
        N.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        N.setForeground(new java.awt.Color(204, 0, 0));
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText(" ");
        N.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 30, 30));

        M.setBackground(new java.awt.Color(0, 255, 255));
        M.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        M.setForeground(new java.awt.Color(204, 0, 0));
        M.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M.setText(" ");
        M.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 30, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Time Left :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Exist");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        HOME.setBackground(new java.awt.Color(0, 255, 255));
        HOME.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        HOME.setForeground(new java.awt.Color(204, 0, 0));
        HOME.setText(" ");
        HOME.setOpaque(true);
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

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

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
        // TODO add your handling code here:
        r2.setForeground(new java.awt.Color(255, 51, 51));
    }//GEN-LAST:event_r2MouseClicked

    private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
        // TODO add your handling code here:
        /* if(r1.isSelected())
        {
            //r1.setSelected(true);
            r1.setForeground(new java.awt.Color(255, 51, 51));
        }
        else
        { //r1.setSelected(false);
            r1.setForeground(new java.awt.Color(0, 51, 51));
        }
        */  //r1.setForeground(new java.awt.Color(255, 51, 51));
    }//GEN-LAST:event_r1MouseClicked

    private void LAST2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAST2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LAST2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LAST.setVisible(false);
        LAST1.setVisible(false);
        LAST2.setVisible(false);
        EXIST.setVisible(false);
        BT.setVisible(false);
        NO.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         EXIST.setVisible(true);
        BT.setVisible(true);
        NO.setVisible(true);
         
         //HOME.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BTActionPerformed

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
        // TODO add your handling code here:
         
        EXIST.setVisible(false);
        BT.setVisible(false);
        NO.setVisible(false);
    }//GEN-LAST:event_NOActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT;
    private javax.swing.JLabel EXIST;
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel LAST;
    private javax.swing.JLabel LAST1;
    private javax.swing.JButton LAST2;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JButton NO;
    private javax.swing.JLabel SCODE;
    private javax.swing.JLabel SUB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txtmark;
    // End of variables declaration//GEN-END:variables
}
