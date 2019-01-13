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
 * Nhập số nguyên n. Viết hàm tìm chữ số lớn nhất của số nguyên dương n (n > 0)
 */
public class Bai12 {
    public static int max(int n){
        int max = 0;
        for(;n > 0;n /= 10){
            int temp = n%10;
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println("So lon nhat cua so " + n + " = " + max(n));
    }
}
