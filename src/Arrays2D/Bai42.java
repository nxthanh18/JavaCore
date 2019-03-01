/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2D;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * Nhập ma trận n hàng, m cột (n > 0, m > 0). Liệt kê các dòng có nhiều số chẵn nhất
 */
public class Bai42 {
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
    public static int rowMaxEvenNumber(int [][]a){
        int row = a.length;
        int col = a[0].length;
        int maxCount = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col - 1; j++){
                for(int k = j + 1; k < col; k++){
                    if(a[i][j] % 2 == 0){
                        count++;
                        if(count > maxCount){
                            maxCount = count;
                            row = i;
                        }
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }
    }
//        int row = 0;
//        int count = 0;
//        int temp = 0;
//        for(int i = 0; i < a.length; i++){
//            for(int j = i + 1; j < a.length - 1; j++){
//                
//            }
////            if(a[row][i] % 2 == 0){
////                count++;
////                if(count >= temp){
////                    count = temp;
////                }
////            }
////            row = i;
//        }
//        return row;
//    }
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
        System.out.println("Dong co nhieu so chan nhat la: " + rowMaxEvenNumber(a));
    }
}
