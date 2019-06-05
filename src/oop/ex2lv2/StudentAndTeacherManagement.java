/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex2lv2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * Câu 2: 	Viết các lớp sau và thực thiện
Viết lớp Person có
	Thuộc tính:
		Họ và tên
		Tuổi
		Giới tính
	Phương thức:
		Contructure
		Các hàm set/get các thuộc tính
		In thông tin
Viết lớp Student kế thừa từ Person có
	Thuộc tính:
		Lớp
		Điểm trung bình
	Phương thức:
		Các hàm set/get các thuộc tính
		In thông tin
Viết lớp Teacher kế thừa từ Person có
	Thuộc tính:
		Lương
	Phương thức:
		Các hàm set/get các thuộc tính
		In thông tin		
Tạo menu như bên dưới và có các chức năng của nó
	Ấn 1. Nhập danh sách sinh viên
	Ấn 2. Nhập danh sách giáo viên
	Ấn 3. In danh sách sinh viên
	Ấn 4. In danh sách giáo viên
		Ấn 5. Thoát
 */
public class StudentAndTeacherManagement {
    ArrayList<Student> sList;
    ArrayList<Teacher> tList;

    public StudentAndTeacherManagement() {
        sList = new ArrayList<>();
        tList = new ArrayList<>();
        
        sList.add(new Student ("Bran Stark", "Male", 16, "Three eyed Raven", 8));
        sList.add(new Student ("Arya Stark", "Female", 15, "No One", 7.5f));
        sList.add(new Student ("Sansa Stark", "Female", 18, "Lady", 7.5f));
        
        tList.add(new Teacher ("Aegon Targaryen", "Male", 22, 9000));
        tList.add(new Teacher ("Daenerys Targaryen", "Female", 29, 8000));
        tList.add(new Teacher ("Cersei Lannister", "Female", 35, 10000));
    }
    
    private int inputIntegerNumber(){
        Scanner sc = new Scanner(System.in);
        //while(true) vong lap lien tuc.
        while(true){
            String strNum = sc.nextLine();
            try{
                int n = Integer.parseInt(strNum);
                return n;
            }catch(Exception e){
                System.out.print("Please input integer number: ");
            }
        }
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do{
            printMenu();
            choose = inputIntegerNumber();
            process(choose);
        }while(choose != 5);
    }
    
    public void printMenu(){
        System.out.println("----------------------------MENU-------------------------");
        System.out.println("Ấn 1. Nhập danh sách sinh viên");
        System.out.println("Ấn 2. Nhập danh sách giáo viên");
        System.out.println("Ấn 3. In danh sách sinh viên");
        System.out.println("Ấn 4. In danh sách giáo viên");
        System.out.println("Ấn 5. Thoát");
        System.out.println("----------------------------------------------------------");
        System.out.print("Choose: ");
    }
    
    public void process(int choose){
        switch(choose){
            case 5:
                System.out.println("Tam biet");
                break;
            case 1:// nhap sinh vien
                inputStudent();
                break;
            case 2:// nhap giao vien
                inputTeacher();
                break;
            case 3:// in ds sinh vien
                displayStudent(sList);
                break;
            case 4:// in ds giao vien
                displayTeacher(tList);
            default :
                System.out.println("UNKNOW");
        }
    }
    
    private int inputAge(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String strNum = sc.nextLine();
            try{
                int n = Integer.parseInt(strNum);
                if(n < 0 || n > 100){
                    System.out.print("Please input 0 < age < 100 : ");
                }else{
                    return n;
                }
            }catch(Exception e){
                System.out.print("Please input age number: ");
            }
        }
    }
    
    private float inputAverage(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String strNum = sc.nextLine();
            try{
                float n = Float.parseFloat(strNum);
                if(n < 0 || n > 10){
                    System.out.print("Please input 0 < average < 10 :");
                }else{
                    return n;
                }
            }catch(Exception e){
                System.out.print("Please input 0 < average < 10 : ");
            }
        }
    }
    
    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        
        String name, sex, _class;
        int age;
        float average;
        
        System.out.print("Full Name: ");
        name = sc.nextLine();
        
        System.out.print("Sex: ");
        sex = sc.nextLine();
        
        System.out.print("Age: ");
        age = inputAge();
        
        System.out.print("Class: ");
        _class = sc.nextLine();
        //sc.nextLine();
        
        System.out.print("Average: ");
        average = inputAverage();
        
        Student s = new Student(name, sex, age, _class, average);
        sList.add(s);
    }
    
    public void inputTeacher(){
        Scanner sc = new Scanner(System.in);
        
        String name, sex;
        int age, salary;
        
        System.out.print("Full Name: ");
        name = sc.nextLine();
        
        System.out.print("Sex: ");
        sex = sc.nextLine();
        
        System.out.print("Age: ");
        age = inputAge();
        
        System.out.print("Salary: ");
        salary = sc.nextInt();
        
        Teacher t = new Teacher(name, sex, age, salary);
        tList.add(t);
    }
    
    public void displayStudent(ArrayList<Student> list){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "FULL NAME", "SEX", "AGE", "CLASS", "AVERAGE");
        if(list.size() == 0){
            System.out.println("Khong co sinh vien nao !!!");
            return;
        }
        for(Student s: list){
            System.out.println(s.toString());
        }
    }
    
    public void displayTeacher(ArrayList<Teacher> list){
        System.out.printf("%-20s %-20s %-20s %-20s\n", "FULL NAME", "SEX", "AGE", "SALARY");
        if(list.size() == 0){
            System.out.println("Khong co giao vien nao !!!");
            return;
        }
        for(Teacher t: list){
            System.out.println(t.toString());
        }
    }
}
