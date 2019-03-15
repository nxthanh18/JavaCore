/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author genharunari
 * 2.	Viết chương trình nhập vào danh sách Sinh viên (String) cho đến khi nhập chuỗi exit hoặc Exit thì dừng. (không phân biệt chữ hoa hay chữ thường) 
1.	In danh sách vừa nhập ra màn hình
2.	Nhập chuỗi con và in ra vị trí tìm thấy đầu tiên trong danh sách. Nếu không tìm thấy, chèn chuỗi đó vào giữa danh sách
3.	Nhập chuỗi con và in ra vị trí tìm thấy cuối cùng trong danh sách. Nếu không tìm thấy, tách chuỗi con thành 2 phần, sau đó chèn vào đầu và cuối danh sách (nếu chuỗi con chỉ có một ký tự, chèn chuỗi con vào giữa danh sách)
4.	Nhập chuỗi con và in ra tất cả các vị trí có chứa chuỗi con đó. Nếu không tìm thấy vị trí nào, nối chuỗi con vào cuối tất cả các phần tử của danh sách

 */
public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static void inputArrayList(ArrayList<String> nameList){
        String str;
        
        do{
            System.out.print("Input name: ");
            str = sc.nextLine();
            if(!str.equalsIgnoreCase("exit")){
                nameList.add(str);
            }
        }while(!"exit".equalsIgnoreCase(str));
    }
    public static void outputArrayList(ArrayList<String> nameList){
        for(String v: nameList){
            System.out.println(v);
        }
    }
    //2
    public static void searchFirstString(ArrayList<String> nameList, String strf){
        int index = -1;
        for(int i = 0; i < nameList.size(); i++){
            String name = nameList.get(i);
            if(name.contains(strf)){
                index = i;
                break;
            }
        }
        if(index == -1){ // khong tim thay
            nameList.add(nameList.size()/2, strf);
        }else{
            System.out.println("Vi tri tim thay dau tien chuoi \"" + strf + "\" tai: " + index);
        }
    }
    //3
    public static void searchLastString(ArrayList<String> nameList, String strl){
        int index = -1;
        for(int i = nameList.size() - 1; i >= 0; i--){
            String name = nameList.get(i);
            if(name.contains(strl)){
                index = i;
                break;
            }
        }
        if(index == -1){
            if(strl.length() == 1){
                nameList.add(nameList.size()/2, strl);
            }else{
                String str1 = strl.substring(0, strl.length()/2);
                String str2 = strl.substring(strl.length()/2, strl.length());
                nameList.add(0, str1);
                nameList.add(nameList.size(), str2);
            }
            System.out.println();
            outputArrayList(nameList);
        }else{
            System.out.println("Vi tri tim thay cuoi cung chuoi \"" + strl + "\" tai: " + index);
        }
    }
    //4
    public static void searchWhole(ArrayList<String> nameList, String strw){
        boolean isFound = false;
        for(int i = 0; i < nameList.size(); i++){
            String name = nameList.get(i);
            if(name.contains(strw)){
                System.out.print(i + " ");
                isFound = true;
            }
        }
        if(!isFound){
            for(int i = 0; i < nameList.size(); i++){
                String newName = nameList.get(i) + strw;
                nameList.set(i, newName);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();              
        
        inputArrayList(nameList);
        outputArrayList(nameList);
        
        System.out.print("Input String can tim: ");
        String strf = sc.nextLine();        
        searchFirstString(nameList, strf);
        
        System.out.print("\nInput String can tim: ");
        String strl = sc.nextLine();
        searchLastString(nameList, strl);
        
        System.out.print("\nInput String can tim: ");
        String stro = sc.nextLine();
        searchWhole(nameList, stro);
    }
}