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
 import java.io.File;
 
public class CreateDirectoryExample {
     
    private static final String FOLDER ="C:\\Users\\Dell\\Desktop\\ONLINE_Exam_Record";
 
    public static void main(String[] args) {
         
        File newFolder = new File(FOLDER);
         
        boolean created =  newFolder.mkdir();
         
        if(created)
            System.out.println("Folder was created !");
        else
            System.out.println("Unable to create folder");
    }
}