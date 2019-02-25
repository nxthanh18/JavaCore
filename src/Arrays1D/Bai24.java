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
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Dịch
phải xoay vòng k phần tử trong mảng
 */
public class Bai24 {
    public static Scanner sc = new Scanner(System.in);
    public static void input(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void output(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    public static void rotate(int []a, int k){
        int []b = a.clone();
        int len = b.length;
        for(int index = 0; index < b.length; index++){
            // Tinh lai index sau khi xoay
            int i = index + k;
            while(i < 0){
                i += len;
            }
            i = i % len;
            a[i] = b[index];
        }
    }
    public static void main(String[] args) {
        int n;
        
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Input again n > 0 !!!");
            }
        }while(n <= 0);
        
        int []a = new int [n];
        
        input(a);
        System.out.println("Mang vua nhap: ");
        output(a);
        System.out.print("\nNhap xoay vong k = ");
        int k = sc.nextInt();
        rotate(a, k);
        System.out.println("Mang sau khi xoay: ");
        output(a);
    }
}
