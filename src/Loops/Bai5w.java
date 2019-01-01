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
 * 
 * Nhập vào số n, tính giai thừa của n
n!= 1 x 2 x 3 x 4 x …x n
 */
public class Bai5w {
    public static void main(String[] args) {
        int n, sum = 1;
        int i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            sum *= i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
