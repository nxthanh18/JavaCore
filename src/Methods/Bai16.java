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
 * Nhập số nguyên n > 100. Viết hàm kiểm tra các chữ số của số nguyên dương n có tăng
dần từ trái sang phải hay không
 */
public class Bai16 {
    public static boolean isIncreaseLeftToRight(int a){
        int after = a%10;
        a /= 10;
        for(;a != 0;a /= 10){
            int before = a%10;
            if(before <= after){
                after = before;
            }else{
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 100);
        
        if(isIncreaseLeftToRight(n)){
            System.out.println(n + " Tang dan tu trai sang phai");
        }else{
            System.out.println(n + " Khong tang dan tu trai sang phai");
        }
    }
}
