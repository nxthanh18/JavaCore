/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết chương trình tính:
n!! = 1 * 3 * 5 *… * n (nếu n lẻ)
= 2 * 4 * 6 * … *n (nếu n chẵn)
Ví dụ: n = 7 → n!! = 1 * 3 * 5 * 7 = 105
n = 6 → n!! = 2 * 4 * 6 = 48
 */
public class Bai6floop {
    public static void main(String[] args) {
        int n, gt = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        for(int i = n;i >= 1;i -= 2){
            gt *= i;
            System.out.println(i);            
        }
        System.out.println("Giai thua: " + gt);
    }
}
