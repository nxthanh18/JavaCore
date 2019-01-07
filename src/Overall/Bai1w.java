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
 * Nhập số nguyên n. Tính S = 1^2 + 2^2 + 3^2 + ... + n^2
 */
public class Bai1w {
    public static void main(String[] args) {
        int n, sum = 0, i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            sum += i*i;
            System.out.print("(" + i + "^2" + ")" + " + ");
            i++;
        }
        System.out.println("\n" + "Sum = " + sum);
    }
}
