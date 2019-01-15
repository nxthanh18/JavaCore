/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết chương trình nhập giá trị x sau tính giá trị của hàm số
        f(x) = 2x^2 + 5x + 9 nếu x >= 5
        f(x) = -2x^2 + 4x – 9 nếu x < 5
 */
public class Bai34 {
    public static int calculator(int x){
        int sum = 0;
        if(x >= 5){
            sum = 2*(x*x) + 5*x + 9;
        }else{
            sum = -2*(x*x) + 4*x - 9;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int x;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        x = sc.nextInt();
        
        System.out.println(calculator(x));
    }
}
