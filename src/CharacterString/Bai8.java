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
 * 8.	Nhập vào một chuỗi, hãy loại bỏ những khoảng trắng thừa trong chuỗi
 */
public class Bai8 {
    public static Scanner sc = new Scanner(System.in);
    public static String remoteWhiteSpace(String str){
        String content = "";
        for(int i = 0; i < str.length(); i++){         
            char ch = str.charAt(i);   
            char chBefore = str.charAt(i - 1);
            char chAfter = str.charAt(i + 1);
            if(ch == ' '){
                content += chAfter;
            }else{
                content += ch;
            }
        }      
        return content;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        System.out.println("Output: " + remoteWhiteSpace(str));
    }
}
