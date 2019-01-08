/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Liệt kê tất cả các “ước số” của số nguyên dương n
 */
public class Bai7w {
    public static void main(String[] args) {
        int n, i = 1;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
            if(n < 1){
                System.out.println("Ban phai nhap n > 0");
            }
        }while(n < 1);
        
        while(i <= n){
            if(n%i == 0){
                System.out.print(i + "; ");
            }
            i++;
        }
    }
}
