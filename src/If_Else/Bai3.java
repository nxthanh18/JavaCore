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
 * 3.	Viết chương trình nhập một số nguyên bất kỳ từ bàn phím và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 100.
 */
public class Bai3 {
    public static void main(String[] args) {
        int a;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number a: ");
        a = scanner.nextInt();
        
        if(a < 100){
            System.out.println("So a nho hon 100");
        }else if(a == 100){
            System.out.println("So a bang 100");
        }else{
            System.out.println("SO a lon hon 100");
        }
    }    
}
