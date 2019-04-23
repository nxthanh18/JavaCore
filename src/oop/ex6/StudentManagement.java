/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    ArrayList<Student> mList;
    
    public StudentManagement(){
        mList = new ArrayList<>();
        
        mList.add(new Student("Michael Jackson", "King Pop Music", 10));
        mList.add(new Student("Jon Snow", "The King of the North", 9.5f));
        mList.add(new Student("Night King", "Death King", 8.5f));
        mList.add(new Student("Kim Joong Un", "North Korea", 7));
        mList.add(new Student("Donaln Trump", "America", 10));
        mList.add(new Student("Barack Obama", "America", 8));
        mList.add(new Student("Ho Chi Minh", "Viet Nam", 5));
        mList.add(new Student("Le Duan", "Viet Nam", 4));
        mList.add(new Student("Nguyen Van Linh", "Viet Nam", 3));
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do{
            // 1. In Menu
            printMenu();
            
            //2. Nhap chuc nang            
            choose = sc.nextInt();
            
            //3. Xu ly chuc nang
            process(choose);
        }while(choose != 0);
    }
    
    public void printMenu(){
        System.out.println("----------------------------MENU-------------------------");
        System.out.println("An 1. Nhap sinh vien");
        System.out.println("An 2. Hien thi danh sach");
        System.out.println("An 3. Sinh vien co diem cao nhat");
        System.out.println("An 4. Sinh vien co diem thap nhat");
        System.out.println("An 5. Danh sach giam dan theo diem trung binh");
        System.out.println("An 6. Tim kiem");
        System.out.println("An 7. Viet Hoa ten sinh vien");
        System.out.println("An 8. Viet thuong ten sinh vien");
        System.out.println("An 9. Xoa sinh vien < 5 diem");
        System.out.println("An 0. Thoat chuong trinh ");
        System.out.println("----------------------------------------------------------");
        System.out.print("Chon: ");
    }
    
    public void process(int choose){
        switch(choose){
            case 0:
                System.out.println("Tam biet !!!");
                break;
            case 1: // nhap sinh vien
                inputStudent();
                break;
            case 2: // hien thi danh sach
                display(mList);
                break;
            case 3:
                displayBestStudents();
                break;
            case 5:
                sortDecreasing();
            case 6:
                searchByName();
                break;
            case 9:
                removeBad();
                break;
            default:
                System.out.println("UNKNOW");
        }
    }
    
    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        
        String name, _class;
        float average;
        
        System.out.print("Name: ");
        name = sc.nextLine();
        
        System.out.print("Class: ");
        _class = sc.nextLine();
        
        System.out.print("Average: ");
        average = sc.nextFloat();
        
        Student s = new Student(name, _class, average);
        mList.add(s);
    }
    
    public void display(ArrayList<Student> list){
        System.out.printf("%-20s %-20s %-20s\n", "HO VA TEN", "LOP", "DIEM");
        if(list.size() == 0){
            System.out.println("Khong co phan tu nao");
            return;
        }
        for(Student s: list){
            System.out.println(s.toString());
        }
    }
    
    public void searchByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu khoa: ");
        String keyword = sc.nextLine();
        
        ArrayList<Student> list = searchByName(keyword);
        display(list);
    }
    
    public ArrayList<Student> searchByName(String keyword){
        ArrayList<Student> list = new ArrayList<>();
        for(Student s: mList){
            String nameLowcase = s.getName().toLowerCase();
            String keyWordLowCase = keyword.toLowerCase();
            if(nameLowcase.contains(keyWordLowCase)) list.add(s);
        }
        return list;
    }
    
    public void displayBestStudents(){
        ArrayList<Student> list = getBestStudent();
        display(list);
    }
    
    public ArrayList<Student> getBestStudent(){
        // get max score
        Student max = mList.get(0);
        for(int i = 1; i < mList.size(); i++){
            Student s = mList.get(i);
            if(max.getScore() < s.getScore()){
                max = s;
            }
        }
        
        //get all max list
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < mList.size(); i++){
            Student s = mList.get(i);
            if(s.getScore() == max.getScore()){
                list.add(s);
            }
        }
        return list;
    }
    
    public void sortDecreasing(){
        Comparator compare = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                float v = o1.getScore() - o2.getScore();
                if(v < 0){
                    return 1;
                }else if(v == 0){
                    return o1.getName().compareTo(o2.getName());
                }else{
                    return -1;
                }
            }
        };
        
        Collections.sort(mList, compare);
        display(mList);
    }
    
    public void removeBad(){
//        int i = 0;
//        while(i < mList.size()){
//            Student s = mList.get(i);
//            if(s.getScore() < 5){
//                mList.remove(i);
//            }else{
//                i++;
//            }
//        }
        for(int i = mList.size() - 1; i >= 0 ; i--){
            Student s = mList.get(i);
            if(s.getScore() < 5){
                mList.remove(i);
            }
        }
        display(mList);
    }
}