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
 * 41. Vẽ hình chữ nhật đặc kích thước n x m
Ví dụ n = 4, m = 5
* * * * *
* * * * *
* * * * *
* * * * *
 */
public class Bai41 {
    public static Scanner sc = new Scanner(System.in);
    public static void veHCN(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Input n = ");
        int n = sc.nextInt();
        System.out.print("Input m = ");
        int m = sc.nextInt();
        
        veHCN(n, m);
    }
}
