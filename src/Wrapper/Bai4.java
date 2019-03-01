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
 * 4.	Nhập vào chuỗi String là chuỗi nhị phân. Chuyển thành số nguyên và in ra màn hình
 */
public class Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String strNum;
        int num;
        
        System.out.print("Input String Number: ");
        strNum = sc.nextLine();
        
        num = Integer.parseInt(strNum, 2);
        System.out.println("Number = " + num);
    }
}
