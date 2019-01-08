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
 * Đếm số lượng “ước số” của số nguyên dương n
 */
public class Bai10w {
    public static void main(String[] args) {
        int n, i = 1, count = 0;
        
        Scanner scanner = new Scanner(System.in);        
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
            if(n < 1){
                System.out.println("Ban phai nhap n > 0");
            }
        }while(n < 1);
        
        while(i <= n){
            if(n%i == 0){
                count++;
                System.out.print(i + "; ");
            }
            i++;
        }
        System.out.println("\n" + "So luong uoc so cua " + n + "= " + count);
    }
}
