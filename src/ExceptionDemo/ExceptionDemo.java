/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDemo;

import java.util.Scanner;

/**
 *
 * @author genharunari
 * 
 */
public class ExceptionDemo {
    
    //throws: định danh ngoại lệ
    private static float div(int a, int b)throws Exception{
        if(b == 0){
            Exception c = new Exception("Loi chia 0");
            //throw: ném đi ngoại lệ
            throw c;
        }
        return a*1.0f/b;
    }
    
    public int inputNumber(){
        int n;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("n = ");
            String strNum = sc.nextLine();
            try{
                n = Integer.parseInt(strNum);
                return n;
            }catch(NumberFormatException c){
                System.out.println("Nhap sai, vui long nhap lai");
            }
        }
        System.out.println("So vua nhap: " + a);
    }
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("n = ");
            String strNum = sc.nextLine();
            try{
                a = Integer.parseInt(strNum);
                break;
            }catch(NumberFormatException c){
                System.out.println("Nhap sai, vui long nhap lai");
            }
        }
        System.out.println("So vua nhap: " + a);
        
        try{
            float result = div(100, a);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
