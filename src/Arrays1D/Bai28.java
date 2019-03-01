/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays1D;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Đếm các
số phần tử xuất hiện hơn 1 lần trong mảng số nguyên cho trước.
Ví dụ:
int a[]={2, 9, 0, 3, 2, 0, 1, 7} Xuất ra: 2
int a[]={0, 1, 2, 3, 4, 5, 6 , 7} Xuất ra: 0
 */
public class Bai28 {
    public static Scanner sc = new Scanner(System.in);
    public static void input (int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void output (int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    public static void main(String[] args) {
        
    }
}
