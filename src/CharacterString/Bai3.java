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
 * 3.	Nhập vào một chuỗi. In ra màn hình chuỗi in thường bằng 2 cách
●	Sử dụng hàm có sẵn
●	Không sử dụng hàm có sẵn

 */
public class Bai3 {
    public static Scanner sc = new Scanner(System.in);
    public static String lowerCaseString (String str){
        String lower = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                int distance =  'A' - 'a';
                
                lower = lower + (char)(ch - distance); // HOA -> thuong
            }else{
                lower = lower + ch;
            }
        }
        return lower;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        System.out.println("Chuoi in thuong - Ham co san");
        String str1 = str.toLowerCase();
        System.out.println(str1);
        
        System.out.println("Chuoi in thuong - tu lam");
        String str2 = lowerCaseString(str);
        System.out.println(str2);
    }
}
