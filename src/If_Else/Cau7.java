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
 * ERROR
 * 
 * Viết chương trình nhập 3 số (int) a, b, c là 3 cạnh của một tam giác. In ra màn hình là tam giác gì? (cân, đều, vuông, vuông cân, tam giác thường, không phải tam giác)
	Hướng dẫn: Sử dụng lớp Math.xxx() để sử dụng các hàm sẳn
	Ví dụ: Math.sqrt(123) tính căn bậc 2 của số 123	

 */
public class Cau7 {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh a: ");
        a = scanner.nextInt();
        System.out.print("Canh b: ");
        b = scanner.nextInt();
        System.out.print("Canh c: ");
        c = scanner.nextInt();
        
        if((a + b > c) && (a + c > b) && (b + c > a)){            
            if(a == b && a == c){
                System.out.println("Tam giac deu");
            }else if((a == b && a != c && b != c) | (a == c && a != b && c != b) | (b == c && b != a && c != a)){
                if((c*c == a*a + b*b) && (a*a == b*b + c*c) && (b*b == a*a + c*c)){
                    System.out.println("Tam giac vuong can");
                }else{
                    System.out.println("Tam giac can");
                }
            }else{
                System.out.println("Tam giac thuong");
            }            
        }else{
            System.out.println("Khong phai tam giac");
        }
    }
}
        /*
        if(a > 0 && b > 0 && c > 0){
            if(a == b && a == c){
                System.out.println("Tam giac deu");
            }else if((a == b && a != c && b != c) | (a == c && a != b && c != b) | (b == c && b != a && c != a)){
                if((c*c == a*a + b*b) && (a*a == b*b + c*c) && (b*b == a*a + c*c)){
                    System.out.println("Tam giac vuong can");                    
                }else{
                    System.out.println("Tam giac can");
                }
            }else if(a != b && a != c && b != c){
                System.out.println("Tam giac thuong");
            }else if((c*c == a*a + b*b) && (a*a == b*b + c*c) && (b*b == a*a + c*c)){
                System.out.println("Tam giac vuong");
            }
        }else{
            System.out.println("Khong phai tam giac");
        }
    }    
}
*/