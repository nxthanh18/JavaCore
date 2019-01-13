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
 * Nhập số nguyên n. Viết hàm kiểm tra số nguyên dương n có toàn chữ số chẵn hay
không
 */
public class Bai15 {
    public static boolean isEvenNumber(int n){
        int count = 0, countt = 0;
        for(;n > 0;n /= 10){
            int temp = n%10;
            if(temp%2 == 0){
                count++;
            }
            countt++;
        }if(count == countt){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println(isEvenNumber(n));
    }
}
