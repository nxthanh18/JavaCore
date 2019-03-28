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
 * 10.	Bạn có thời gian rảnh và đi làm thêm cho một cửa hàng tạp hóa. Bạn được nhận tiền hoa hồng dựa vào doanh số bán hàng như sau:
●	5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
●	10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
●	20 % nếu tổng doanh số là lớn hơn 300 triệu.
	Viết chương trình nhập vào tổng doanh số bạn bán được và tính số tiền hoa hồng bạn nhận được.

 */
public class Bai10ifelse {
    public static Scanner sc = new Scanner(System.in);
    public static double money(double a){
        double b;
        
        if(a <= 100000000){
            b = a*5/100;
        }else if(a <= 300000000){
            b = a*10/100;
        }else{
            b = a*20/100;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.print("Tong doanh so ban hang cua tap hoa: ");
        double a = sc.nextDouble();
        
        double money = money(a);
        System.out.println("So tien hoa hong nhan duoc la: " + money);
    }
}
