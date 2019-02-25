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
 * Nhập ma trận vuông (n x n). Sắp xếp chéo phụ giảm dần
 */
public class Bai51 {
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
    public static void main(String[] args) {
        int row, col;
        
        do{
            System.out.print("Row & Column = ");
            row = col = sc.nextInt();
            if(row <= 0){
                System.out.println("Input again Row & Column > 0 !!!");
            }
        }while(row <= 0);        
        
        int [][]a = new int[row][col];
        input(a);
        System.out.println("Mang vua nhap: ");
        output(a);
    }
}
