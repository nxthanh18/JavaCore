/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Nhap n: 10 <= n <= 20
 */
public class Exdw2 {
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
            
            if(n < 10 || n > 20){
                System.out.println("Ban phai nhap khoang tu 10 - 20");
            }
        }while(n < 10 || n > 20);
        System.out.println("So vua nhap n = " + n);
    }
}
