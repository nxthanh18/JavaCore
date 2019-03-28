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
 * 29.Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Hãy đưa
chẵn về đầu, lẻ về cuối, phần tử 0 nằm giữa mảng
 */
public class Bai29 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArray(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void outputArray(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    public static void evenNumberfirst(int []a){        
        int temp = a[0];
        for(int i = a.length - 1; i > 0; i--){
            if(a[i]%2 == 0){
                a[i] = a[i - 1];
            }
        }
    }
    public static void main(String[] args) {
        int n;
        
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            if(n <= 0) System.out.println("Input again n > 0 !!!");
        }while(n <= 0);
        int []a = new int[n];
        
        inputArray(a);
        System.out.println("Mang vua nhap: ");
        outputArray(a);
        evenNumberfirst(a);
        System.out.println();
        outputArray(a);
    }
}
