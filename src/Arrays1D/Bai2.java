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
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). In ra
mảng vừa nhập và tổng các phần tử chẵn của mảng
 */
public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print("(" + i + ") = ");
            array[i] = sc.nextInt();
        }
    }
    public static void outputArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");
        }
    }
    public static int sumChan(int []array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        int []array;
        do{
            System.out.print("n = ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Intput again n > 0");
            }
        }while(n <= 0);
        
        array = new int[n];
        inputArray(array);
        System.out.println("Mang vua nhap: ");
        outputArray(array);
        
        int sum = sumChan(array);
        System.out.println("Tong cac phan tu chan la: " + sum);
    }
}
