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
 * Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số nguyên tố hay
không
 */
public class Bai6 {
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        
        for(int i = 2;i <= n/2;i++){
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
        
        System.out.println(isPrimeNumber(n));
    }
}
