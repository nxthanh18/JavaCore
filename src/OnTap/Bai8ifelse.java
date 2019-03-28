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
 * Viết một chương trình nhập 3 số nguyên và tìm giá trị lớn nhất.
 */
public class Bai8ifelse {
    public static Scanner sc = new Scanner(System.in);
    public static int max(int a, int b, int c){        
        int max;
        
        max = a;
        
        if(max < c){
            max = c;
        }else if(max < b){
            max = b;
        }
        return max;
    }
    public static void main(String[] args) {
        int a, b, c;
                        
        System.out.print("Number a: ");
        a = sc.nextInt();
        System.out.print("Number b: ");
        b = sc.nextInt();
        System.out.print("Number c: ");
        c = sc.nextInt();
        
        int max = max(a, b, c);
        
        System.out.println("So lon nhat la: " + max);
    }
}
