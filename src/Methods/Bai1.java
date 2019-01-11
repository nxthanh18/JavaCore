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
 * Nhập số nguyên n > 1. Viết hàm tính S = 1^2 + 2^2 + 3^2 + ... + n^2
 */
public class Bai1 {
    public static int sum(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += i*i;            
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        System.out.println(sum(n));
    }
}
