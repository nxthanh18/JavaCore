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
 * 1.	Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1 sau đó in kết quả ra màn hình
 */
public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s1, s2, s3, s4;
        
        System.out.print("Input s1 = ");
        s1 = sc.nextLine();
        System.out.print("Input s2 = ");
        s2 = sc.nextLine();
        
        s3 = s1.concat(s2); // Cach 1
        System.out.println("Noi xau ky tu: " + s3);
        s4 = s1 + s2;       // Cach 2
        System.out.println("Noi xau ky tu: " + s4);
    }
}
