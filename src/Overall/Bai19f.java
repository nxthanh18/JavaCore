/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Nhập số nguyên n. Hãy đếm số lượng chữ số của số nguyên dương n
 * 
 * số lượng chữ số của một số nguyên n bằng logarit cơ số 10 cộng với một.
 */
public class Bai19f {
    public static void main(String[] args) {
        int n, count = 0;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 0);
        
        for(;n > 0;n /= 10){
            count++;
        }
        System.out.println("So cac chu so = " + count);
    }
}
