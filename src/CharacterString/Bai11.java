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
 * 11.	Nhập 1 chuỗi bất kì. Đếm xem có bao nhiêu từ
 */
public class Bai11 {
    public static Scanner sc = new Scanner(System.in);
    public static String remoteWhiteSpace(String str){
        str = str.trim();
        while(str.indexOf("  ") != -1){
            str = str.replaceAll("  "," ");
        }        
        return str;
    }
    public static int countWord(String str){
        str = remoteWhiteSpace(str);
        int count = 0;        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }        
        return count + 1;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        System.out.println("Dem so tu: " + countWord(str));
    }
}
