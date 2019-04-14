/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex6;

/**
 *
 * @author genharunari
 * 6. Tạo class Student gồm các thuộc tính và các phương thức sau
Trường : họ tên, lớp, điểm trung bình
Phương thức : khởi tạo, các hàm set/get của các thuộc tính, in thông tin sinh
viên

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
 */
public class Student {
    String school, name, clasS;
    float point;
    
    public Student(){
        school = "";
        name = "";
        clasS = "";
        point = 0;
    }
    
    public Student(String school, String name, String clasS, float point){
        this.school = school;
        this.name = name;
        this.clasS = clasS;
        this.point = point;
    }
    
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getClasS(){
        return clasS;
    }
    public void setClass(String clasS){
        this.clasS = clasS;
    }
    
    public float getPoint(){
        return point;
    }
    public void setPoint(float point){
        this.point = point;
    }
    
    public void informationStudent(){
        System.out.println("School: " + school);
        System.out.println("Name: " + name);
        System.out.println("Class: " + clasS);
        System.out.println("Point: " + point);
    }
}
