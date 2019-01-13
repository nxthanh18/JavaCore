/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 *
 * @author genharunari
 * 
 * Liệt kê tất cả các số chính phương nhỏ hơn n(Sử dụng hàm kiểm tra số chính
phương)
 */
public class Bai19 {
//    public static int isSquareNumber(int n){
//        int a = 1;
//        for(int i = 1;i < n;i++){
//            a = (int) sqrt(i);
//        }
//        return a;
//    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        int a = 1;
        for(int i = 1;i < n;i++){
            a = (int) sqrt(i);
        }
        
        System.out.println(" " + a);
    }
}
