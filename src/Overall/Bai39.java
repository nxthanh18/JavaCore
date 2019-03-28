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
 * Viết chương trình nhập số n và in ra màn hình tam giác sau
Ví dụ n = 4
* * * *
* * *
* *
*
 */
public class Bai39 {
    public static Scanner sc = new Scanner(System.in);
    public static int printTriangleNguoc(int n){
        for(int i = n - 1;i >= 0;i--){
            for(int j = 0;j < n;j++){
                if(j <= i){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        return n;
    }
    public static void main(String[] args) {
        int n;
        do{
            System.out.print("n = ");
            n = sc.nextInt();
        }while(n <= 0);
        
        System.out.println(printTriangleNguoc(n) + "\b");
    }
}
