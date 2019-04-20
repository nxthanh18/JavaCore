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
 * 6. Tạo class Student gồm các thuộc tính và các phương thức sau
Trường : họ tên, lớp, điểm trung bình
Phương thức : khởi tạo, các hàm set/get của các thuộc tính, in thông tin sinh
viên
Tạo lớp StudentManagement với một menu để thực hiện các chức năng sau:
1. Nhập sinh viên
2. In danh sách sinh viên
3. In sinh viên có điểm trung bình cao nhất
4. In sinh viên có điểm trung bình thấp nhất
5. In danh sách sinh viên với sự giảm dần của điểm trung bình
6. Nhập tên sinh viên và tìm kiếm trong danh sách
7. Đổi tên của sinh viên thành chữ hoa. (viết thành phương thức trong
Student class)
8. Đổi tên của sinh viên thành chữ thường. (viết thành phương thức trong
Student class)
9. Xóa các sinh viên có điểm trung bình < 5
Menu thực hiện
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
----------------------------------------------------------
 */
public class StudentManagement {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        Student stu = new Student();
        
        stu.setSchool("Dai hoc Su Pham");
        stu.setName("Nguyen Xuan Thanh");
        stu.setClass("15CNTT2");
        stu.setScore(7);
        
        Student stu1 = new Student();
        
        stu1.setSchool("Dai hoc bach khoa");
        stu1.setName("Nguyen Van A");
        stu1.setClass("16C7");
        stu1.setScore(6);
        
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
        
        switch(n){
            case 1: 
                System.out.println("NUMBER 1");
                System.out.println("Nhap sinh vien");
                System.out.print("School: ");
                String school = sc.nextLine();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Class: ");
                String _class = sc.nextLine();
                System.out.print("Score: ");
                float score = sc.nextFloat();
                Student s = new Student(school, _class, name, score);
                break;
            case 2:
                System.out.println("NUMBER 2");
                System.out.println("Hien thi danh sach");
                Student s1 = new Student();
                break;
            case 3:
                System.out.println("NUMBER 3");
                System.out.println("Sinh vien co diem cao nhat");
                break;
            case 4:
                System.out.println("NUMBER 4");
                System.out.println("Sinh vien co diem thap nhat");
                break;
            case 5:
                System.out.println("NUMBER 5");
                System.out.println("Danh sach giam dan theo diem trung binh");
                break;
            case 6:
                System.out.println("NUMBER 6");
                System.out.println("Tim kiem");
                break;
            case 7:
                System.out.println("NUMBER 7");
                System.out.println("Viet Hoa ten sinh vien");
                break;
            case 8:
                System.out.println("NUMBER 8");
                System.out.println("Viet thuong ten sinh vien");
                break;
            case 9:
                System.out.println("NUMBER 9");
                System.out.println("Xoa sinh vien < 5 diem");
                break;
        }
    }
}
