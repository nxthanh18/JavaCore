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
 * Nhập ma trận n hàng, m cột (n > 0, m > 0). Tìm giá trị lớn nhất và nhỏ nhất của
ma trận
 */
public class Bai34 {
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
    public static int minMatrix(int [][]a){
        int min = 9;
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(min > a[i][j]){
                    min = a[i][j];
                }
            }
        }
        return min;
    }
    public static int maxMatrix(int [][]a){
        int max = 0;
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
        return max;
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
        System.out.println("Gia tri nho nhat cua ma tran la: " + minMatrix(a));
        System.out.println("Gia tri lon nhat cua ma tran la: " + maxMatrix(a));
    }
}