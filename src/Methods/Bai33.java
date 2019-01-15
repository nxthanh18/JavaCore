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
 * Nhập số nguyên N. Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 +
2 + … + m < N
 */
public class Bai33 {
    public static int searchMaxNumber(int n){
        int i = 1, sum = 0;
        while(sum < n){
            i++;
            sum += i;
        }
        return i - 1;
    }
    
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n <= 0);
        
        System.out.println(searchMaxNumber(n));
    }
}
