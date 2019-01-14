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
 * Nhập số nguyên n > 100. Viết hàm kiểm tra các chữ số của số nguyên dương n có giảm
dần từ trái sang phải hay không
 */
public class Bai17 {
    public static boolean isReductionLeftToRight(int a){
        int after = a%10;
        a /= 10;
        for(;a != 0;a /= 10){
            int before = a%10;
            if(before >= after){
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
        
        if(isReductionLeftToRight(n)){
            System.out.println(n + " Giam dan tu trai sang phai");
        }else{
            System.out.println(n + " Khong giam dan tu trai sang phai");
        }
    }
}