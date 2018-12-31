/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VongLap;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * 
 */
public class Bai4 {
    public static void main(String[] args) {
        int n;
        int i = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }        
    }
}
