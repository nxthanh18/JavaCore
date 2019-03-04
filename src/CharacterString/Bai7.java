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
 * 7.	Viết hàm để tìm kiếm và xóa đi tất cả nguyên âm có trong câu.
Ví dụ: Hello --> a, e , o là nguyên âm --> Hll;

 */
public class Bai7 {
    public static Scanner sc = new Scanner(System.in);
    public static String findVowel(String str){
        String content = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'o' && ch != 'i' && ch != 'u'){
                content += ch;
            }
        }        
        return content;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        System.out.println("Output a String: " + findVowel(str));
    }
}
