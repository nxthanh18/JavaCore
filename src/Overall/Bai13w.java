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
 * Tính tích tất cả các “ước số lẻ” của số nguyên dương n
 */
public class Bai13w {
    public static void main(String[] args) {
        int n, i = 1, tich = 1;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        while(i <= n){
            if(n%i == 0){
                if(i%2 == 1){
                    tich *= i;
                }
            }
            i++;
        }
        System.out.println("Tich = " + tich);
    }
}
