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
 * 7.	Chương trình dự báo thời tiết dựa vào nhiệt độ và có tiêu chí sau:
●	Nhiệt độ < 10: thời tiết rất lạnh
●	Nhiệt độ 10-20: thời tiết lạnh
●	Nhiệt độ 20-30: thời tiết bình thường
●	Nhiệt độ 30-40: thời tiết nóng
●	Nhiệt độ >= 40: thời tiết rất nóng
Viết chương trình nhập vào nhiệt độ hiện tại. Thông báo cho người dùng biết là thời tiết đó như thế nào?

 */
public class Bai7ifelse {
    public static Scanner sc = new Scanner(System.in);
    public static void nhietDo(int a){
        
        if(a < 10){
            System.out.println("Thoi tiet rat lanh");
        }else if(a >= 10 && a < 20){
            System.out.println("Thoi tiet lanh");
        }else if(a >= 20 && a < 30){
            System.out.println("Thoi tiet binh thuong");
        }else if(a >= 30 && a < 40){
            System.out.println("Thoi tiet nong");
        }else if(a >= 40){
            System.out.println("Thoi tiet rat nong");
        }
    }
    public static void main(String[] args) {
        short a;
                
        System.out.print("Nhiet do can do: ");
        a = sc.nextShort();
        
        nhietDo(a);
    }
}
