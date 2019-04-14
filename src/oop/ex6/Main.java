/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex6;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * Menu thực hiện
--------------------------MENU-----------------------
An 1. Nhap sinh vien
An 2. Hien thi danh sach
An 3. Sinh vien co diem cao nhat
An 4. Sinh vien co diem thap nhat
An 5. Danh sach giam dan theo diem trung binh
An 6. Tim kiem
An 7. Viet Hoa ten sinh vien
An 8. Viet thuong ten sinh vien
An 9. Xoa sinh vien < 5 diem
 */
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        Student stu = new Student();
        
        stu.setSchool("Dai hoc Su Pham");
        stu.setName("Nguyen Xuan Thanh");
        stu.setClass("15CNTT2");
        stu.setPoint(7);
        
        stu.informationStudent();
        
        System.out.println("--------------------------MENU-----------------------");
        System.out.println("An 1. Nhap sinh vien");
        System.out.println("An 2. Hien thi danh sach");
        System.out.println("An 3. Sinh vien co diem cao nhat");
        System.out.println("An 4. Sinh vien co diem thap nhat");
        System.out.println("An 5. Danh sach giam dan theo diem trung binh");
        System.out.println("An 6. Tim kiem");
        System.out.println("An 7. Viet Hoa ten sinh vien");
        System.out.println("An 8. Viet thuong ten sinh vien");
        System.out.println("An 9. Xoa sinh vien < 5 diem");
        
        System.out.print("Nhap chuc nang: ");
        n = sc.nextInt();
    }
}
