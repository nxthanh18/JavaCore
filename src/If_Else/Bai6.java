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
 * 6.	Điểm học phần của môn Tin học được tính như sau: chuyên cần (20%), giữa kỳ (30%), cuối kỳ (50%). Và điểm học phần được xếp loại như sau:
●	điểm >=8.4		: Hạng A
●	7 <= điểm < 8.5	: Hạng B
●	5.5 <= điểm < 7	: Hạng C
●	4 <= điểm < 5.5	: Hạng D
●	điểm < 4		: Hạng F
	Viết chương trình nhập điểm môn Tin học và in ra cho người dùng biết điểm học phần môn này và xếp hạng gì?

 */
public class Bai6 {
    public static void main(String[] args) {
        float cc, gk, ck, hp;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Diem chuyen can: ");
        cc = scanner.nextFloat();
        System.out.print("Diem giua ky: ");
        gk = scanner.nextFloat();
        System.out.print("Diem cuoi ky: ");
        ck = scanner.nextFloat();
        
        hp = cc*20f/100 + gk*30f/100 + ck*50f/100;
        
        if (4 <= hp && hp < 5.5){
            System.out.println("Hang D");
        }else if(5.5 <= hp && hp < 7){
            System.out.println("Hang C");
        }else if(7 <= hp && hp < 8.5){
            System.out.println("Hang B");
        }else if(hp >= 8.5){
            System.out.println("Hang A");
        }else{
            System.out.println("Hang F");
        }
    }    
}
