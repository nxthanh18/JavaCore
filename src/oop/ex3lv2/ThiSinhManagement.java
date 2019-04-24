/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex3lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * Câu 3: 	Quản lý điểm Thí sinh
Để quản lý điểm thi đầu vào trường ĐHBK của các thí sinh, ta xây dựng lớp ThiSinh mô tả các thí sinh bao gồm các thuộc tính và phương thức sau:
-	Tên Thí Sinh
-	Điểm thi 3 môn: Toán, Lý và Hóa
-	Nhập thông tin của thí sinh gồm tên và 3 môn
-	In thông tin tên và tổng điểm 3 môn
-	Tính tổng điểm của thí sinh
Trên cơ sở lớp đã xây dựng được, viết chương trình làm các công việc sau:
-	Nhập danh sách kết quả thi của các thí sinh vào từ bàn phím
-	In danh sách thí sinh
-	In danh sách điểm giảm dần
-	In danh sách trúng tuyển (điểm chuẩn là 17 điểm)
 */
public class ThiSinhManagement {
    ArrayList<ThiSinh> list;
    
    public ThiSinhManagement(){
        list = new ArrayList<>();
        
        list.add(new ThiSinh ("Aegon Targaryen", 9.5f, 9, 8.5f));
        list.add(new ThiSinh ("Daenerys Targaryen", 7.5f, 5, 4));
        list.add(new ThiSinh ("Bran Stark", 9.4f, 8.6f, 10));
        list.add(new ThiSinh ("Jaime Lannister", 5.5f, 9.5f, 8.6f));
        list.add(new ThiSinh ("Tywin Lannister", 9.5f, 2.2f, 3.6f));
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do{
            printMenu();
            choose = sc.nextInt();
            process(choose);
        }while(choose != 0);
    }
    
    public void printMenu(){
        System.out.println("----------------------------MENU-------------------------");
        System.out.println("Choose 1: Nhập danh sách kết quả thi của các thí sinh vào từ bàn phím");
        System.out.println("Choose 2: In danh sách thí sinh");
        System.out.println("Choose 3: In danh sách điểm giảm dần");
        System.out.println("Choose 4: In danh sách trúng tuyển (điểm chuẩn là 17 điểm)");
        System.out.println("Choose 0: Thoat Chuong Trinh");
        System.out.println("----------------------------------------------------------");
        System.out.print("Choose: ");
    }
    
    public void process(int choose){
        switch(choose){
            case 0:
                System.out.println("Tam biet");
                break;
            case 1://Nhập danh sách kết quả thi của các thí sinh vào từ bàn phím
                inputStudent();
                break;
            case 2://In danh sach thi sinh
                displayStudent(list);
                break;
            case 3://In danh sach diem giam dan
                sortDecreasing();
                break;
            case 4://In danh sach trung tuyen (diem chuan 17)
                displayStudentPass();
                break;
            default :
                System.out.println("UNKNOW");
        }
    }
    
    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        
        String name;
        float scoreM, scoreP, scoreC;
        
        System.out.print("FULL NAME: ");
        name = sc.nextLine();
        
        System.out.print("SCORE MATH: ");
        scoreM = sc.nextFloat();
        
        System.out.print("SCORE PHYSICAL: ");
        scoreP = sc.nextFloat();
        
        System.out.print("SCORE CHEMISTRY: ");
        scoreC = sc.nextFloat();
        
        ThiSinh ts = new ThiSinh(name, scoreM, scoreP, scoreC);
        list.add(ts);
    }
    
    public void displayStudent(ArrayList<ThiSinh> list){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "FULL NAME", "SCORE MATH", "SCORE PHYSICAL", "SCORE CHEMISTRY", "TOTAL SCORE");
        if(list.size() == 0){
            System.out.println("Khong co thi sinh nao !!!");
            return;
        }
        for(ThiSinh ts: list){
            System.out.println(ts.toString());
        }
    }
    
    public void sortDecreasing(){
        Collections.sort(list, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return (int) (o2.sumScore() - o1.sumScore());
            }
        });
        
        displayStudent(list);
    }
    
    public void displayStudentPass(){
        for(int i = list.size() - 1; i >= 0; i--){
            ThiSinh s = list.get(i);
            if(s.sumScore() < 17){
                list.remove(i);
            }
        }
        displayStudent(list);
    }
}
