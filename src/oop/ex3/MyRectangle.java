/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex3;

/**
 *
 * @author genharunari
 * Viết lớp MyRectangle có
Thuộc tính:
mPos: tọa độ (MyPoint)
mWidth: chiều dài
mHeight: chiều rộng
Phương thức:
MyRectangle (): khởi tạo mặc định là 0, 0, 100, 100
MyRectangle (int x, int y, int width, int height)
display(): hiển thị tọa độ kích thước
setX(int x): thiết lập giá trị cho X
getX(): trả về giá trị X
setY(int y): thiết lập giá trị cho Y
getY(): trả về giá trị Y
setPos(MyPoint p) : thiết lập tọa độ
getPos(): trả về tọa độ
setWidth(int w): thiết lập chiều dài
getWidth(): trả về chiều dài
setHeight(int h): thiết lập chiều cao
getHeight(): trả về giá trị chiều cao
area(): tính diện tích hình chữ nhật
Viết hàm 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
 */
public class MyRectangle {
    int mPosX, mPosY, mWidth, mHeight;
    
    public MyRectangle(){
        mPosX = 0;
        mPosY = 0;
        mWidth = 100;
        mHeight = 100;
    }
    
    public MyRectangle(int x, int y, int width, int height){
        mPosX = x;
        mPosY = y;
        mWidth = width;
        mHeight = height;
    }
    
    public void display(){
        System.out.println("(" + mPosX + "," + mPosY + ")" + "\nWidth = " + mWidth + "\nHeight = " + mHeight);
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
    
    public int getWidth(){
        return mWidth;
    }
    public void setWidth(int w){
        mWidth = w;
    }
    
    public int getHeight(){
        return mHeight;
    }
    public void setHeight(int h){
        mHeight = h;
    }
    
    public int acreageRectangle(){
        int acreage;
        acreage = mWidth*mHeight;
        return acreage;
    }
}