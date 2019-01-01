/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author genharunari
 * 
 * Hãy dùng vòng lặp while để tìm ra các số nguyên tố trong dãy số nguyên từ 1 đến 100 và in chúng ra console.

Lưu ý số nguyên tố là các số chỉ chia hết cho 1 và chính nó. Ví dụ như số 2, 3, 5, 7, 11, 13,…
 */
public class Prime {
    public static void main(String[] args) {
        int number = 1; // Các số tăng dần từ 1 đến 100 để kiểm tra
        
        while (number <= 100) {
            int count = 0; // Đếm số lượng số mà number chia hết, luôn phải khởi tạo là 0
            int j = 1; // Biến chạy từ 1 đến number để kiểm tra
            while (j <= number) {
                if (number % j == 0) {// Tìm thấy một số mà number chia hết, tăng biến đếm lên 1 để đếm            
                count++;
                }
                j++; // Nhớ dòng này
            }
            if (count == 2) {
            // Nếu count là 2, tức là số đó chỉ chia hết cho 2 số là 1 và chính nó
                System.out.println(number);
                }
                number++; // Nhớ tăng number để kiểm tra số tiếp theo
        }
    }
}
