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
Bai46_47: Nhập ma trận n hàng, m cột (n > 0, m > 0). Sắp xếp các phần tử trên 1 cột giảm
dần từ trên xuống dưới
* Bai46: Nhập ma trận n hàng, m cột (n > 0, m > 0). Sắp xếp các phần tử trên các dòng tăng
dần từ trái sang phải
 */
public class Bai46_47 {
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
    public static void sortNumber47(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row - 1; j++){
               for(int k = j + 1; k < row; k++){
                   if(a[j][i] < a[k][i]){
                       int temp = a[j][i];
                       a[j][i] = a[k][i];
                       a[k][i] = temp;
                   }
               } 
            }
        }
    }
    public static void sortNumber46(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col - 1; j++){
                for(int k = j + 1; k < col; k++){
                    if(a[i][j] > a[i][k]){
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
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
        System.out.println("Sap xep mang cac cot giam dan: ");
        sortNumber47(a);
        output(a);
        System.out.println("Sap xep mang cac dong tang dan: ");
        sortNumber46(a);
        output(a);
    }
}
