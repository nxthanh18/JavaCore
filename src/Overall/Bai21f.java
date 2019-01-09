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
 * Nhập số nguyên n. Hãy tính tích các chữ số của số nguyên dương n
 */
public class Bai21f {
    public static void main(String[] args) {
        int n, tich = 1;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 0);
        
        for(;n > 0;n /=10){
            tich *= n%10;
        }
        System.out.println("Tich cac chu so cua so nguyen n = " + tich);
    }
}
