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
 * Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0 (a # 0)
Đầu vào: nhập 3 số a, b, c (a # 0) (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
Hướng dẫn: Sử dụng lớp Math.xxx() để sử dụng các hàm sẵn
	Ví dụ: Math.sqrt(123) tính căn bậc 2 của số 123	

 */
public class Bai12 {
    public static void main(String[] args) {
        float a, b, c, d ,x1 , x2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("So a: ");
        a = scanner.nextFloat();
        System.out.print("So b: ");
        b = scanner.nextFloat();
        System.out.print("So c: ");
        c = scanner.nextFloat();
        
        d = b*b- 4*a*c;
        
        if(d < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if(d == 0){
            x1 = -b/(2*a);
            x2 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep la: " + x1);
        }else {
            x1 = (float) ((-b + Math.sqrt(d))/2*a);
            x2 = (float) ((-b -Math.sqrt(d))/2*a);
            System.out.println("x1 la: " + x1);
            System.out.println("x2 la: " + x2);
        }
    }    
}