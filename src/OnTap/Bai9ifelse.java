/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết một chương trình nhập 3 số nguyên và tìm giá trị nhỏ nhất.
 */
public class Bai9ifelse {
    public static Scanner sc = new Scanner(System.in);
    public static int min (int a, int b, int c){
        int min;
        
        min = a;
        
        if(min > c){
            min = c;
        }else if(min > b){
            min = b;
        }        
        return min;
    }
    public static void main(String[] args) {
        int a, b, c;        
        
        System.out.print("Number a: ");
        a = sc.nextInt();
        System.out.print("Number b: ");
        b = sc.nextInt();
        System.out.print("Number c: ");
        c = sc.nextInt();
        
        int min = min(a, b, c);
        
        System.out.print("So nho nhat la: " + min);
    } 
}
