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
 
 */
public class Bai1w {
    public static void main(String[] args) {
        int n, sum = 0;
        int i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
