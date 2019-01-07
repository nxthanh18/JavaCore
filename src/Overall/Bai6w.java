/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

/**
 *
 * @author genharunari
 * 
 * Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
 */
public class Bai6w {
    public static void main(String[] args) {
        int n = 0;
        
        while(n < 100){
            if(n%2 == 1 && n != 5 && n != 7 && n != 93){
                System.out.println("n = " + n);
            }
            n++;
        }
    }
}
