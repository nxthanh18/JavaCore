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
 * Nhập số nguyên n. Tính S = 1/2 + 1/4 + ..... + 1/2n
 */
public class Bai3w {
    public static void main(String[] args) {
        int n, i = 2;
        double sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= (2*n)){            
            sum += (double) 1/i;
            System.out.print("1/" + i + " + ");
            i += 2;            
        }
        System.out.println("\n" + "Sum = " + sum);
    }
}
