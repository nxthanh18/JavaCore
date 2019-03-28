/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Câu 1: Viết chương trình giải phương trình bậc nhất: ax + b = 0
Đầu vào: nhập 2 số a, b (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
 * 
 */
public class Bai4ifelse {
    public static Scanner sc = new Scanner(System.in);
    public static void ptBacNhat(float a, float b){
        float x;
        
        if(a != 0){
            x = -b/a;
            System.out.println("nghiem x: " + x);            
        }else{            
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }            
        }
    }
    public static void main(String[] args) {
        System.out.print("Number a: ");
        float a = sc.nextFloat();
        System.out.print("Number b: ");
        float b = sc.nextFloat();
        
        ptBacNhat(a, b);
    }    
}
