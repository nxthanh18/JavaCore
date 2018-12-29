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
 *  Nhà bạn hàng tháng phải đóng tiền điện và được tính như sau:
●   Từ 0 - 50 kwh				đơn giá 1 480 vnđ/kwh
●   Từ 51 kwh trở đi đến 100 kwh 		đơn giá 1 500 vnđ/kwh
●   Từ 101 kwh trở đi đến 200 kwh 		đơn giá 1 700 vnđ/kwh
●   Từ 201 kwh trở lên		 		đơn giá 2 800 vnđ/kwh
    Viết chương trình nhập vào tổng số kwh điện đã dùng và tính số tiền phải trả? 	

 */
public class Bai11 {
    public static void main(String[] args) {
        double a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tong KWh da dung thang vua roi la: ");
        a = scanner.nextDouble();
        
        if(a <= 50){
            b = 1480;
            c = b*a;                
        }else if(a <=100){
            b = 1500;
            c = 50*1480 + (a-50)*b;            
        }else if(a <= 200){
            b = 1700;
            c = 50*1480 + 50*1500 + (a-100)*b;            
        }else{
            b = 2800;
            c = 50*1480 + 50*1500 + 100*1700 + (a-200)*b;
        }        
        System.out.println("So tien dien phai tra la: " + c);          
    }
}
