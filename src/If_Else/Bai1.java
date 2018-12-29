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
 * 1.	Viết chương trình nhập vào một số kiểu số nguyên. In ra kết quả số đó là số chẵn hay số lẻ
 */
public class Bai1 {
    public static void main(String[] args) {
        int a;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("So a: ");
        a = scanner.nextInt();
        if(a%2 == 1){
            System.out.println("So " + a + " la so le ");
        }else{
            System.out.println("So a" + a + " la so chan ");
        }
    }
}
