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
 * Liệt kê tất cả các số nguyên tố nhỏ hơn n (Sử dụng hàm kiểm tra số nguyên tố)
 */
public class Bai18 {
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println("Cac so nguyen to nho hon " + n + " la: " + n);
        if(n >= 2){
            System.out.println(2);
        }
        for(int i = 3;i < n;i += 2){
            if(isPrimeNumber(i)){
                System.out.println(" " + i);
            }
        }
    }
}
