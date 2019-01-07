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
 * Nhập số nguyên n. Tính S = 1 + 1/2 + 1/3 + .... + 1/n
 */
public class Bai2w {
    public static void main(String[] args) {
        int n, i = 1;
        double sum = 0;
                
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            sum += (double) 1/i;
            System.out.print("1/" + i + " + ");
            i++;
        }
        System.out.println("\n" + "Sum = " + sum);
    }
}
