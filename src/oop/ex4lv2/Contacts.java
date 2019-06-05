/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex4lv2;

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
public class Contacts {
    private float phoneNumber;
    private String name;
    
    public Contacts(){
        phoneNumber = 0;
        name = "";
    }

    public Contacts(float phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s\n", name, phoneNumber);
    }
}
