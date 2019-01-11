/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số chính phương hay
không
 */
public class Bai7 {
    public static boolean isSquareNumber(int n){
        int a;
        a = (int) sqrt(n);
        if(n == a*a){
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
        
        System.out.println(isSquareNumber(n));
    }
}
