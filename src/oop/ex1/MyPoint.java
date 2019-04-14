/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex1;

/**
 *
 * @author genharunari
 * Viết lớp MyPoint có
Thuộc tính:
mPosX: tọa độ X
mPosY: tọa độ Y
Phương thức
MyPoint(): khởi tạo X, Y mặc định là 0, 0
MyPoint(int x, int y)
display(): hiển thị tọa độ X, Y
setX(int x): thiết lập giá trị cho X
getX(): trả về giá trị X
setY(int y): thiết lập giá trị cho Y
getY(): trả về giá trị Y
distance(MyPoint p): trả về khoảng cách với tọa độ p
distance(MyPoint p1, MyPoint p2): khoảng cách giữa 2 tọa độ p1 và p2
Viết 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
 */
public class MyPoint {
    int mPosX, mPosY;
    
    public MyPoint(){
        this.mPosX = 0;
        this.mPosY = 0;
    }
    
    public MyPoint(int x, int y){
        mPosX = x;
        mPosY = y;
    }
    
    public int getX(){
        return mPosX;
    }
    public void setX(int x){
        this.mPosX = x;
    }
    
    public int getY(){
        return mPosY;
    }
    public void setY(int y){
        this.mPosY = y;
    }
    
    public void display(){
        System.out.print("(" + this.mPosX + "," + this.mPosY + ")");
    }
    
    public float distance(MyPoint p){
        float dx = mPosX - p.getX();
        float dy = mPosY - p.getY();
        float dis = (float) Math.sqrt(dx*dx - dy*dy);
        return dis;
    }
}
