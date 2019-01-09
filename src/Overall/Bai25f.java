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
 * Nhập số nguyên n. Hãy tìm số đảo ngược của số nguyên dương n
 */
public class Bai25f {
    public static void main(String[] args) {
        int n, tmp, res = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = " );
            n = scanner.nextInt();
        }while(n < 0);
        
        for(;n > 0;n /= 10){
            tmp = n%10;
            res = res*10+tmp;
        }
        System.out.println("So dao nguoc cua n = "+ res);
    }
}
