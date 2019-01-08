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
 * Đếm số lượng “ước số chẵn” của số nguyên dương n
 */
public class Bai14f {
    public static void main(String[] args) {
        int n, count = 0;
        
        Scanner scanner = new Scanner(System.in);        
        do{            
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        for(int i = 1;i <= n;i++){
            if(n%i == 0){
                if(i%2 == 0){
                    count++;
                }
            }
        }
        System.out.println("So luong uoc so chan cua " + n + " = " + count);
    }
}
