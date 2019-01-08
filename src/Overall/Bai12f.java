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
public class Bai12f {
    public static void main(String[] args) {
        int n, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        for(int i = 1;i <= n;i++){
            if(n%i == 0){
                if(i%2 == 0){
                    sum += i;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
