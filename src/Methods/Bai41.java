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
 * Vẽ hình chữ nhật đặc kích thước n x m
Ví dụ n = 4, m = 5
* * * * *
* * * * *
* * * * *
* * * * *
 */
public class Bai41 {
    public static Scanner sc = new Scanner(System.in);
    public static int printRectangle(int n, int m){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m; j++){
                if(j <= i){
                    System.out.print(" * ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("  ");
        }
        return n;
    }
    public static void main(String[] args) {
        int n, m;
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            System.out.print("m = ");
            m = sc.nextInt();
        }while(n <= 0);     
        
        System.out.println(printRectangle(n, m)+ "\b");
    }
}
