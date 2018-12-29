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
 * Bài 6 : Nhập vào thông tin của một học sinh bao gồm: họ và tên, tuổi, địa chỉ, lớp, điểm
toán, điểm lý, điểm hóa. Sau đó in ra màn hình thông tin vừa nhập và điểm trung bình các
môn học:
Điểm trung bình = (toán + lý + hóa)/3
 */
public class bai6 {
    public static void main(String[] args) {
        String name;
        byte age;
        String address;
        String c;
        double m;
        double p;
        double ch;
        double a;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name: ");
      //  scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextByte();
        System.out.print("Address: ");
        scanner.nextLine();
        address = scanner.nextLine();
        System.out.print("Class: ");      
        c = scanner.next();        
        System.out.print("Math: ");
        m = scanner.nextDouble();
        System.out.print("Physic: ");
        p = scanner.nextDouble();
        System.out.print("Chemistry: ");
        ch = scanner.nextDouble();
        a = (m + p + ch)/3;
        System.out.println("Average: " + a);       
    }    
}
