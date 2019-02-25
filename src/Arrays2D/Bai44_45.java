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
 *Bai44: Nhập ma trận n hàng, m cột (n > 0, m > 0). Nhập vào 2 số là 2 dòng trong ma trận.
Hoán vị 2 dòng trong ma trận
Bai44_45: Nhập ma trận n hàng, m cột (n > 0, m > 0). Nhập vào 2 số là 2 cột trong ma trận.
Hoán vị 2 cột trong ma trận
* 
 */
public class Bai44_45 {
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
    public static void hoanViRow(int [][]a, int row1, int row2){
        int col = a[0].length;
        row1 = row1 - 1;
        row2 = row2 - 1;
        for(int i = 0; i < col; i++){
            int temp = a[row1][i];
            a[row1][i] = a[row2][i];
            a[row2][i] = temp;
        }
    }
    public static void hoanViColumn(int [][]a, int col1, int col2){
        int row = a.length;
        col1 = col1 - 1;
        col2 = col2 -1;
        for(int i = 0; i < row; i++){
            int temp = a[i][col1];
            a[i][col1] = a[i][col2];
            a[i][col2] = temp;
        }
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
        int col1, col2, row1, row2;
        do{
            System.out.print("Nhap cot 1: ");
            col1 = sc.nextInt();
            if(col1 <= 0 || col1 > col){
                System.out.println("Input again Column trong khoang cua ma tran");
            }
        }while(col1 <= 0 || col1 > col);
        
        do{
            System.out.print("Nhap cot 2: ");
            col2 = sc.nextInt();
            if(col2 <= 0 || col2 > col){
                System.out.println("Input again Column trong khoang cua ma tran");
            }
        }while(col2 <= 0 || col2 > col);
        
        hoanViColumn(a, col1, col2);
        output(a);
        
        do{
            System.out.print("Nhap dong 1: ");
            row1 = sc.nextInt();
            if(row1 <= 0 || row1 > row){
                System.out.println("Input again Row trong khoang cua ma tran");
            }
        }while(row <= 0 || row1 > row);
        
        do{
            System.out.print("Nhap dong 2: ");
            row2 = sc.nextInt();
            if(row2 <= 0 || row2 > row){
                System.out.println("Input again Row trong khoang cua ma tran");
            }
        }while(row2 <= 0 || row2 > row);
        
        hoanViRow(a, row1, row2);
        output(a);
    }
}
