/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex4lv2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * Câu 4: 	Viết chương trình quản lý danh bạ gồm các chức năng chính:
-	Thêm
-	Sửa 
-	Xóa
-	Tìm kiếm theo tên
-	Tìm kiếm theo số điện thoại
 */
public class ContactsManagement {
    ArrayList<Contacts> list;
    
    public ContactsManagement(){
        list = new ArrayList<>();
        
        list.add(new Contacts (0979456475f, "Thanh"));
        list.add(new Contacts (0123456789f, "Abc"));
        list.add(new Contacts (0122255566f, "Def"));
    }
    
    private int inputIntegerNumber(){
        Scanner sc = new Scanner(System.in);
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
        }while(choose != 0);
    }
    
    public void printMenu(){
        display(list);
        System.out.println("----------------------------MENU-------------------------");
        System.out.println("CHOOSE 1: ADD");
        System.out.println("CHOOSE 2: EDIT");
        System.out.println("CHOOSE 3: DELETE");
        System.out.println("CHOOSE 4: SEARCH NAME");
        System.out.println("CHOOSE 5: SEARCH NUMBER");
        System.out.println("CHOOSE 0: GOOD BYE");
        System.out.println("----------------------------------------------------------");
        System.out.print("CHOOSE: ");
    }
    
    public void process(int choose){
        switch(choose){
            case 1:
                addContacts();
                break;
            case 3:
                deleteContacts();
                break;
            case 4:
                searchByName();
                break;
            default :
                System.out.println("UNKNOW");
        }
    }
    
    public void display(ArrayList<Contacts> list){
        System.out.printf("%-5s %-20s %-20s\n" ,"ID", "NAME", "NUMBER");
        if(list.size() == 0){
            System.out.println("Empty");
            return;
        }
//        for(Contacts s: list){
//            System.out.println(s.toString());
//        }
        for(int i = 0; i < list.size(); i++){
            Contacts c = list.get(i);
            System.out.printf("%-5d %s\n", (i + 1), c.toString());
        }
    }
    
    public void addContacts(){
        String name;
        float phoneNumber;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("NUMBER: ");
        phoneNumber = sc.nextFloat();
        
        System.out.print("NAME: ");
        name = sc.nextLine();
        sc.nextLine();
        
        Contacts db = new Contacts(phoneNumber, name);
        list.add(db);
    }
    
    public void deleteContacts(){
        
    }
    
    public void searchByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu khoa: ");
        String keyword = sc.nextLine();
        
        ArrayList<Contacts> list = searchByName(keyword);
        display(list);
    }
    
    public ArrayList<Contacts> searchByName(String keyword){
        ArrayList<Contacts> list = new ArrayList<>();
        for(Contacts s: this.list){
            String nameLowcase = s.getName().toLowerCase();
            String keyWordLowCase = keyword.toLowerCase();
            if(nameLowcase.contains(keyWordLowCase)) list.add(s);
        }
        return list;
    }
}
