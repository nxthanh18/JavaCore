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
 */
public class ExArr2D {
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
    public static int countOddElement(int [][]a){
        int count = 0;
        int row = a.length;
        int col = a[0].length;
        for(int i = 0;i < row; i++){
            for(int j = 0; j < col; j++){
                if(a[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
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
        
        int [][]a = new int [row][col];         // khoi tao mang 2 chieu
        input(a);                               // nhap mang 2 chieu
        System.out.println("\nMang vua nhap: ");
        output(a);                              // xuat mang 2 chieu
        System.out.println("So le trong mang: " + countOddElement(a));
    }
}
