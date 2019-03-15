/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author genharunari
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Nguyen Xuan Thanh");
        nameList.add("Vo Ngoc Tram");
        nameList.add(1, "Nguyen"); //insert
        
        //Duyet list su dung for
        for(int i = 0; i < nameList.size(); i++){
            String name = nameList.get(i);
            System.out.println(name);
        }        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(2);
        
        //Duyet list su dung for each
        System.out.println("Hien thi su dung FOR-EACH: ");
        for(int v : intList){
            System.out.print(v + " ");
        }
        //Sap xep tang dan
        System.out.println("\nDanh sach sap xep tang dan mac dinh");
        Collections.sort(intList);
        for(int v: intList){
            System.out.print(v + " ");
        }
        //Sap xep giam dan, fix Comparator.
        System.out.println("\nSap xep giam dan");
        Collections.sort(intList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int v: intList){
            System.out.print(v + " ");
        }
    }
}