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
 * Nhập 3 điểm toán lý hoá, tính trung bình, kết luận yếu, trung bình, khá, giỏi
 */
public class Ex {
    public static void main(String[] args) {
        double m, p, c;
        double average;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Math: ");
        m = scanner.nextDouble();
        System.out.print("Chemistry: ");
        c = scanner.nextDouble();
        System.out.print("Physic: ");
        p = scanner.nextDouble();
        
        average = (m + p + c)/3;
                
        if(m >= 6 && m < 7){
            System.out.println("Hoc Sinh Trung Binh");
        } else if(m >= 7 && m < 8){
            System.out.println("Hoc Sinh Kha");
        } else if(m >= 8 && m <= 10){
            System.out.println("Hoc Sinh Gioi");
        }else {    
            System.out.println("Hoc Sinh Yeu");
        }        
    }    
}
