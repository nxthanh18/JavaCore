/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2D;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Nhập ma trận n hàng, m cột (n > 0, m > 0). Đếm số lượng số nguyên tố trong ma
trận
 */
public class Bai35 {
    public static Scanner sc = new Scanner(System.in);
    public static void input(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }        
    }
    public static void output(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int countPrimeNumber(int [][]a){
        int count = 0;
        int row = a.length;
        int col = a[0].length;
        for(int i = 0;i < row; i++){
            for(int j = 0; j < col; j++){
                if(isPrimeNumber(a[i][j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        
        for(int i = 2;i <= n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int row, col;
        
        do{
            System.out.print("Row = ");
            row = sc.nextInt();
            if(row <= 0){
                System.out.println("Input again Row > 0 !!!");
            }
        }while(row <= 0);
        
        do{
            System.out.print("Column = ");
            col = sc.nextInt();
            if(row <= 0){
                System.out.println("Input again Column > 0 !!!");
            }
        }while(col <= 0);
        
        int [][]a = new int[row][col];
        input(a);
        System.out.println("Mang vua nhap: ");
        output(a);
        System.out.println("So luong so nguyen to trong ma tran la: " + countPrimeNumber(a));
    }
}
