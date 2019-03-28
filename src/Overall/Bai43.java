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
 * Nhập n và in ra tam giác cân đặc chiều cao n sau
Ví dụ n = 5
*
* *
* * *
* * * *
* * * * *
 */
public class Bai43 {
    public static Scanner sc = new Scanner(System.in);
    public static void veTamGiac (int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < n; j++){
                if(i <= j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Input n = ");
        int n = sc.nextInt();
        
        veTamGiac(n);
    }
}
