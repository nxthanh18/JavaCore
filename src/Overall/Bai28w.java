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
 * Nhập số nguyên n. Hãy kiểm tra số nguyên dương n có toàn chữ số lẻ hay không
 */
public class Bai28w {
//    public static void main(String[] args) {
//        int n, temp = 0;
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        do{
//            System.out.print("n = ");
//            n = scanner.nextInt();
//        }while(n < 0);
//        
//        for(;n > 0;n /= 10){
//            temp = n%10;
//            if(temp%2 == 1){
//                
//            }
//        }        
//    }
    public static void main(String[] args) {
         
        int n;
        boolean res;
        Scanner sc;
        do {
            System.out.print("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
        res = is_even_digits(n);
        if(res) {
            System.out.println("All digits of " + n + " is even number");
        }
        else {
            System.out.println("All digits of " + n + " is not even number");
        }
         
        sc.close();
    }
     
    public static boolean is_even_digits(int n) {
        while(n > 0) {
            if(n%10%2 != 0) {
            return false;
            }
            n = n/10;
        }
        return true;
    }
}
