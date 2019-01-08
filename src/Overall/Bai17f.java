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
 * Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay không
 */
public class Bai17f {
    public static void main(String[] args) {
        int n, count = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        for(int i = 1;i <= n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(n + " la so nguyen to");
        }else{
            System.out.println(n + " khong phai so nguyen to");
        }
    }
}
