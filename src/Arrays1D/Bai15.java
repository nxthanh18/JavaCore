/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays1D;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp
số nguyên tố tăng dần nhưng giá trị khác giữ nguyên vị trí
 */
public class Bai15 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArray(int []array){
        for(int i = 0; i < array.length;i++){
            System.out.print("(" + i + ") = ");
            array[i] = sc.nextInt();
        }
    }
    public static void outputArray(int []array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "; ");
        }
    }
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        
        for(int i = 2;i <= sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeNumber(int []array){
        int temp = array[0];
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(isPrimeNumber(array[i]) && isPrimeNumber(array[j])){
                    if(array[i] > array[j]){
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
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
        primeNumber(array);
        System.out.println("\nSap xep so nguyen to tang dan: ");
        outputArray(array);
    }
}
