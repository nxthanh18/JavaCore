/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_Else;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết một chương trình nhập 3 số nguyên và tìm giá trị nhỏ nhất.
 */
public class Bai9 {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("So a: ");
        a = scanner.nextInt();
        System.out.print("So b: ");
        b = scanner.nextInt();
        System.out.print("So c: ");
        c = scanner.nextInt();
        
        if(a > c && b > c){
            System.out.println("So nho nhat la: " + c);
        }else if(a > b && c > b){
            System.out.println("So nho nhat la: " + b);
        }else if(b > a && c > a){
            System.out.println("So nho nhat la: " + a);
        }                
    }    
}
