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
 * Create a method that reverse an input
 * Dao nguoc cac tu trong 1 cau: 
 * vidu: toi ten la --> la ten toi
 */
public class Bai12 {
    public static Scanner sc = new Scanner(System.in);
    public static String remoteWhiteSpace(String str){
        str = str.trim();
        while(str.indexOf("  ") != -1){
            str = str.replaceAll("  "," ");
        }        
        return str;
    }
    public static String reverseWord(String str){
        str = remoteWhiteSpace(str);
        
        String []array = str.split(" ");
        str = "";
        for(int i = array.length - 1; i >= 0; i--){
            str += array[i];
            if(i != 0){
                str += " ";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str;
        
        System.out.print("Input a String: ");
        str = sc.nextLine();
        
        System.out.println("Dao nguoc chuoi: " + reverseWord(str));
    }
}
