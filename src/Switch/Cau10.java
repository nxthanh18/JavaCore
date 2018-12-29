/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết chương trình in menu và thực hiện chức năng
	-------------------------TINH DIEN TICH--------------------------
	An 1. Dien tich hinh chu nhat
	An 2. Dien tich hinh tam giac
	An 3. Dien tich hinh vuong
	An 4. Dien tich hinh tron
	An 5. Dien tich hinh thang
	Chọn:
Mỗi chức năng nhập các hệ số tương ứng để thực hiện
	Ví dụ: Chọn: 1
	Chieu dai: 3
	Chieu rong: 4
	Dien tich hinh chu nhat la: 12

 */
public class Cau10 {
    public static void main(String[] args) {
        int n;
        double a, b, c, s;
        final float PI = 3.14f;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cac Chuc Nang Cua Chuong Trinh");
        System.out.println("Number 1: Tinh Dien Tich Hinh Chu Nhat");
        System.out.println("Number 2: Tinh Dien Tich Hinh Tam Giac");
        System.out.println("Number 3: Tinh Dien Tich Hinh Vuong");
        System.out.println("Number 4: Tinh Dien Tich Hinh Tron");
        System.out.println("Number 5: Tinh Dien Tich Hinh Thang");
        
        System.out.print("\nPlease Choose Number: ");
        n = scanner.nextInt();

        switch (n){
            case 1:
                System.out.println("\nNUMBER 1");
                System.out.println("\nDIEN TICH HINH TAM GIAC");
                System.out.print("Chieu Dai: ");
                a = scanner.nextDouble();
                System.out.print("Chieu Rong: ");
                b = scanner.nextDouble();
                s = a*b;
                System.out.println("Dien Tich Hinh Chu Nhat: " + s);
                break;
            case 2:
                System.out.println("\nNUMBER 2");
                System.out.println("\nDIEN TICH HINH TAM GIAC");
                System.out.print("Canh Day: ");
                a = scanner.nextDouble();
                System.out.print("Chieu Cao: ");
                b = scanner.nextDouble();
                s = a*b/2;
                System.out.println("Dien Tich Hinh Tam Giac: " + s);
                break;
            case 3:
                System.out.println("\nNUMBER 3");
                System.out.println("\nDIEN TICH HINH VUONG");
                System.out.print("Canh: ");
                a = scanner.nextDouble();
                s = a*a;
                System.out.println("Dien Tich Hinh Vuong: " + s);
                break;
            case 4:
                System.out.println("\nNUMBER 4");
                System.out.println("\nDIEN TICH HINH TRON");
                System.out.print("Ban Kinh: ");
                a = scanner.nextDouble();
                s = a*a*PI;
                System.out.println("Dien Tich Hinh Tron: " + s);
                break;
            case 5:
                System.out.println("\nNUMBER 5");
                System.out.println("\nDIEN TICH HINH THANG");
                System.out.print("Canh Ngan: ");
                a = scanner.nextDouble();
                System.out.print("Canh Dai: ");
                b = scanner.nextDouble();
                System.out.print("Chieu Cao: ");
                c = scanner.nextDouble();
                s = (a + b)*c/2;
                System.out.println("Dien Tich Hinh Thang: " + s);
                break;
            default:
                System.out.println("UNKNOW");
        }
    }    
}
