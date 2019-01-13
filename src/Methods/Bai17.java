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
 * Nhập số nguyên n. Viết hàm kiểm tra các chữ số của số nguyên dương n có giảm
dần từ trái sang phải hay không
 */
public class Bai17 {
    public static boolean isDownNumber(int n){
        int temp = n%10;
        n /=10;
        for(;n > 0;n /= 10){
            if(temp < n%10){
                
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
        }while(n <= 0);
        
        System.out.println(isDownNumber(n));
    }
}
