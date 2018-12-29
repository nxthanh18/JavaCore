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
 * Bài 3 : Nhập vào một số thập phân là bán kính hình tròn. Tính diện tích hình tròn
Cho PI = 3.14
Diện tích = PI * bán kính * bán kính
 */
public class bai3 {
    public static void main(String[] args) {
        double r;
        final double PI = 3.14d;
        double acreage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        r = scanner.nextFloat();        
        acreage = r*r*PI;
        System.out.println("Acreage: " +acreage);        
    }    
}
