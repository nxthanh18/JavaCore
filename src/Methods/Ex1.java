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
 */
public class Ex1 {
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void print(){
        System.out.println("Hello methods");
    }
    
    // kiểm tra số nguyên tố
    
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        
        for(int i = 2;i <= (n/2); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 20, n;
        int c = add(a, b);
        
        System.out.println("Sum = " + c);
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        
        System.out.println(isPrimeNumber(n));
        
        print();
    }
}
