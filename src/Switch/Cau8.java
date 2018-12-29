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
 * Viết chương trình nhập số nguyên n (1  10) và in ra từ tiếng anh tương ứng
	Ví dụ: n = 3  THREE
		n = 9  NINE
		n = 11  UNKNOW

 */
public class Cau8 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        n = scanner.nextInt();
        
        switch(n){
            case 0:
                System.out.print("ZERO");
                break;
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
            default:
                System.out.println("UNKNOW");
        }
    }    
}
