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
 * Nhập số nguyên n (0< n <=10 ). Viết hàm tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
 */
public class Bai2 {
    public static int sum(int n){
        int sum = 0, e = 1;
        for(int i = 1;i <= n;i++){
            e *= i;
            sum += e;            
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        System.out.println(sum(n));
    }
}
