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
 * 2.	Nhập vào một chuỗi. In ra màn hình chuỗi in hoa bằng 2 cách
●	Sử dụng hàm có sẵn
●	Không sử dụng hàm có sẵn

 */
public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static String upperCaseString(String str){
        String upper = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char distance = 'a' - 'A';
                
                upper = upper + (char)(ch - distance); // thuong => HOA
            }else{
                upper = upper + ch;
            }
        }
        return upper;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String = ");
        str = sc.nextLine();
        
        // Cach 1
        
        System.out.println("Chuoi IN HOA - ham co san:");
        String strl = str.toUpperCase();
        System.out.println(strl);
        
        // Cach 2
        
        System.out.println("Chuoi IN HOA - Tu lam:");
        String str2 = upperCaseString(str);
        System.out.println(str2);
    }
}
