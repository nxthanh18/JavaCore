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
 * Bài 4 : Nhập vào 2 số thập phân là 2 cạnh của hình chữ nhật. Tính chu vi hình chữ nhật
Chu vi = (chiều dài + chiều rộng) * 2
 */
public class bai4 {
    public static void main(String[] args) {
        double l;
        double w;
        double p;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        l = scanner.nextDouble();
        System.out.print("Width: ");
        w = scanner.nextDouble();
        p = (l + w)*2;
        System.out.print("Perimeter: " + p);
    }
    
}
