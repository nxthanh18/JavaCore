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
 * Tính tổng tất cả các “ước số chẵn” của số nguyên dương n
 */
public class Bai12w {
    public static void main(String[] args) {
        int n, i = 1, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        while(i <= n){
            if(n%i == 0){
                if(i%2 == 0){
                    sum += i;
                }
            }
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
