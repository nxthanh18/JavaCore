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
 * Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25
 */
public class Bai15f {
    public static void main(String[] args) {
        int n, max = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        for(int i = 1;i < n;i++){
            if(n%i == 0){
                if(i%2 == 1){
                    max = i;
                }
            }
        }
        System.out.println("Uoc so le lon nhat cua " + n + " = " + max);
    }
}
