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
 * 5.	Viết chương trình nhập vào một số nguyên là năm (ví dụ năm nay 2018). Kiểm tra số vừa nhập có phải là năm nhuận hay không? 
Biết rằng năm nhuận là:
●	Năm chia hết cho 4 nhưng không chia hết cho 100.
●	Hoặc năm chia hết cho 400.

 */
public class Bai5ifelse {
    public static Scanner sc = new Scanner(System.in);
    public static void leapYear(int a){
        if(((a % 4 == 0) && (a %  100  != 0) ) || (a%400 == 0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap year");
        }
    }
    public static void main(String[] args) {
        int a;
        
        System.out.print("Year: ");
        a = sc.nextInt();
        
        leapYear(a);
    }    
}
