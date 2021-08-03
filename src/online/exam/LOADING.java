/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.exam;

/**
 *
 * @author Pramod
 */
public class LOADING extends javax.swing.JFrame {

    /**
     * Creates new form LOADING
     */
    public LOADING() {
        initComponents();
      
    }
   
    
   
public static void loadingg()
{
     LOADING Splash = new LOADING();
        Splash.setVisible(true);
        
        try
        {
            int i;
              for( i=0; i<=10; i++)
            {
                Thread.sleep(80);
               
            Splash.txt1.setText("L");
             // Splash.bar.setValue(i);
            }
            
            
            for( i=10; i<=20; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("please wait.............."); 
               Splash.txt2.setText("O");
              Splash.txt20.setText("prbarik528@gmail.com");
              Splash.txt21.setText("prbarik528@gmail.com");
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
              
            for( i=20; i<=30; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("checking database connection..");
                Splash.txt3.setText("A");
                Splash.txt23.setText("Pramod Kumar Barik");
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
            for( i=30; i<=40; i++)
            {
             
           //load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/loading1.jpg")));
                Thread.sleep(80);
               Splash.txt.setText(" databse connection is successful.."); 
               
               Splash.txt4.setText("D");
               Splash.txt25.setText("9337812847 / 7787900528");
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
            
           Thread.sleep(900);
            for( i=40; i<=50; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("Initialising all module.............."); 
                Splash.txt5.setText("I");
              
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
             for( i=50; i<=60; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("please wait.............."); 
               Splash.txt6.setText("N");
               
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
             for( i=60; i<=70; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("successfully Initialised...."); 
               Splash.txt7.setText("G");
              
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
             for( i=70; i<=80; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("please wait.............."); 
               Splash.txt8.setText(".");
               
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
             for( i=80; i<=90; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText(".....System developed By Prammod....."); 
               Splash.txt9.setText(".");
            
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
             for( i=90; i<=95; i++)
            {
               
                Thread.sleep(80);
               Splash.txt.setText("All setting are done........"); 
               Splash.txt10.setText(".");
             
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
             
            
            }
           
            Thread.sleep(900);
            
           for( i=95; i<=100; i++)
            {
                              
                Thread.sleep(80);
               Splash.txt.setText("Loading the online examination system"); 
               Splash.txt11.setText("welcome the online examination system");
              
               Splash.num.setText(Integer.toString(i)+ "%");
               Splash.bar.setValue(i);
               //Thread.sleep(600);
                  if(i==100)
            {
                  Thread.sleep(1300);
               Splash.dispose();
                 new welcome().setVisible(true);
                   System.out.println("successfully work");
            }
           
            }
            // Thread.sleep(1000);
            
        }catch(Exception e){ }
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt21 = new javax.swing.JLabel();
        txt23 = new javax.swing.JLabel();
        txt25 = new javax.swing.JLabel();
        txt22 = new javax.swing.JLabel();
        txt24 = new javax.swing.JLabel();
        txt20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        load = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt21.setBackground(new java.awt.Color(255, 255, 0));
        txt21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt21.setText(" ");
        txt21.setOpaque(true);
        getContentPane().add(txt21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        txt23.setBackground(new java.awt.Color(255, 255, 51));
        txt23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt23.setText(" ");
        txt23.setToolTipText("");
        txt23.setOpaque(true);
        getContentPane().add(txt23, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, -1, -1));

        txt25.setBackground(new java.awt.Color(255, 255, 51));
        txt25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt25.setText(" ");
        txt25.setOpaque(true);
        getContentPane().add(txt25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, -1));

        txt22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/output-onlinepngtools (11).png"))); // NOI18N
        txt22.setText(" ");
        getContentPane().add(txt22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 40, 40));

        txt24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/output-onlinepngtools (10).png"))); // NOI18N
        txt24.setText(" ");
        getContentPane().add(txt24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, -1, -1));

        txt20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/output-onlinepngtools (9).png"))); // NOI18N
        txt20.setText(" ");
        getContentPane().add(txt20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 50, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("The Computer Base Test");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ONLINE EXAMINATION APPLICATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" ");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 20, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" ");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 10, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" ");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 30, 20));

        txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt.setForeground(new java.awt.Color(0, 255, 255));
        txt.setText(" ");
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 460, 30));

        num.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        num.setForeground(new java.awt.Color(255, 255, 0));
        num.setText(" 99%");
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 80, 50));

        txt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 51, 0));
        txt1.setText(" ");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 50, 40));

        txt2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 51, 0));
        txt2.setText(" ");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 50, 40));

        txt3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 51, 0));
        txt3.setText(" ");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 60, 40));

        txt4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 51, 0));
        txt4.setText(" ");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 60, 40));

        txt5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 51, 0));
        txt5.setText(" ");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 50, 60));

        txt6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 51, 0));
        txt6.setText(" ");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 60, -1));

        txt7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 51, 0));
        txt7.setText(" ");
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 50, 40));

        txt8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt8.setForeground(new java.awt.Color(255, 0, 0));
        txt8.setText(" ");
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 30, -1));

        txt9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt9.setForeground(new java.awt.Color(255, 0, 0));
        txt9.setText(" ");
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        txt10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txt10.setForeground(new java.awt.Color(255, 0, 0));
        txt10.setText(" ");
        getContentPane().add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 20, -1));

        txt11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txt11.setForeground(new java.awt.Color(51, 255, 255));
        txt11.setText(" ");
        getContentPane().add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(51, 255, 51));
        bar.setToolTipText(" ");
        bar.setOpaque(true);
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 920, -1));

        load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online/exam/image/loading2.jpg"))); // NOI18N
        load.setText(" ");
        getContentPane().add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOADING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LOADING().setVisible(true);
                
            }
        });
        loadingg();
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel load;
    private javax.swing.JLabel num;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt20;
    private javax.swing.JLabel txt21;
    private javax.swing.JLabel txt22;
    private javax.swing.JLabel txt23;
    private javax.swing.JLabel txt24;
    private javax.swing.JLabel txt25;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
