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
 * Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
 */
public class Bai18f {
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        for(int i = 1;i < n;i++){
            if((i*i) == n){
                System.out.println(n + " la so chinh phuong");
            }
        }
    }
}
