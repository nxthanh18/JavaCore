/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;  

import java.util.Scanner;

/**
 *
 * @author genharunari
 */
public class Ex2 {
    public static void main(String[] args) {
        int m, y;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month: ");
        m = scanner.nextInt();
        System.out.print("Year: ");
        y = scanner.nextInt();
        
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(m + "/" + y + " Has 31 Days");
                break;
            case 2:
                if(((y % 4 == 0) && (y %  100  != 0) ) || (y%400 == 0)){
                    //System.out.println("Leap Year");
                    System.out.println(m + "/" + y + " Has 29 Day");
                }else{
                    //System.out.println("Not Leap Year");
                    System.out.println(m + "/" + y + " Has 28 Day");
                }break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Day");
                break;
            default:
                System.out.println("UNKNOW");
        }
    }    
}
