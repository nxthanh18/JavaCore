/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterString;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 9.	Đổi các từ ở đầu câu sang chữ hoa và những từ không phải đầu câu sang chữ thường. 
Ví dụ: nGuYen vAN a đổi thành: Nguyen Van A

 */
public class Bai9 {
    public static Scanner sc = new Scanner(System.in);
    public static String reduceWhileSpace(String str){
        str = str.trim();
        
        while(str.indexOf("  ") != -1){
            str = str.replaceAll("  "," ");
        }
        return str;
    }
    public static String standardName(String str){
        str = reduceWhileSpace(str);
        
        String content = "";
        
        Character ch = str.charAt(0);
        if(Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
        }
        content += ch;
        
        for(int i = 1; i < str.length(); i++){
            ch = str.charAt(i);
            char chBefore = str.charAt(i - 1);
            
            if(Character.isSpaceChar(chBefore) && (Character.isLowerCase(ch))){
                ch = Character.toUpperCase(ch);
            }else if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            content += ch;
        }
        return content;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        System.out.println("Output: " + standardName(str));
    }
}
