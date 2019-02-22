/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author genharunari
 */
public class ExArr2Chieu {
    public static Scanner sc = new Scanner(System.in);
    public static void input(int [][]a){
        int row = a.length;
        int col = a[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("[%d][%d] = ", i, j);
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
    public static void main(String[] args) {
        int row, col;
        
        do{
            System.out.print("Row = ");
            row = sc.nextInt();
            System.out.print("Column = ");
            col = sc.nextInt();
            if(row <= 0 && col <= 0){
                System.out.println("Input again Row and Col > 0");
            }
        }while(row <= 0 && col <= 0);
        
        int [][]a = new int [row][col];         // khoi tao mang 2 chieu
        input(a);                               // nhap mang 2 chieu
        System.out.println("\nMang vua nhap: ");
        output(a);                              // xuat mang 2 chieu    
    }
}
