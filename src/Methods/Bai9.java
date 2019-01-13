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
 * Nhập số nguyên n. Viết hàm tính tổng các chữ số của số nguyên dương n (n > 0)
 */
public class Bai9 {
    public static int sum(int n){
        int sum = 0;
        for(;n > 0;n /= 10){
            sum += n%10;
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
        
        System.out.println("Tong cac chu so cua so nguyen " + n + " = " + sum(n));
    }
}
