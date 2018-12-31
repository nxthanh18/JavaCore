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
 */
public class Bai3w {
    public static void main(String[] args) {
        int n, sumc = 0, suml = 0;
        int i = 1;       
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        while(i <= n){
            if(i % 2 == 0){
                sumc += i;
            }else{
                suml += i;
            }
            i++;
        }
        System.out.println("Sum chan: " + sumc);
        System.out.println("Sum le: " + suml);
    }    
}
