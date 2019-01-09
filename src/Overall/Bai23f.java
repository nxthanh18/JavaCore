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
 * Nhập số nguyên n. Hãy tính tổng các chữ số chẵn của số nguyên dương n
 */
public class Bai23f {
    public static void main(String[] args) {
        int n, count = 0, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 0);
        
        for(;n > 0;n /= 10){
            int temp = n%10;
            if(temp%2 == 0){
                sum += temp;
                count++;
            }
        }
        System.out.println("Tong cac chu so chan cua so n = " + sum);
    }
}
