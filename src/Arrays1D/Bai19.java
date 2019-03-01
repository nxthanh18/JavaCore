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
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất
cả các số âm trong mảng
 */
public class Bai19 {
    public static Scanner sc = new Scanner(System.in);
    public static void input(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void output(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    public static void deleteOneNumber(int []a){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            a[i] = a[i+1];
            n--;
        }
    }
    public static void deleteNegativeNumber(int []a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            if(a[i] < 0){
                deleteOneNumber(a);
                i--;
            }
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
        
        int []a = new int[n];
        input(a);
        System.out.println("Mang vua nhap: ");
        output(a);
        System.out.println("\nXoa cac so am trong mang: ");
        deleteNegativeNumber(a);
        output(a);
    }
}
