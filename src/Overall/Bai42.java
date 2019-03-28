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
 * 42. Vẽ hình chữ nhật rỗng kích thước n x m
Ví dụ n = 4, m = 5
* * * * *
*       *
*       *
* * * * *
 */
public class Bai42 {
    public static Scanner sc = new Scanner(System.in);
    public static void veHCNRong(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == m - 1){
                    System.out.print("*");                
                }
                else{
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Input n = ");
        int n = sc.nextInt();
        System.out.print("Input m = ");
        int m = sc.nextInt();
        
        veHCNRong(n, m);
    }
}