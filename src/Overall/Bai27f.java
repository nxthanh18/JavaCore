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
 * Nhập số nguyên n. Tìm chữ số nhỏ nhất của số nguyên dương n
 */
public class Bai27f {
    public static void main(String[] args) {
        int n, min = 9;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 0);
        
        for(;n > 0;n /= 10){
            int temp = n%10;
            if(min > temp){
                min = temp;
            }
        }
        System.out.println("So nho nhat cua so n = " + min);
    }
}
