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
 * 6.	Nhập vào một chuỗi. In ra màn hình chuỗi:
●	Đã loại bỏ hết tất cả các kí tự không thuộc a - z, A-Z  trong chuỗi đầu vào.
●	Viết hoa ký tự đầu tiên của mỗi từ.
Ví dụ:
"a1b2c3d4 a1b2c3d4" ---> Output: Abcd Abcd
Are you 25 years old? ---> Output: Are You  Years Old?

 */
public class Bai6 {
    public static Scanner sc = new Scanner(System.in);
    public static String upperWord(String str){
        String content = "";
        char distance = 'a' - 'A';
        char ch = str.charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - distance);
        }
        content += ch;
        
        for(int i = 1; i < str.length(); i++){
            char chBefore = str.charAt(i - 1);
            ch = str.charAt(i);
            if(chBefore == ' ' && (ch >= 'a' && ch <= 'z')){
                ch = (char)(ch - distance);
            }
            content += ch;
        }        
        return content;
    }
    // Cach 1 - Ham tu lam
    public static String removeChar(String str){
        String content = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch == ' ') || ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
                content += ch;
            }            
        }
        return content;
    }
    // Cach 2 - Ham co san
    public static String removeNonLetter(String str){
        String content = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch) || Character.isLetter(ch)){
                content += ch;
            }
        }
        return content;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        str = upperWord(str);
        str = removeChar(str);
        System.out.println("Output a String: " + str);
    }
}