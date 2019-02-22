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
 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp
lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
 */
public class Bai14 {
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
    public static void hoanVi(int []array){
        int temp;
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i]%2 != 0 && array[j]%2 != 0){
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
        hoanVi(array);
        System.out.println("Sap xep so le tang dan: ");
        outputArray(array);
    }
}
