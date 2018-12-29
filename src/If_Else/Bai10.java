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
 * Bạn có thời gian rảnh và đi làm thêm cho một cửa hàng tạp hóa. Bạn được nhận tiền hoa hồng dựa vào doanh số bán hàng như sau:
●   5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
●   10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
●   20 % nếu tổng doanh số là lớn hơn 300 triệu.
    Viết chương trình nhập vào tổng doanh số bạn bán được và tính số tiền hoa hồng bạn nhận được.

 */
public class Bai10 {
    public static void main(String[] args) {
        double a, b;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tong doanh so ban hang la: ");
        a = scanner.nextDouble();
        
        if(a <= 100000000){            
            b = 5*a/100;            
        }else if(a <= 300000000){
            b = 10*a/100;
        }else{
            b = 20*a/100;            
        }
        System.out.println("Tien hoa hong la: " +b);
    }    
}
