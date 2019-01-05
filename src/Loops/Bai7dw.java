/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author genharunari
 */
public class Bai7dw {
    public static void main(String[] args) {
        int i = 0;
        
        do{
            if(i%10 == 0 && i != 0){
                System.out.println(""); 
            }
            System.out.print(i + " ");
            i++;
        }while(i <= 99);
    }
}
