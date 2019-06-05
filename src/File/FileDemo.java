/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author genharunari
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("F:\\Java core\\BaiTap\\BaiTap\\src\\File");
        
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        
        File file1 = new File("C:\\Java\\Java04");
        if(file1.exists()){//kiem tra file ton tai
            System.out.println("Da ton tai");
            //file1.delete();
        }else{
            if(file1.mkdirs()){//tao thu muc
                System.out.println("Tao thanh cong: " + file1.getAbsolutePath());
            }else{
                System.out.println("Khong the tao: " + file1.getAbsolutePath());
            }
        }
        
        File file2 = new File("C:/Java/Java05/student.txt");
        File parent = file2.getParentFile();
        if (parent.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException ex) {
                System.out.println("Khong the tao tep tin");
            }
        } else {
            parent.mkdirs();
            try {
                file2.createNewFile();
            } catch (IOException ex) {
                System.out.println("Khong the tao tep tin");
            }
        }
        //file2.delete();
        file2.renameTo(parent);
    }
}