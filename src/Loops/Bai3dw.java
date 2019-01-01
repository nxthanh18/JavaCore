/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Nhập vào số nguyên n, in ra tổng các số chẵn và tổng các số lẻ nhỏ hơn hoặc bằng
n
 */
public class Bai3dw {
    public static void main(String[] args) {
        int n, sumc = 0, suml = 0, i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        do{
            if(i%2 == 0){
                sumc += i;
            }else{
                suml += i;
            }
            i++;
        }while(i <= n);
        System.out.println("Sum chan = " + sumc);
        System.out.println("Sum le = " + suml);
    }
}
