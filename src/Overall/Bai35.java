/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 * Viết chương trình nhập ngày, tháng, năm. Tính xem ngày đó là ngày thứ bao nhiêu
trong năm
 */
public class Bai35 {
    public static int getDay(int month, int year){
        //int day = 0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if(((year%4 == 0) && (year%100  != 0)) || (year%400 == 0)){
                    //System.out.println("Leap Year");
                    return 29;
                }else{
                    //System.out.println("Not Leap Year");
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;         
        }
        return 0;
    }
    
    public static int getDayTh(int month, int year, int day){
        for(int i = 1; i < month; i++){
            day += getDay(month, year);
        }
        return day;
    }
    
    //1/3/2018 = 31 + 28 +1
    public static void main(String[] args) {
        byte day, month;
        int year;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Day: ");
            day = scanner.nextByte();
            if(day <= 0 && day > 31){
                System.out.println("Nhap ngay sai !!!");
            }
            System.out.print("Month: ");
            month = scanner.nextByte();
            if(month <= 0 && month > 12){
                System.out.println("Nhap thang sai !!!");
            }
            System.out.print("Year: ");
            year = scanner.nextInt();
        }while(day <= 0 && day > 31 && month <= 0 && month > 12);
        System.out.println("So ngay trong nam = " + getDayTh(month, year, day));
    }
}
