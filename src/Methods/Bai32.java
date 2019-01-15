/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author genharunari
 * 
 * Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000
 */
public class Bai32 {
    public static int searchMinNumber(){
        int i = 1, sum = 0;
        while(sum <= 10000){
            i++;
            sum += i;                      
        }        
        return i;
    }
    public static void main(String[] args) {
        System.out.println(searchMinNumber());
    }
}
