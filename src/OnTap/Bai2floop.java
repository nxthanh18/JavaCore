/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

import java.util.Scanner;

/**
 *
 * @author genharunari
 */
public class Bai2floop {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        for(int i = 2; i <= n; i += 2){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
