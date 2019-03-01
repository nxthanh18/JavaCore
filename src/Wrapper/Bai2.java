/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrapper;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 2.	Nhập vào chuỗi String chứa số thực. Chuyển thành số thực và in ra màn hình
 */
public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String strNum;
        float num;

        System.out.print("Input String Number: ");
        strNum = sc.nextLine();
        
        num = Float.parseFloat(strNum);
        System.out.println("Num = " + num);
    }
}
