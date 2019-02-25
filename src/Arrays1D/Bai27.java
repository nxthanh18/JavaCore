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
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Kiểm
tra mảng có đối xứng hay không!
Ví dụ:
int [] a = { 1, 2, 3 ,3 2,1} → mảng đối xứng
int [] b = { 1, 2, 3, 3,1} → Mảng không đối xứng
 */
public class Bai27 {
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
    public static boolean isSymmetryArray(int []a){
        for(int i = 0; i < a.length/2; i++){
            if(a[i] != a[a.length - i - 1]){
                return false;
            }
        }
        return true;
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
        if(isSymmetryArray(a)){
            System.out.println("\nMang vua nhap la mang doi xung !!!");
        }else{
            System.out.println("\nMang khong doi xung !!!");
        }        
    }
}
