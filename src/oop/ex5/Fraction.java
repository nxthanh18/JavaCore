/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex5;

/**
 *
 * @author genharunari
 * 5. Xây dựng lớp phân số (Fraction) có
Thuộc tính: tử số và mẫu số
Phương thức :
Hàm dựng
Hàm set/get cho mỗi thuộc tính
Rút gọn phân số
Nghịch đảo phân số
add, sub, mul, div: tương ứng là hàm cộng, trừ, nhân, chia 2 phân số
Viết hàm 1 class có chứa main() để kiểm tra các phương thức của lớp vừa tạo
 */
public class Fraction {
    private int numerator, denominator;
    private static int count;
    
    public Fraction(){
        numerator = 1;
        denominator = 1;
        count++;
    }
    
    public Fraction(int n, int d){
        numerator = n;
        denominator = d;
        count++;
    }
    
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int n){
        numerator = n;
    }
    
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int d){
        denominator = d;
    }
    
    public void displayFration(){
        System.out.println("Fraction: " + numerator + "/" + denominator);
    }
    
    public void inverse(){
        System.out.println("Inverse Number: " + denominator + "/" + numerator);
    }
    
    public static int getCount(){
        return count;
    }
    
    public int greatestCommonDivisor(int a,int b){
        if ((a == 0) || (b == 0))
            return a + b;
        while(a != b)
        {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    
    public void irreducibleFraction(){
        int i = greatestCommonDivisor(numerator, denominator);
        numerator = numerator/i;
        denominator = denominator/i;        
        System.out.println("Irreducible Fraction: " + numerator + "/" + denominator);
    }
    
    public int add(){
        int sum;
        sum = numerator + denominator;
        return sum;
    }    
    
    public int sub(){
        int sub;
        sub = numerator - denominator;
        return sub;
    }
    
    public int mul(){
        int mul;
        mul = numerator * denominator;
        return mul;
    }
    
    public float div(){
        float div;
        div = (float) numerator / denominator;
        return div;
    }
}
