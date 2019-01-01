/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.Scanner;

/**
 *
 * @author genharunari
 */
public class Bai4f {
    public static void main(String[] args) {
        int n;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        for(int i = 1; i <= 10; i ++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
