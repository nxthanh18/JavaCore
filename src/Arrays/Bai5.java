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
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Liệt kê
các phần tử là số hoàn hảo
 */
public class Bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArray(int []array){
        for(int i = 0;i < array.length; i++){
            System.out.print("(" + i + ") = ");
            array[i] = sc.nextInt();
        }
    }
    public static void outputArray(int []array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");
        }
    }
    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1;i <= n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            return true;
        }
        return false;
    }
    public static void outputPerfectNumberArray(int []array){
        for(int i = 0; i < array.length; i++){
            if(isPerfectNumber(array[i])){
                System.out.print(array[i] + "; ");
            }
        }
    }
    public static void main(String[] args) {
        int n;
        int []array;
        
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Input again n > 0");
            }
        }while(n <= 0);
        
        array = new int[n];
        inputArray(array);
        System.out.println("Mang vua nhap: ");
        outputArray(array);
        System.out.println("So hoan hao trong mang la: ");
        outputPerfectNumberArray(array);
    }
}
