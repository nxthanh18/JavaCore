/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết hàm tính tổng tất cả các “ước số” của số nguyên dương n (n > 0)
 */
public class Bai3 {
    public static int divisor(int n){
        int sum = 0;
        for(int i = 1;i <= n;i ++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println(divisor(n));
    }
}
