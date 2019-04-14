/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex4;

/**
 *
 * @author genharunari
 * 4. Xây dựng lớp tam giác (Triangle) có
Thuộc tính:
a, b, c là ba cạnh của tam giác
Phương thức:
Hàm dựng
Kiểm tra tam giác (là tam giác thường, vuông, cân, đều hoặc không phải
tam giác)
Tính chu vi
Tính diện tích
Viết hàm 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
 */
public class Triangle {
    int a, b, c;
    
    public Triangle(){
        a = 1;
        b = 1;
        c = 1;
    }
    
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
    
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
    
    public int getC(){
        return c;
    }
    public void setC(int c){
        this.c = c;
    }
    
    public void displayTriangle(){
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("Tam giác!");
            if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Tam giác cân !");
            } else if ((a == b) && (b == c) && (c == a)) {
                System.out.println("Tam giác đều !");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Tam giác vuông !");
            }
        }else{
            System.out.println("Không phải tam giác");
	}
    }
    public int perimeterTriangle(){
        int p = a + b + c;
        return p;
    }
    public int acreageTriangle(){
        int p = (a + b + c)/2;
        int s = (int) Math.sqrt(p*(p - a)*(p - b)*(p - c));
        return s;
    }
}