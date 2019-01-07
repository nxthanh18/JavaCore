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
 * Nhập số nguyên n. Tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
 */
public class Bai5w {
    public static void main(String[] args) {
        int n, i = 1, sum =0, exponentiation = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            exponentiation *= i;            
            sum += exponentiation;
            System.out.print(i + "!" + " + ");
            i++;
        }
        System.out.println("\n" + "Sum = " + sum);
    }
}
