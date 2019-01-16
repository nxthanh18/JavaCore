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
 * Viết chương trình nhập số n và in ra màn hình tam giác sau
Ví dụ n = 4
*
* *
* * *
* * * *
 */
public class Bai38_40 {
    public static Scanner sc = new Scanner(System.in);
    
    public static int printTriangle(int n){
        for(int i = 0; i < n;i++){
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
        System.out.println(printTriangle(n) + "\b");        
    }
}
