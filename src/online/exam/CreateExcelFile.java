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
import  java.io.*;  
import  java.sql.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell;  

public class CreateExcelFile{
    public static void main(String[]args){
try{
String filename="D://data11pramod1234.xls" ;
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
FileOutputStream fileOut =  new FileOutputStream(filename);
hwb.write(fileOut);
fileOut.close();
System.out.println("Your excel file has been generated!");

} catch ( Exception ex ) {
    System.out.println(ex);

}
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
