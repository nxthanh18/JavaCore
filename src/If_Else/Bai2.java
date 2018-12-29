/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_Else;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * 2.	Viết chương trình nhập vào một số kiểu số nguyên. In ra kết quả số đó là số dương hay số âm
 */
public class Bai2 {
    public static void main(String[] args) {
        long a;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = scanner.nextLong();
        
        if(a < 0 && a != 0){
            System.out.println("So a la so am");
        }
        else{
            System.out.println("So a la so duong");
        }
    }    
}
