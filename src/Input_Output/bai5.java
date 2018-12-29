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
 * Bài 5 : Nhập vào 2 số nguyên là 2 cạnh của hình chữ nhật. Tính diện tích hình chữ nhật
Diện tích = chiều dài * chiều rộng
 */
public class bai5 {
    public static void main(String[] args){
        int l;
        int w;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        l = scanner.nextInt();
        System.out.print("Width: ");
        w = scanner.nextInt();
        a = l*w;
        System.out.print("Acreage: " + a);        
    }
}
