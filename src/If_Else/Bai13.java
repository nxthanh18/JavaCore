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
 * Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0
Đầu vào: nhập 3 số a, b, c  (a, b, c là số bất kỳ)
Đầu ra: nghiệm của phương trình
Hướng dẫn: 
	Nếu a # 0 thì trở thành phương trình bậc 2 (chuẩn)
	Ngược lại, thì trở thành phương trình bậc nhất

 */
public class Bai13 {
    public static void main(String[] args) {
        float a, b, c, d ,x ,x1 , x2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("So a: ");
        a = scanner.nextFloat();
        System.out.print("So b: ");
        b = scanner.nextFloat();
        System.out.print("So c: ");
        c = scanner.nextFloat();
                       
        if(a == 0){
            if(b != 0){
                x = -c/b;
                System.out.println("x la: " + x);
            }else if (b == 0 && c == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            d = b*b- 4*a*c;
            if(d < 0){
            System.out.println("Phuong trinh vo nghiem");
            }else if(d == 0){
                x1 = -b/(2*a);
                x2 = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep la: " + x1);
            }else if(d > 0){
                x1 = (float) ((-b + Math.sqrt(d))/2*a);
                x2 = (float) ((-b -Math.sqrt(d))/2*a);
                System.out.println("x1 la: " + x1);
                System.out.println("x2 la: " + x2);
            }
        }            
    }    
}
