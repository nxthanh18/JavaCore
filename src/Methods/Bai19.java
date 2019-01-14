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
 * Liệt kê tất cả các số chính phương nhỏ hơn n(Sử dụng hàm kiểm tra số chính
phương)
 */
public class Bai19 {    
    public static boolean isSquareNumber(int a){
        int temp = (int) Math.sqrt(a);        
//        if((temp*temp) == a){
//            return true;
//        }
//        return false;
        return (temp*temp) == a;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
            if(n <= 0){
                System.out.println("Nhap n > 0 !!!");
            }
        }while(n <= 0);
        
        for(int i = 0;i < n;i++){
            if(isSquareNumber(i)){
                System.out.print(i + " ");
            }
        }        
    }
}
