/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * 1.	Viết chương trình nhập vào các số nguyên cho đến khi nhập 0 thì dừng. 
a.	In danh sách vừa nhập ra màn hình
b.	Nhập số nguyên và in ra vị trí tìm thấy đầu tiên trong danh sách. Nếu không tìm thấy, chèn số đó vào đầu danh sách
c.	Nhập số nguyên và in ra vị trí tìm thấy cuối cùng trong danh sách. Nếu không tìm thấy, chèn số đó vào cuối danh sách
d.	Sắp xếp theo thứ tự tăng dần
e.	Sắp xếp theo thứ tự giảm dần
 */
public class Bai1 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArrayList(ArrayList<Integer> nameList){
        int a;
        do{
            System.out.print("Input a: ");
            a = sc.nextInt();
            if(a != 0){
                nameList.add(a);                
            }
        }while(a != 0);
    }
    public static void outputArrayList(ArrayList<Integer> nameList){
        for(int v: nameList){
            System.out.print(v + " ");
        }        
    }
    public static void searchFirstChar(ArrayList<Integer> nameList, int x){
        int p = nameList.indexOf(x);
        
        if(p != -1){
            System.out.print("Vi tri dau tien cua x: " + p);
        }else{
            System.out.println("Khong tim thay vi tri cua " + x +" + x vao danh sach: ");
            nameList.add(0, x);
            System.out.println();
            outputArrayList(nameList);
        }
    }
    public static void searchLastChar(ArrayList<Integer> nameList, int y){
        int p = nameList.lastIndexOf(y);
        
        if(p != -1){
            System.out.print("Vi tri cuoi cung cua x: " + p);
        }else{
            System.out.println("Khong tim thay vi tri cua " + y + " + vao danh sach: ");
            nameList.add(nameList.size(), y);
            System.out.println();
            outputArrayList(nameList);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> nameList = new ArrayList<>();
        
        inputArrayList(nameList);
        outputArrayList(nameList);
        
        System.out.print("\nInput x: ");
        int x = sc.nextInt();        
        searchFirstChar(nameList, x);
        
        System.out.print("\nInput y: ");
        int y = sc.nextInt();
        searchLastChar(nameList, y);
        
        System.out.println("\nSap xep mang tang dan: ");        
        Collections.sort(nameList);
        outputArrayList(nameList);
        
        System.out.println("\n Sap xep mang giam dan: ");        
        Collections.sort(nameList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return -1;
                }else if(o1 == o2){
                    return 0;
                }else{
                    return 1;
                }
            }
        });
        outputArrayList(nameList);
        //nameList.sort(Collections.reverseOrder());
    }
}
