/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_Else;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết một chương trình nhập 3 số nguyên và tìm giá trị lớn nhất.
 */
public class Bai8 {
    public static void main(String[] args) {
        int a, b, c, max;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("So a: ");
        a = scanner.nextInt();
        System.out.print("So b: ");
        b = scanner.nextInt();
        System.out.print("So c: ");
        c = scanner.nextInt();
        
        max = a;
                
        if(max < c){
            max = c;
        }else if(max < b){
            max = b;
        }        
            System.out.println("So lon nhat la: " + max);
    }
}
