/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex2;

/**
 *
 * @author genharunari
 * Viết lớp MyCircle có
Thuộc tính:
mPosX: tọa độ X
mPosY: tọa độ Y
mRas: bán kính
Phương thức:
MyCircle (): khởi tạo X, Y và bán kính mặc định là 0, 0, 10
MyCircle (int x, int y, int radius)
display(): hiển thị tọa độ và bán kính
setX(int x): thiết lập giá trị cho X
getX(): trả về giá trị X
setY(int y): thiết lập giá trị cho Y
getY(): trả về giá trị Y
setRadius(int y): thiết lập giá trị cho bán kính
getRadius(): trả về giá trị bán kính
distance(MyCircle c): trả về khoảng cách tới c
area(): tính diện tích hình tròn
Viết 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
 */
public class MyCircle {
    private int mPosX, mPosY, mRas;
    private static int count;
    
    public MyCircle(){
        mPosX = 0;
        mPosY = 0;
        mRas = 10;
        count++;
    }
    
    public MyCircle(int x, int y, int radius){
        mPosX = x;
        mPosY = y;
        mRas = radius;
        count++;
    }
    
    public void display(){
        System.out.println("(" + mPosX + "," + mPosY + ")" + "\nRadius = " + mRas);
    }
    
    public int getX(){
        return mPosX;
    }
    public void setX(int x){
        mPosX = x;
    }
    
    public int getY(){
        return mPosY;
    }
    public void setY(int y){
        mPosY = y;
    }
    
    public int getRadius(){
        return mRas;
    }
    public void setRadius(int radius){
        mRas = radius;
    }
    
    public static int getCount(){
        return count;
    }
    
    public float distance(MyCircle c){
        float dx = mPosX - c.getX();
        float dy = mPosY - c.getY();
        float dis = (float) (Math.sqrt(dx*dx - dy*dy) - (mRas + c.getRadius()));
        return dis;
    }
    
    public int acreageCircle(){
        int acreage;        
        acreage = (int) (3.14*mRas*mRas);        
        return acreage;
    }
}
