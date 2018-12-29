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
 * Câu 1: Viết chương trình giải phương trình bậc nhất: ax + b = 0
Đầu vào: nhập 2 số a, b (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
 * 
 */
public class Bai4 {
    public static void main(String[] args) {
        float a, b, x;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number a: ");
        a = scanner.nextFloat();
        System.out.print("Number b:");
        b = scanner.nextFloat();
        
        if(a != 0){
            x = -b/a;
            System.out.println("x: " + x);            
        }else{            
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }            
        }
    }    
}
