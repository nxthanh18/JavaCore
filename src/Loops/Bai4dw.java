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
 * Nhập vào số nguyên n, yêu cầu xuất ra bảng cửu chương thứ n.
 */
public class Bai4dw {
    public static void main(String[] args) {
        int n, i = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        do{
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        }while(i <= 10);
    }
}
