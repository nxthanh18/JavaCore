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
 * Nhập số nguyên n. Viết hàm đếm số lượng chữ số của số nguyên dương n (n > 0)
 */
public class Bai8 {
    public static int count(int n){
        int count = 0;
        for(;n > 0;n/=10){
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println("So luong chu so cua " + n + " = " + count(n));
    }
}
