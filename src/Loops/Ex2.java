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
public class Ex2 {
    public static void main(String[] args) {
        int n, sum = 0;
        int i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            sum += i;
            i += 2;
        }
        System.out.println("sum = " + sum);
    }
}
