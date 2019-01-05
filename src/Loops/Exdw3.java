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
public class Exdw3 {
    public static void main(String[] args) {
        int n;        
        Scanner scanner = new Scanner(System.in);
        
        do{            
            System.out.println("---------- MENU ----------");
            System.out.println("1. Chuc nang 1");
            System.out.println("2. Chuc nang 2");
            System.out.println("3. Chuc nang 3");
            System.out.println("0. Thoat");
            System.out.print("Chon Chuc Nang: ");
            n = scanner.nextInt();
            
            switch(n){
                case 1:
                    System.out.println("Ban vua chon chuc nang 1");
                    System.out.println("----------------------------");
                    break;
                case 2:
                    System.out.println("Ban vua chon chuc nang 2");
                    System.out.println("----------------------------");
                    break;
                case 3:               
                    System.out.println("Ban vua chon chuc nang 3");
                    System.out.println("----------------------------");
                    break;
                case 0:
                    System.out.println("Tam biet!!!");
                    break;
                default:
                    System.out.println("Ban da chon sai chuc nang!!!");
                    System.out.println("----------------------------");
            }
        }while(n != 0);
    }
}
