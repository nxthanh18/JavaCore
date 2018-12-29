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
 * Viết chương trình giải hệ phương trình bậc nhất 2 ẩn
ax + by = c
dx + ey = f
Đầu vào: nhập 6 số: a, b, c, d, e, f
Đầu ra: nghiệm của hệ phương trình
Hướng dẫn:
	dinhthuc = a*e – d*b
	dx = c*e – f*b
	dy = a*f – d*c
	Nếu dinhthuc # 0 thì hệ phương trình có nghiệm:
		x = dx/dinhthuc;
		y = dy/dinhthuc;
	Ngược lại, nếu dx #0 hoặc dy # 0  thì hệ phương trình vô nghiệm
	Ngược lại, hệ phương trình vô số nghiệm

 */
public class Cau4 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, x, y, dt, dx, dy;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("So a: ");
        a = scanner.nextInt();
        System.out.print("So b: ");
        b = scanner.nextInt();
        System.out.print("So c: ");
        c = scanner.nextInt();
        System.out.print("So d: ");
        d = scanner.nextInt();
        System.out.print("So e: ");
        e = scanner.nextInt();
        System.out.print("So f: ");
        f = scanner.nextInt();
        
        dt = a*e - d*b;
        dx = c*e - f*b;
        dy = a*f - d*c;
        
        if(dt != 0){
            x = dx/dt;
            y = dy/dt;
            System.out.println("Nghiem x la: " + x);
            System.out.println("Nghiem y la: " + y);
        }else{
            System.out.println("Phuong trinh vo so nghiem");
        }
    }
}
