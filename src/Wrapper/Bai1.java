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
 *Nhập vào chuỗi String chứa số nguyên. Chuyển thành số nguyên và in ra màn hình
 */
public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String strNum;
        int num;
        
        System.out.print("Input Number String: ");
        strNum = sc.nextLine();
        
        num =  Integer.parseInt(strNum);
        
        System.out.println("Num = " + num);        
    }
}
