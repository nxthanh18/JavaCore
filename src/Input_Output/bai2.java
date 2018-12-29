/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Output;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Bài 2 : Nhập vào một số nguyên là bán kính hình tròn. Tính chu vi hình tròn
Cho PI = 3.14
Chu vi = 2 * bán kính * PI
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r;
        final double PI = 3.14d;        
        double perimeter;        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        r = scanner.nextInt();               
        perimeter = 2*PI*r;
        System.out.println("Perimeter: " + perimeter); 
    }
}