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
 * Nhập số nguyên n. Hãy tính tổng các chữ số của số nguyên dương n
 */
public class Bai20f {
    public static void main(String[] args) {
        int n, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 0);
        
        for(;n > 0;n /=10){
            sum += n%10;
        }
        System.out.println("Tong cac chu so cua so nguyen n = " + sum);
    }
}
