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
 * 4.	Nhập vào một chuỗi, Đếm ký tự và số xuất hiện trong một chuỗi
Ví dụ: “Nam nay la nam 2017” → 11 ký tự và 4 số

 */
public class Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static int countChar(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                count++;
            }
        }
        return count;
    }
    public static int countNumber(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        
        System.out.println("Dem so ky tu trong chuoi String: " + countChar(str));
        System.out.println("Dem so chu so trong chuoi String: " + countNumber(str));
    }
}