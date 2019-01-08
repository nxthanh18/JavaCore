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
 * Cho số nguyên dương n. Kiểm tra xem n có phải là số hoàn hảo hay không.
Số hoàn hảo là số có tổng tất cả các ước bé hơn bé hơn n bằng chính nó. Ví dụ 6 là
số hoàn hảo, vì 6 có các ước là 1, 2, 3. Và tổng 1 + 2 +3 = 6
 */
public class Bai16f {
    public static void main(String[] args) {
        int n, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print("n = ");
            n = scanner.nextInt();
        }while(n < 1);
        
        for(int i = 1; i < n; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println(n + " la so hoan hao");
        }else{
            System.out.println(n + " khong la so hoan hao");
        }
    }
}
