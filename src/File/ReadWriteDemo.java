/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author genharunari
 */
public class ReadWriteDemo {
    
    //
    private static String readFileByte(String path){
        String content = "";
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(path);
            int ch = fis.read();
            while(ch != -1){
                content += (char)ch;
                ch = fis.read();
            }
            return content;
        }catch(IOException e){
            return null;
        }finally{
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException ex){}
            }
        }
    }
    
    //FileReader
    
    private static String readFileChar(String path){
        String content = "";
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(path);
            int ch = fileReader.read();
            while(ch != -1){
                content += (char)ch;
                ch = fileReader.read();
            }
            return content;
        }catch(IOException e){
            return null;
        }finally{
            if(fileReader != null){
                try{
                    fileReader.close();
                }catch(IOException ex){}
            }
        }
    }
    
    private static void writeFileByte(String path, String content){
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(path);
            byte[] array = content.getBytes();
            fos.write(array);
        }catch(Exception e){
            System.out.println("Ghi loi");
        }finally{
            if(fos != null){
                try{
                    fos.close();
                }catch(Exception ex){}
            }
        }
    }
    
    public static void main(String[] args) {
        writeFileByte("src/file/Out.txt", "Tôi Tên Là");
        String str = readFileChar("src/file/Out.txt");
        if(str != null){
            System.out.println(str);
        }else{
            System.out.println("Loi doc file");
        }
    }
}
