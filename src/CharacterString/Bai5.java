/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterString;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * 5.	Nhập vào một chuỗi. Đổi những ký tự đầu tiên của mỗi từ thành chữ in hoa
 */
public class Bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static String upperWord(String str){
        String content = "";
        char distance = 'a' - 'A';
        // Doi ky tu dau tien neu co:
        char ch = str.charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - distance);
        }
        content += ch;
        
        for(int i = 1; i < str.length(); i++){
            ch = str.charAt(i);
            char chBefore = str.charAt(i - 1);
            if(chBefore == ' ' && (ch >= 'a' && ch <= 'z')){
                ch = (char)(ch - distance);
            }
            content += ch;
        }
        return content;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        System.out.println("Doi ky tu dau tien thanh chu IN HOA: " + upperWord(str));
    }
}
