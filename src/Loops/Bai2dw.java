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
 * Nhập 1 số nguyên n, xuất tổng các số lẻ từ 1 đến n
 */
public class Bai2dw {
    public static void main(String[] args) {
        int n, sum = 0, i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        do{
            sum += i;
            i += 2;
        }while(i <= n);
        System.out.println("Sum = " + sum);
    }
}
