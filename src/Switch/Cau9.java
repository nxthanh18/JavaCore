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
 * Viết chương trình nhập vào số nguyên 4 (1  4) và in ra mùa tương ứng
	Ví dụ:
		n = 1  XUAN
		n = 2  HA
		n = 3  THU
		n = 4  DONG
		n = 5  UNKNOW

 */
public class Cau9 {
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number for Season: ");
        n = scanner.nextInt();
        
        switch (n){
            case 1:
                System.out.println("XUAN");
                break;
            case 2:
                System.out.println("HA");
                break;
            case 3:
                System.out.println("THU");
                break;
            case 4:
                System.out.println("DONG");
                break;
            default:
                System.out.println("UNKNOW");
        }
    }
}
